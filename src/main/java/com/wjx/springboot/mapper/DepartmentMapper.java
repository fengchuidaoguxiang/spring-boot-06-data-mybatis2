package com.wjx.springboot.mapper;

import com.wjx.springboot.bean.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

//指定这是一个操作数据库的mapper
//@Mapper
public interface DepartmentMapper {

    @Select("SELECT * FROM department WHERE id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("DELETE FROM department WHERE id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("INSERT department(department_name) VALUES(#{departmentName})")
    public int insertDept(Department department);

    @Update("UPDATE department SET department_name=#{departmentName} WHERE id=#{id}")
    public int update(Department department);
}
