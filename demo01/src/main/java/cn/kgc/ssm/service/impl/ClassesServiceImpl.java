package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.ClassesMapper;
import cn.kgc.ssm.pojo.Classes;
import cn.kgc.ssm.pojo.ClassesExample;
import cn.kgc.ssm.service.ClassesService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-09-26 15:12
 */
@Transactional
@Service("classesService")
public class ClassesServiceImpl implements ClassesService {

    @Resource
    ClassesMapper classesMapper;

    @Override
    public List<Classes> cList(Long classId) {
        ClassesExample example = new ClassesExample();
        ClassesExample.Criteria criteria = example.createCriteria();
        if (classId!=null){
            criteria.andIdEqualTo(classId);
        }
        List<Classes> classes = classesMapper.selectByExample(example);
        return classes;
    }

    @Override
    public List<Classes> cList2() {
        ClassesExample example = new ClassesExample();
        ClassesExample.Criteria criteria = example.createCriteria();
        List<Classes> classes = classesMapper.selectByExample(example);
        return classes;
    }
}
