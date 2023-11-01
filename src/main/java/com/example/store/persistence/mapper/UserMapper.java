package com.example.store.persistence.mapper;

import com.example.store.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {
    User getUserByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);
    void createUser(User user);
    void updateUser(User user);
}
