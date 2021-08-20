package com.ljh.cash.gift_management.domain.mapper;

import com.ljh.cash.gift_management.domain.model.SchoolModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Description:
 * Author: herily
 * Date: 16:18 2019/10/10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SchoolMapperTest {

    @Autowired
    private SchoolMapper schoolMapper;

    @Test
    public void insert() throws Exception {
        int result = 0;
        List<SchoolModel> list = null;
        SchoolModel schoolModel = null;
        try {
//            result = schoolMapper.insert(new SchoolModel(null, "四川省大英中学", "四川省遂宁市大英县", null, null));
            result = schoolMapper.updateSchool(new SchoolModel(1L, "大英中学还原了", "四川省遂宁市新地址", "四川省啊", null));
//            list = schoolMapper.selectSchools();
//            list = schoolMapper.selectSchools2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("result = " + result);
        System.out.println("list = " + list);
        System.out.println("schoolModel = " + schoolModel);
    }

}
