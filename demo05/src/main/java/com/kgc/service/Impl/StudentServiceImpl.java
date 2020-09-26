package com.kgc.service.Impl;


import com.kgc.mapper.StudentMapper;
import com.kgc.pojo.Student;
import com.kgc.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentservice")
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentMapper studentMapper;


    @Override
    public List<Student> selectAll() {
        return studentMapper.selectByExample(null);
    }

    @Override
    public void insert(Student student) {
        studentMapper.insertSelective(student);
    }
}
