package com.itgaoshu.hospital.mapper;

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
}
