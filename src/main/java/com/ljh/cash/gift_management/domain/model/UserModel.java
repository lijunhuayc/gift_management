package com.ljh.cash.gift_management.domain.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

/**
 * Description:
 * Author: herily
 * Date: 16:00 2019/11/7
 */
@Data
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
}
