package com.github.security.dao;

import com.github.security.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {

    @Select("select * from users where id=#{id}")
    User getByUserId(Integer id);

}
