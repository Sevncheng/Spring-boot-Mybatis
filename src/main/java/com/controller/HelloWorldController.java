package com.controller;

import com.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
public class HelloWorldController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/addTest")
    public String addTest(HttpServletRequest request, HttpServletResponse response) {
        int a = (int) (Math.random()*5);
        Student s = new Student();
        s.setName("测试"+a);
        s.setAge(a);
        studentService.insertStudent(s);
        return "success";
    }

    @RequestMapping("/findTest")
    public List<Student> findTest(HttpServletRequest request, HttpServletResponse response) {
        List<Student> list = studentService.findAllStudent();
        return list;
    }
}