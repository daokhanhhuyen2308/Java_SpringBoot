package com.codevui.user_management.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codevui.user_management.entity.User;
import com.codevui.user_management.exception.custom.CustomBadRequestException;
import com.codevui.user_management.exception.custom.CustomNotFoundException;
import com.codevui.user_management.model.CustomError;
import com.codevui.user_management.model.dto.UserDTO;
import com.codevui.user_management.model.dto.UserDTOCreate;
import com.codevui.user_management.model.dto.UserDTOUpadate;
import com.codevui.user_management.model.mapper.UserMapper;
import com.codevui.user_management.repository.UserRepository;
import com.codevui.user_management.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    @Override
    //Jackson hỗ trợ chuyển List<User> sang dạng JSON
    public List<UserDTO> getAllUsers() {
      List<UserDTO> userDTOs = new ArrayList<>();
      List<User> users = userRepository.findAll();
      for (User user : users) {
        //chuyển cái thằng user này về UserDTO và add vào trong list UserDTO
        userDTOs.add(UserMapper.toUserDTO(user));
      }
      return userDTOs;
    }
    @Override
    public UserDTO getUserById(int id) throws CustomNotFoundException{
      Optional<User> user = userRepository.findById(id);
      if(user.isEmpty()){
        throw new CustomNotFoundException(CustomError.builder().code("404")
        .message("getById-Not found").build());
      }
      return UserMapper.toUserDTO(user.get());
    }
    @Override
    public UserDTO createUser(UserDTOCreate userDTOCreate) throws CustomBadRequestException {
      if (userDTOCreate.getEmail().equals("")) {
        throw new CustomBadRequestException(CustomError.builder().code("400").message("Bad request").build());
        
      }
      User user = UserMapper.toUser(userDTOCreate);
      //method save này là sau ghi nó lưu thì nó sẽ trả về đối tượng mà nó vừa mới lưu bao gồm cả id nên 
      //là mình lưu lại vào user để có thuộc tính là id
      user = userRepository.save(user);
      return UserMapper.toUserDTO(user);
    }
    @Override
    public UserDTO updateUser(UserDTOUpadate userDTOUpadate) {
      User user = UserMapper.toUser(userDTOUpadate);
      user = userRepository.save(user);
      return UserMapper.toUserDTO(user);
    }
    @Override
    public UserDTO deleteUser(int id) throws CustomNotFoundException{
      Optional<User> userOptional = userRepository.findById(id);
     if (userOptional.isEmpty()){
        throw new CustomNotFoundException(CustomError.builder().code("404").message("Not found").build());
      }
      userRepository.deleteById(id);
     return UserMapper.toUserDTO(userOptional.get());
    }
    
}
