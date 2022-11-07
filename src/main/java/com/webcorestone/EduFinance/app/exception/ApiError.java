package com.webcorestone.EduFinance.app.exception;



import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApiError 
{
	private HttpStatus errormsg;
	private Date date;
	private String message;
	private String path;
	private int statusCode;
	
	
}