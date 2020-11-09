package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Departments;
import com.itgaoshu.hospital.mapper.DepartmentMapper;
import com.itgaoshu.hospital.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Departments> departmentList(Departments departments) {
        return departmentMapper.departmentList(departments);
    }

    @Override
    public int deleteDepartment(Integer departmentId) {
        return departmentMapper.deleteDepartment(departmentId);
    }

    @Override
    public int addDepartment(Departments departments) {
        return departmentMapper.addDepartment(departments);
    }

    @Override
    public int count(Departments departments) {
        return departmentMapper.count(departments);
    }
}
