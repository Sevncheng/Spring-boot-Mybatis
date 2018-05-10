package com.service;

import com.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAllStudent();

    public void insertStudent(Student student);

}
