package cn.kgc.ssm.controller;

import cn.kgc.ssm.pojo.Classes;
import cn.kgc.ssm.pojo.Student;
import cn.kgc.ssm.service.ClassesService;
import cn.kgc.ssm.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 李锡良
 * @create 2020-09-26 15:16
 */
@Controller
public class StudentController {

    @Resource
    StudentService studentService;

    @Resource
    ClassesService classesService;

    @RequestMapping("/")
    public String toIndex(){
        return "/jsp/index";
    }

    @RequestMapping("/doIndex")
    @ResponseBody
    public Map<String,Object> doIndex(){
        Map<String,Object> map = new HashMap<>();
        List<Student> students = studentService.sList();
        map.put("data",students);
        return map;
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return  "/jsp/add";
    }

    @RequestMapping("/doAdd2")
    @ResponseBody
    public Map<String,Object> doAdd2(){
        Map<String,Object> map = new HashMap<>();
        List<Classes> classes = classesService.cList2();
        map.put("data",classes);
        return map;
    }

    @RequestMapping("/doAdd")
    public String doAdd(Student student, Model model){
        int ins = studentService.ins(student);
        if (ins>0){
            return "/jsp/index";
        }else{
            model.addAttribute("errot","添加失败");
            return "redirect:/toAdd";
        }
    }

}
