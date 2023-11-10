package com.codevui.user_management.service;

import java.util.List;

import com.codevui.user_management.exception.custom.CustomBadRequestException;
import com.codevui.user_management.exception.custom.CustomNotFoundException;
import com.codevui.user_management.model.dto.UserDTO;
import com.codevui.user_management.model.dto.UserDTOCreate;
import com.codevui.user_management.model.dto.UserDTOUpadate;

public interface UserService {

public List<UserDTO> getAllUsers();

public UserDTO getUserById(int id) throws CustomNotFoundException;

public UserDTO createUser(UserDTOCreate userDTOCreate) throws CustomBadRequestException;

public UserDTO updateUser(UserDTOUpadate userDTOUpadate);

public UserDTO deleteUser(int id) throws CustomNotFoundException;

   
}
