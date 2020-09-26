package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.StudentMapper;
import cn.kgc.ssm.pojo.Classes;
import cn.kgc.ssm.pojo.Student;
import cn.kgc.ssm.pojo.StudentExample;
import cn.kgc.ssm.service.ClassesService;
import cn.kgc.ssm.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-09-26 15:05
 */
@Transactional
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentMapper studentMapper;

    @Resource
    ClassesService classesService;

    @Override
    public List<Student> sList() {
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        List<Student> students = studentMapper.selectByExample(example);
        for (Student student : students) {
            List<Classes> classes = classesService.cList(student.getClassid());
            student.setClassName(classes.get(0).getName());
        }
        return students;
    }

    @Override
    public int ins(Student student) {
        int i = studentMapper.insertSelective(student);
        return i;
    }
}
