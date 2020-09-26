package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Classes;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-09-26 15:07
 */
public interface ClassesService {

    List<Classes> cList(Long classId);

    List<Classes> cList2();
}
