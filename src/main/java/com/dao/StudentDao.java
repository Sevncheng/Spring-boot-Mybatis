package com.dao;

import com.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface StudentDao {

    public List<Student> findAll();

    public void insert(Student student);

}
