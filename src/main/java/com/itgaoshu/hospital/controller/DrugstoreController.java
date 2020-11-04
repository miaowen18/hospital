package com.itgaoshu.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/liao")
public class DrugstoreController {
   // @Autowired
    //private DrugstoreServiceImpl drugstoreService;


    /*@RequestMapping("/selNum")
    public Object selNum(Integer pharmacyId){
        DrugstoreVo drugstoreVo=new DrugstoreVo();
        drugstoreVo.setPharmacyId(pharmacyId);
        //List<DrugstoreVo> lists=drugstoreService.queryList(drugstoreVo);
        //System.out.println(lists);
        //return lists;
        return null;
    }*/
    //查询药品信息
    /*@RequestMapping("/selDrug")
    public Object selDrug(DrugstoreVo drugstoreVo,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
       // List<DrugstoreVo> lists=drugstoreService.queryList(drugstoreVo);
        //PageInfo pageInfo=new PageInfo(lists);
        Map<String,Object> map=new HashMap<>();
        //UI JSON数组
        map.put("msg","");
        map.put("code",0);

       // map.put("count",pageInfo.getTotal());
        //map.put("data",pageInfo.getList());
        return map;
    }*/

}
