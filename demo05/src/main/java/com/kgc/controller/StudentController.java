package com.kgc.controller;

import com.kgc.pojo.Classes;
import com.kgc.pojo.Student;
import com.kgc.service.ClassesService;
import com.kgc.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {

    @Resource
    StudentService studentService;

    @Resource
    ClassesService classesService;

    @RequestMapping("/")
    public String Index(Model model){
        List<Student> students = studentService.selectAll();
        model.addAttribute("Student",students);
        return "Index";
    }

    @RequestMapping("/add")
    public String add(Model model){
        List<Classes> classes = classesService.selectAll();
        model.addAttribute("Classes",classes);
        return "add";
    }

    @RequestMapping("insertStudent")
    public String insertStudent(Student student){
        studentService.insert(student);
        return "redirect:/";
    }
}
