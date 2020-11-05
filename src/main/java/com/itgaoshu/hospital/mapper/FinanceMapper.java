package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Finance;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FinanceMapper {

    @Select("SELECT SUM(repicetotal) FROM cashier c,report r WHERE DATE_FORMAT(ctime,'%Y%m')=CONCAT(#{year},'01') AND c.reportid=r.reportid AND r.state=2 UNION ALL " +
            "SELECT SUM(repicetotal) FROM cashier c,report r WHERE DATE_FORMAT(ctime,'%Y%m')=CONCAT(#{year},'02') AND c.reportid=r.reportid AND r.state=2 UNION ALL " +
            "SELECT SUM(repicetotal) FROM cashier c,report r WHERE DATE_FORMAT(ctime,'%Y%m')=CONCAT(#{year},'03') AND c.reportid=r.reportid AND r.state=2 UNION ALL " +
            "SELECT SUM(repicetotal) FROM cashier c,report r WHERE DATE_FORMAT(ctime,'%Y%m')=CONCAT(#{year},'04') AND c.reportid=r.reportid AND r.state=2 UNION ALL " +
            "SELECT SUM(repicetotal) FROM cashier c,report r WHERE DATE_FORMAT(ctime,'%Y%m')=CONCAT(#{year},'05') AND c.reportid=r.reportid AND r.state=2 UNION ALL " +
            "SELECT SUM(repicetotal) FROM cashier c,report r WHERE DATE_FORMAT(ctime,'%Y%m')=CONCAT(#{year},'06') AND c.reportid=r.reportid AND r.state=2 UNION ALL " +
            "SELECT SUM(repicetotal) FROM cashier c,report r WHERE DATE_FORMAT(ctime,'%Y%m')=CONCAT(#{year},'07') AND c.reportid=r.reportid AND r.state=2 UNION ALL " +
            "SELECT SUM(repicetotal) FROM cashier c,report r WHERE DATE_FORMAT(ctime,'%Y%m')=CONCAT(#{year},'08') AND c.reportid=r.reportid AND r.state=2 UNION ALL " +
            "SELECT SUM(repicetotal) FROM cashier c,report r WHERE DATE_FORMAT(ctime,'%Y%m')=CONCAT(#{year},'09') AND c.reportid=r.reportid AND r.state=2 UNION ALL " +
            "SELECT SUM(repicetotal) FROM cashier c,report r WHERE DATE_FORMAT(ctime,'%Y%m')=CONCAT(#{year},'10') AND c.reportid=r.reportid AND r.state=2 UNION ALL " +
            "SELECT SUM(repicetotal) FROM cashier c,report r WHERE DATE_FORMAT(ctime,'%Y%m')=CONCAT(#{year},'11') AND c.reportid=r.reportid AND r.state=2 UNION ALL " +
            "SELECT SUM(repicetotal) FROM cashier c,report r WHERE DATE_FORMAT(ctime,'%Y%m')=CONCAT(#{year},'12') AND c.reportid=r.reportid AND r.state=2")
    List<Double> selectAllTotalFinanceByYear(String year);

    @Select("SELECT SUM(price) FROM register WHERE DATE_FORMAT(endDate,'%Y%m')=CONCAT(#{year},'01') AND state=1 UNION ALL " +
            "SELECT SUM(price) FROM register WHERE DATE_FORMAT(endDate,'%Y%m')=CONCAT(#{year},'02') AND state=1 UNION ALL " +
            "SELECT SUM(price) FROM register WHERE DATE_FORMAT(endDate,'%Y%m')=CONCAT(#{year},'03') AND state=1 UNION ALL " +
            "SELECT SUM(price) FROM register WHERE DATE_FORMAT(endDate,'%Y%m')=CONCAT(#{year},'04') AND state=1 UNION ALL " +
            "SELECT SUM(price) FROM register WHERE DATE_FORMAT(endDate,'%Y%m')=CONCAT(#{year},'05') AND state=1 UNION ALL " +
            "SELECT SUM(price) FROM register WHERE DATE_FORMAT(endDate,'%Y%m')=CONCAT(#{year},'06') AND state=1 UNION ALL " +
            "SELECT SUM(price) FROM register WHERE DATE_FORMAT(endDate,'%Y%m')=CONCAT(#{year},'07') AND state=1 UNION ALL " +
            "SELECT SUM(price) FROM register WHERE DATE_FORMAT(endDate,'%Y%m')=CONCAT(#{year},'08') AND state=1 UNION ALL " +
            "SELECT SUM(price) FROM register WHERE DATE_FORMAT(endDate,'%Y%m')=CONCAT(#{year},'09') AND state=1 UNION ALL " +
            "SELECT SUM(price) FROM register WHERE DATE_FORMAT(endDate,'%Y%m')=CONCAT(#{year},'10') AND state=1 UNION ALL " +
            "SELECT SUM(price) FROM register WHERE DATE_FORMAT(endDate,'%Y%m')=CONCAT(#{year},'11') AND state=1 UNION ALL " +
            "SELECT SUM(price) FROM register WHERE DATE_FORMAT(endDate,'%Y%m')=CONCAT(#{year},'12') AND state=1")
    List<Double> selectAllZhuYuanFinanceByYear(String year);

    @Select("select sum(repicetotal) value, DATE_FORMAT(ctime,'%Y') name from cashier c , report r where c.reportid=r.reportid and r.state=2 group by name")
    List<Finance> reportYearBingFinance();

    @Select("select sum(price) value, DATE_FORMAT(endDate,'%Y') name from register where state=1 group by name")
    List<Finance> zhuYuanYearBingFinance();

    @Select("SELECT d.doctorName doctorName, COUNT(DISTINCT r.reportid) num,SUM(c.repicetotal) total FROM doctor d , report r , cashier c WHERE d.doctorid=r.doctor AND r.reportid=c.reportid AND r.state=2")
    List<Finance> doctorDuibi();

    @Select("SELECT d.doctorName doctorName, COUNT(DISTINCT r.reportid) num,SUM(c.repicetotal) total FROM doctor d , report r , cashier c WHERE d.doctorid=r.doctor AND r.reportid=c.reportid AND r.state=2 and doctorName like #{doctorName}")
    List<Finance> selectDoctorDuiBi(String doctorName);

    @Select("SELECT d.doctorName doctorName , SUM(r.price) total ,COUNT(r.registerId) num FROM doctor d , register r WHERE d.doctorid=r.doctor AND r.state=1")
    List<Finance> zDoctorDuibi();

    @Select("SELECT d.doctorName doctorName , SUM(r.price) total ,COUNT(r.registerId) num FROM doctor d , register r WHERE d.doctorid=r.doctor AND r.state=1 and doctorName like #{doctorName}")
    List<Finance> selectZDoctorDuiBi(String doctorName);

    @Select("SELECT durgname name ,SUM(repicetotal) value FROM cashier WHERE ctime=#{ctime} GROUP BY durgname")
    List<Finance> currentFinance(String ctime);
}
