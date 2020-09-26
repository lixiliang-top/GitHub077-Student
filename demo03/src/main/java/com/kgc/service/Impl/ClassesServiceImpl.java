package com.kgc.service.Impl;

import com.kgc.zjh.mapper.ClassesMapper;
import com.kgc.zjh.pojo.Classes;
import com.kgc.zjh.service.ClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("classesService")
public class ClassesServiceImpl implements ClassesService{

    @Resource
    ClassesMapper classesMapper;

    @Override
    public List<Classes> selectAll() {
        return classesMapper.selectByExample(null);
    }
}
