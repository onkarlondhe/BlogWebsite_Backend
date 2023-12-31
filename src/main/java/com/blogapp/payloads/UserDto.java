package com.blogapp.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

 
@Data
public class UserDto {

	
	private int userId;
	
	@NotEmpty
	private String userName;
	@Email
	@NotEmpty
 	private String userEmail;
	@NotEmpty
 	private String userPassword;
	@NotEmpty
 	private String about;
}
