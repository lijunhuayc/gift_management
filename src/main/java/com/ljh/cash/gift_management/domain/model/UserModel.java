package com.ljh.cash.gift_management.domain.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

/**
 * Description:
 * Author: herily
 * Date: 16:00 2019/11/7
 */
@Table(name = "user")
public class UserModel {
    @Column(name = "id", type = MySqlTypeConstant.INT, length = 11, isKey = true, isAutoIncrement = true)
    private Long id;
    @Column(name = "name", type = MySqlTypeConstant.VARCHAR, length = 32)
    private String name;
    @Column(name = "age", type = MySqlTypeConstant.INT, length = 1)
    private Integer age;
    @Column(name = "sex", type = MySqlTypeConstant.INT, length = 1)
    private Integer sex;
    @Column(name = "email", type = MySqlTypeConstant.VARCHAR, length = 64)
    private String email;
    @Column(name = "address", type = MySqlTypeConstant.VARCHAR, length = 64)
    private String address;
    @Column(name = "school_id", type = MySqlTypeConstant.INT, length = 11)
    private Long school_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getSchool_id() {
        return school_id;
    }

    public void setSchool_id(Long school_id) {
        this.school_id = school_id;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", school_id=" + school_id +
                '}';
    }
}
