package com.codevui.user_management.exception.custom;


import com.codevui.user_management.model.CustomError;

public class CustomBadRequestException extends BaseException{
    
    public CustomBadRequestException(CustomError customError){
        super(customError);
    }

}
