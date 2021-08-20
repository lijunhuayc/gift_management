package com.ljh.cash.gift_management.domain.model;

import lombok.Data;

/**
 * Description:
 * Author: herily
 * Date: 16:00 2019/11/7
 */
@Data
//@Table(name = "user")
public class UserModel {
//    @Column(name = "id", type = MySqlTypeConstant.INT, length = 11, isKey = true, isAutoIncrement = true)
    public Long id;
//    @Column(name = "name", type = MySqlTypeConstant.VARCHAR, length = 32)
    public String name;
//    @Column(name = "age", type = MySqlTypeConstant.INT, length = 1)
    public Integer age;
//    @Column(name = "sex", type = MySqlTypeConstant.INT, length = 1)
    public Integer sex;
//    @Column(name = "email", type = MySqlTypeConstant.VARCHAR, length = 64)
    public String email;
//    @Column(name = "address", type = MySqlTypeConstant.VARCHAR, length = 64)
    public String address;
//    @Column(name = "school_id", type = MySqlTypeConstant.INT, length = 11)
    public Long school_id;

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
