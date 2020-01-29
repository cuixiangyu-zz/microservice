package com.cxy.api.model;

import java.io.Serializable;

/**
 * @program: microservice
 * @description: 用户
 * @author: CuiXiangYu
 * @create: 2020-01-28 09:47
 **/
public class User implements Serializable {

    private Integer id;
    private String name;
    private Integer age;
    private Integer sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
