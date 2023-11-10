package com.codevui.user_management.exception.custom;


import com.codevui.user_management.model.CustomError;

public class CustomNotFoundException extends BaseException{
    
    public CustomNotFoundException(CustomError customError){
        super(customError);
    }

}
