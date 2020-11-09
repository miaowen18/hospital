package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.*;
import com.itgaoshu.hospital.mapper.ProjecttypeMapper;
import com.itgaoshu.hospital.service.ZhuYuanService;
import com.itgaoshu.hospital.service.impl.PharmacyServiceImpl;
import com.itgaoshu.hospital.service.impl.RecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ZhuYuanController {
    @Autowired
    private ZhuYuanService zhuYuanService;
    @Autowired
    private RecordServiceImpl recordService;

    @RequestMapping("liao/admin")
    public String inadmin(){
        return "liao/admin";
    }
    @RequestMapping("liao/pay")
    public String inpay(){
        return "liao/pay";
    }
    @RequestMapping("liao/drug")
    public String indrug(){
        return "liao/drug";
    }
    @RequestMapping("liao/item")
    public String initem(){
        return "liao/item";
    }
    @RequestMapping("liao/leave")
    public String inleave(){
        return "liao/leave";
    }
    @RequestMapping("liao/pharmacy")
    public String pharmacy(){
        return "liao/pharmacy";
    }
   /* @RequestMapping("toRegisteredType")
    public String registeredType(){
        return "view/center/registeredType";
    }*/
   /* @RequestMapping("toProjectTypeManage")
    public String projectTypeManage(){
        return "view/center/projectTypeManage";
    }
*/

    //查询患者信息
    @RequestMapping("liao/selRegister")
    @ResponseBody
    public Object select(int page,int limit,Register register){
        register.setState(0);
        //分页查询
        PageHelper.startPage(page,limit);
        //查询未出院的患者信息
        List<Register> selreg=zhuYuanService.select(register);
        //把查到的信息放入分页插件中
        PageInfo pageInfo = new PageInfo(selreg);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        //把数据返回到layui中
        return tableData;
    }
    //查询门诊传过来的信息
    @RequestMapping("liao/selDoor")
    @ResponseBody
    public Object select2(int page,int limit){
        //分页查询
        PageHelper.startPage(page,limit);
        //查询未出院的患者信息
        List<Register> selreg=zhuYuanService.select2();
        //把查到的信息放入分页插件中
        PageInfo pageInfo = new PageInfo(selreg);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        //把数据返回到layui中
        return tableData;
    }
    //增加患者
    @RequestMapping("liao/addRegister")
    @ResponseBody
    public Object insert(Register register, HttpServletRequest request){
        //获取床位价格
        Double price=zhuYuanService.selectPrice(register.getBedId());
        register.setPrice(price);
        //获取管理人员姓名
        String yonghu = (String)request.getSession().getAttribute("yonghu");
        register.setOperator(yonghu);
        System.out.println(register);
        int result=zhuYuanService.insert(register);
        if(result>0){
            //把入院的患者从门诊库中删除
            int r=zhuYuanService.deleteByPrimaryKey(register.getPhone());
            return "添加成功";
        }else{
            return "添加失败";
        }
    }
    //科室下拉框
    @RequestMapping("liao/selDepartment")
    @ResponseBody
    public Object select3(){
        return zhuYuanService.select3();
    }
    //医生下拉框
    @RequestMapping("liao/selDoctor")
    @ResponseBody
    public Object select4(Integer departmentId){
        return zhuYuanService.select4(departmentId);
    }
    //床位下拉框
    @RequestMapping("liao/selBed")
    @ResponseBody
    public Object select5(Integer departmentId){
        return zhuYuanService.select5(departmentId);
    }
    //医保下拉框
    @RequestMapping("liao/selDis")
    @ResponseBody
    public Object select6(){
        return zhuYuanService.select6();
    }

    //换科室
    @RequestMapping("")
    @ResponseBody
    public Object update(){
        return 45;
    }
    //查询已出院的患者信息
    @RequestMapping("liao/selRegisters")
    @ResponseBody
    public Object select7(int page,int limit,String userNames){
        //分页查询
        PageHelper.startPage(page,limit);
        Register register=new Register();
        register.setState(1);
        register.setUserName(userNames);
        List<Register> selreg=zhuYuanService.select(register);
        for(Register r:selreg){
            r.setPrices(r.getMoney()-r.getPrice());
        }
        PageInfo pageInfo = new PageInfo(selreg);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        //把数据返回到layui中
        return tableData;
    }
    //查询要结算的患者信息
    @RequestMapping("liao/selPay")
    @ResponseBody
    public Object select8(Register register,Double moneys){
        if(moneys!=0){
            register.setMoney(moneys);
            int r=zhuYuanService.updatePay(register);
            int r2=zhuYuanService.insertPay(register);
        }
        register.setState(0);
        List<Register> lists=zhuYuanService.select(register);
        return lists;
    }
    //查询交款信息
    @RequestMapping("liao/selPays")
    @ResponseBody
    public Object select9(Integer page,Integer limit){
        //分页查询
        PageHelper.startPage(page, limit);
        List<Pay> selreg = zhuYuanService.selectPay();
        PageInfo pageInfo = new PageInfo(selreg);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        //把数据返回到layui中
        return tableData;
    }
    //查询已用金额
    @RequestMapping("liao/selSurplus")
    @ResponseBody
    public Object select9(Register register,Double pay){
        return zhuYuanService.selectPay();
    }

   /* @RequestMapping("liao/selDrugs")
    @ResponseBody
    public Object selDrugs(Integer page, Integer limit, Hospitalprice hospitalprice){
        hospitalprice.setState(0);
        PageHelper.startPage(page,limit);
        List<Hospitalprice> list=recordService.selDrugs(hospitalprice);
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> map=new HashMap<>();
        map.put("msg","");
        map.put("code",0);
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }*/
    @RequestMapping("liao/selPhar")
    @ResponseBody
    public Object selPhar(Integer page,Integer limit,Hospitalprice hospitalprice){
        hospitalprice.setState(2);
        PageHelper.startPage(page,limit);
        List<Hospitalprice> list=recordService.selDrugs(hospitalprice);
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> map=new HashMap<>();
        map.put("msg","");
        map.put("code",0);
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //改变患者的药品状态
    @RequestMapping("liao/updDrug")
    @ResponseBody
    public Object updItem(Hospitalprice hospitalprice){
        System.out.println(hospitalprice);
        int upd = recordService.upd(hospitalprice);
        //System.out.println(upd);
        return "取药成功";
    }
    //查询药品selDrug
    @RequestMapping("liao/selDrug")
    @ResponseBody
    public Object select10(Integer page,Integer limit){
        //分页查询
        PageHelper.startPage(page, limit);
        Pharmacy pharmacy=new Pharmacy();
        List<Pharmacy> selreg = zhuYuanService.select10(pharmacy);
        PageInfo pageInfo = new PageInfo(selreg);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        //把数据返回到layui中
        return tableData;
    }
    //查询药品库存数量
    @RequestMapping("liao/selNum")
    @ResponseBody
    public Object selNum(Integer pharmacyid){
        Pharmacy pharmacy=new Pharmacy();
        pharmacy.setPharmacyid(pharmacyid);
        List<Pharmacy> listAll =zhuYuanService.select10(pharmacy);
        return listAll;
    }
    //查询用户使用的药品信息
    @RequestMapping("liao/selDrugs")
    @ResponseBody
    public Object select11(Integer page,Integer limit,Register register){
        //分页查询
        PageHelper.startPage(page, limit);
        register.setState(0);
        List<Hospitalprice> selreg = zhuYuanService.select11(register);
        PageInfo pageInfo = new PageInfo(selreg);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        //把数据返回到layui中
        return tableData;
    }
    //增加用户使用的药品并修改已用金额
    @RequestMapping("liao/addDrug")
    @ResponseBody
    public Object insertDrug(Hospitalprice hospitalprice){
        Integer i=hospitalprice.getDurgnum();
        Double d=hospitalprice.getRepiceprice();
        Double total=i*d;
        hospitalprice.setRepicetotal(total);
        hospitalprice.setState(0);
        int result=zhuYuanService.insertDrug(hospitalprice);
        if(result>0){
            //修改已用金额即总价
            Register register=new Register();
            register.setRegisterid(hospitalprice.getRegisterid());
            register.setPrice(hospitalprice.getRepicetotal());
            int r2=zhuYuanService.updatePrice(register);
            //修改库存
            int r=zhuYuanService.updateDrug(hospitalprice);
            return "添加成功";
        }else {
            return "添加失败";
        }
    }
    //查询项目
    @RequestMapping("liao/selItems")
    @ResponseBody
    public Object select12(Integer page,Integer limit) {
        Inoutpatienttype inoutpatienttype=new Inoutpatienttype();
        //分页查询
        PageHelper.startPage(page, limit);
        Pharmacy pharmacy = new Pharmacy();
        List<Inoutpatienttype> selreg = zhuYuanService.select12(inoutpatienttype);
        PageInfo pageInfo = new PageInfo(selreg);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        //把数据返回到layui中
        return tableData;
    }
    //查询用户使用的项目信息
    @RequestMapping("liao/selItem")
    @ResponseBody
    public Object select13(Integer page,Integer limit,Register register){
        //分页查询
        PageHelper.startPage(page, limit);
        register.setState(3);
        List<Hospitalprice> selreg = zhuYuanService.select11(register);
        PageInfo pageInfo = new PageInfo(selreg);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        //把数据返回到layui中
        return tableData;
    }
    //增加用户使用的项目并修改已用金额
    @RequestMapping("liao/addItem")
    @ResponseBody
    public Object insertInout(Hospitalprice hospitalprice){
        hospitalprice.setDurgnum(1);
        hospitalprice.setRepicetotal(hospitalprice.getRepiceprice());
        hospitalprice.setState(3);
        int result=zhuYuanService.insertDrug(hospitalprice);
        if(result>0){
            //修改已用金额即总价
            Register register=new Register();
            register.setRegisterid(hospitalprice.getRegisterid());
            register.setPrice(hospitalprice.getRepicetotal());
            int r3=zhuYuanService.updatePrice(register);
            return "添加成功了";
        }else {
            return "添加失败";
        }
    }
    //查询药品是否剩余
    @RequestMapping("liao/selYaos")
    @ResponseBody
    public Object select13(Register register) {
        register.setState(0);
        List<Hospitalprice> selreg = zhuYuanService.select11(register);
        return selreg;
    }
    //办理出院手续
    @RequestMapping("liao/updLeave")
    @ResponseBody
    public Object update3(Register register) {
        int result=zhuYuanService.updateState(register);
        if(result>0){
            return "成功出院";
        }else{
            return "出院失败";
        }
    }
    //办理出院手续
    @RequestMapping("liao/delDrug")
    @ResponseBody
    public Object delete3(Integer registerid,Double repicetotal,Integer hospitalpriceid,String durgname,Integer durgnum) {
        Hospitalprice h=new Hospitalprice();
        h.setHospitalpriceid(hospitalpriceid);
        int i=zhuYuanService.deleteDrug(h);
        if (i == 1) {
            h.setDurgname(durgname);
            h.setDurgnum(0-durgnum);
            int j = zhuYuanService.updateDrug(h);
            if (j == 1) {
                Register register=new Register();
                register.setRegisterid(registerid);
                register.setPrice(0-repicetotal);
                int z=zhuYuanService.updatePrice(register);
                return "移除成功";
            } else {
                return "移除失败";
            }
        } else {
            return "移除失败";
        }
    }
    //查询挂号类型
    @RequestMapping("registeredType/registeredTypeList")
    @ResponseBody
    public Object select14(Integer page,Integer limit) {
        //分页查询
        PageHelper.startPage(page, limit);
        List<Registeredtype> selreg =zhuYuanService.selectRegisteredType();
        PageInfo pageInfo = new PageInfo(selreg);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        //把数据返回到layui中
        return tableData;
    }
    //增加挂号类型
    @RequestMapping("registeredType/addRegisteredType")
    @ResponseBody
    public Object insert14(Registeredtype registeredtype) {
        int r=zhuYuanService.insertRegisteredType(registeredtype);
        if(r>0){
            return "增加成功";
        }else{
            return "增加失败";
        }
    }
    //修改挂号类型
    @RequestMapping("registeredType/editRegisteredType")
    @ResponseBody
    public Object update14(Registeredtype registeredtype) {
        int r=zhuYuanService.updateRegisteredType(registeredtype);
        if(r>0){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }

    //查询项目大类
    @RequestMapping("prjectType/findAllProjecttype")
    @ResponseBody
    public Object select15(Integer page,Integer limit) {
        //分页查询
        PageHelper.startPage(page, limit);
        List<Projecttype> selreg =zhuYuanService.select15();
        PageInfo pageInfo = new PageInfo(selreg);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        //把数据返回到layui中
        return tableData;
    }
    //增加项目大类
    @RequestMapping("prjectType/addProjecttype")
    @ResponseBody
    public Object insert15(Projecttype projecttype) {
        String projectName=projecttype.getProjectname();
        int r=zhuYuanService.insertProjectType(projectName);
        if(r>0){
            return "增加成功";
        }else{
            return "增加失败";
        }
    }
    //查询门诊收费项目
    @RequestMapping("prjectType/findAllOutpatienttype")
    @ResponseBody
    public Object select16(Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Outpatienttype> listAll = zhuYuanService.select16();
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());

        return tableData;
    }
    //查询住院收费项目
    @RequestMapping("prjectType/findAllInoutpatienttype")
    @ResponseBody
    public Object select17(Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Inoutpatienttype> listAll = zhuYuanService.select17();
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

}
