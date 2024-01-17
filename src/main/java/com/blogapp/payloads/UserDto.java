package com.blogapp.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

 
@Data
public class UserDto {

	
	private int userId;
	
	@NotEmpty
	@Size(min = 3, message = "username must be min of 4 characters !!")
	private String userName;
	
	@Email(message = "Email address is not valid !!")
	@NotEmpty
 	private String userEmail;
	
	@NotEmpty
	@Size(min = 3, message = "password must be min of 3 chars and max of 10 chars !!")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,}$")
 	private String userPassword;
	
	@NotEmpty
 	private String about;
}
