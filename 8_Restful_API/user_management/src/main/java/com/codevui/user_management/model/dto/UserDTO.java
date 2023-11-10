package com.codevui.user_management.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
//dùng để hiện thị cho người dùng 
public class UserDTO {
    private int id;
    private String email;
    private String phone;
    private int age;
    
}
