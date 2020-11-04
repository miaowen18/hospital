package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Baoque;
import com.itgaoshu.hospital.bean.BaoqueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaoqueMapper {
    List<Baoque> queryList();
    int countByExample(BaoqueExample example);

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
}