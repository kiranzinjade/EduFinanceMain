package com.webcorestone.EduFinance.app.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ApiError> studentNotFoundExceptionHandler(StudentNotFoundException s,HttpServletRequest request)
    {
    	 ApiError api=new ApiError(HttpStatus.NOT_FOUND,new Date(),s.getMessage(),request.getRequestURI(),HttpStatus.NOT_FOUND.value());
    	 return new ResponseEntity<ApiError>(api,HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(UserNameOrPasswordIncurrect.class)
    
    	public ResponseEntity<ApiError> userNameOrPasswordIncurrectExceptionHandler(UserNameOrPasswordIncurrect u,HttpServletRequest request)
    	{
    	 ApiError api=new ApiError(HttpStatus.NOT_FOUND,new Date(),u.getMessage(),request.getRequestURI(),HttpStatus.NOT_FOUND.value());
    	 return new ResponseEntity<ApiError>(api,HttpStatus.NOT_FOUND);
    	}
    @ExceptionHandler(AdminUserNameOrPasswordIncurrectException.class)
    public ResponseEntity<ApiError> adminUsernameOrPasswordExceptionHandler(AdminUserNameOrPasswordIncurrectException a,HttpServletRequest request)
    {
    	 ApiError api=new ApiError(HttpStatus.NOT_FOUND,new Date(),a.getMessage(),request.getRequestURI(),HttpStatus.NOT_FOUND.value());
    	 return new ResponseEntity<ApiError>(api,HttpStatus.NOT_FOUND);
    }
    
}
