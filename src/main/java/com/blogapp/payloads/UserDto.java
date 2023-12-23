package com.blogapp.payloads;

import lombok.Data;

 
@Data
public class UserDto {

	private int userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private String about;
}
