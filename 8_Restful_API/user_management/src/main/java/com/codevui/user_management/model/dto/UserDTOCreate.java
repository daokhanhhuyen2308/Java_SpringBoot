package com.codevui.user_management.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
//đây là class định nghĩa những cái người dùng cần gửi lên
public class UserDTOCreate {
    private int id;
    private String email;
    private String password;
    private String phone;
    private int age;
}
