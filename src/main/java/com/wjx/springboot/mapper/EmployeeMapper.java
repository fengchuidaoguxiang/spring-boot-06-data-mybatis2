package com.wjx.springboot.mapper;

import com.wjx.springboot.bean.Employee;

public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    void insertEmp(Employee employee);
}
