package com.codevui.user_management.controller;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codevui.user_management.exception.custom.CustomBadRequestException;
import com.codevui.user_management.exception.custom.CustomNotFoundException;
import com.codevui.user_management.model.dto.UserDTO;
import com.codevui.user_management.model.dto.UserDTOCreate;
import com.codevui.user_management.model.dto.UserDTOUpadate;
import com.codevui.user_management.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
//tạo ra Constructor để inject tất cả các thằng final thì dùng @Required...
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    //sử dụng biến final để Spring hỗ trợ inject qua Constructor
    private final UserService userService;
    
    @GetMapping("")
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable int id) throws CustomNotFoundException{
        return userService.getUserById(id);
    }

    @PostMapping("")
    public UserDTO createUser(@RequestBody UserDTOCreate userDTOCreate) throws CustomBadRequestException{
        return userService.createUser(userDTOCreate);
    }

    @PutMapping("/{id}")
    public UserDTO createUser(@PathVariable int id, @RequestBody UserDTOUpadate userDTOUpadate){
        userDTOUpadate.setId(id);
        return userService.updateUser(userDTOUpadate);
    }
    @DeleteMapping("/{id}")
    public UserDTO createUser(@PathVariable int id) throws CustomNotFoundException{
        return userService.deleteUser(id);
    }

}
