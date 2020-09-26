package com.kgc.zjh.service;

import com.kgc.zjh.pojo.Student;

import java.util.List;

public interface StudentService {

    public List<Student> selectAll();

    void insert(Student student);
}
