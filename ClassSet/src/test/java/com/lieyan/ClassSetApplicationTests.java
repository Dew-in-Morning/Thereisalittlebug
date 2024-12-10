package com.lieyan;

import com.lieyan.mapper.LoginMapper;
import com.lieyan.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClassSetApplicationTests {
    @Autowired
    LoginMapper loginMapper;
    @Test
    void contextLoads() {
        User user=new User();
        user.setUsername("333");
        user.setPassword("444");
        loginMapper.register(user);
    }

}
