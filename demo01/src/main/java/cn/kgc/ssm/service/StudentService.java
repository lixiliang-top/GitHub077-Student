package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Student;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-09-26 15:05
 */
public interface StudentService {

    List<Student> sList();

    int ins(Student student);

}
