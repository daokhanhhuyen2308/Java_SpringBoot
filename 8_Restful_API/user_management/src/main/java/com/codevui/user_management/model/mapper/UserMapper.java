package com.codevui.user_management.model.mapper;

import com.codevui.user_management.entity.User;
import com.codevui.user_management.model.dto.UserDTO;
import com.codevui.user_management.model.dto.UserDTOCreate;
import com.codevui.user_management.model.dto.UserDTOUpadate;

public class UserMapper {
    public static UserDTO toUserDTO(User user){ 
        return UserDTO.builder().id(user.getId()).email(user.getEmail()).age(user.getAge()).phone(user.getPhone()).build();
    }
    public static User toUser(UserDTOCreate userDTOCreate){ 
        return User.builder().email(userDTOCreate.getEmail()).age(userDTOCreate.getAge())
        .phone(userDTOCreate.getPhone()).password(userDTOCreate.getPassword())
        .build();
    }
    public static User toUser(UserDTOUpadate userDTOUpadate){
        return User.builder().id(userDTOUpadate.getId()).email(userDTOUpadate.getEmail()).age(userDTOUpadate.getAge()).
        phone(userDTOUpadate.getPhone()).password(userDTOUpadate.getPassword())
        .build();
    }
    
}
