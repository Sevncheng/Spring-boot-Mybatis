package com.service.impl;


import com.dao.StudentDao;
import com.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAllStudent() {
        return studentDao.findAll();
    }

    @Override
    public void insertStudent(Student student) {
        studentDao.insert(student);
    }
}
