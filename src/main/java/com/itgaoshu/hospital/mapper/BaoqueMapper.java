package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Baoque;
import com.itgaoshu.hospital.bean.BaoqueExample;
import com.itgaoshu.hospital.bean.Drugstore;
import com.itgaoshu.hospital.bean.Pharmacy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaoqueMapper {
    List<Baoque> queryList();
    int countByExample(BaoqueExample example);
    int selectCount(Baoque baoque);
    int updateNum(Baoque baoque);
    int deleteByExample(BaoqueExample example);

    int deleteByPrimaryKey(Integer baoqueid);

    int insert(Baoque record);

    int insertSelective(Baoque record);

    List<Baoque> selectByExample(BaoqueExample example);

    Baoque selectByPrimaryKey(Integer baoqueid);

    int updateByExampleSelective(@Param("record") Baoque record, @Param("example") BaoqueExample example);

    int updateByExample(@Param("record") Baoque record, @Param("example") BaoqueExample example);

    int updateByPrimaryKeySelective(Baoque record);

    int updateByPrimaryKey(Baoque record);

    int delbaoquenamenum();
    int selbaoquenamenum(Drugstore drugstore);
    int upbaoquenumber(Drugstore drugstore);
    int upbaoquenumber1(Pharmacy pharmacy);

}