package cn.kgc.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id;

    private String name;

    private Long age;

    private String gender;

    private String telephone;

    private String email;

    private Long classid;

    private String className;

}