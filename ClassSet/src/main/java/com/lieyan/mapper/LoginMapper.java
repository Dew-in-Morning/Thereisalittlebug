package com.lieyan.mapper;

import com.lieyan.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {
    @Select("select count(*) from users where username=#{user.username} and password=#{user.password};")
    public int login(User user);

    @Insert("insert into users(username, password) VALUE (#{user.username},#{user.password});")
    public int register(User user);
}
