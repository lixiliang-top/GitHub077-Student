package com.kgc.service.Impl;


import com.kgc.mapper.ClassesMapper;
import com.kgc.pojo.Classes;
import com.kgc.service.ClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("classesService")
public class ClassesServiceImpl implements ClassesService {

    @Resource
    ClassesMapper classesMapper;

    @Override
    public List<Classes> selectAll() {
        return classesMapper.selectByExample(null);
    }
}
