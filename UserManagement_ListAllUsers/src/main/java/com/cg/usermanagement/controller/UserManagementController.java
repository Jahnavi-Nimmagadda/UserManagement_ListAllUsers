package com.cg.usermanagement.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.usermanagement.Exceptions.InvalidDetailsException;
import com.cg.usermanagement.entity.UserDto;
import com.cg.usermanagement.service.UpdateService;

@RestController
@RequestMapping("/UserManagement")
@CrossOrigin("http://localhost:4200")

public class UserManagementController
{

	@Autowired
	UpdateService updateserviceobj;
	

	@PostMapping(value="/createuser")
	public UserDto createUser(@RequestBody UserDto userDto) 
	{
		UserDto result= updateserviceobj.createUser(userDto);
		
		return result;
		
	}
	
	@GetMapping(value="/getallusers")
	public List<UserDto> getUsers(@RequestBody UserDto userDto) throws InvalidDetailsException 
	{	List<UserDto> result= updateserviceobj.getUsers(userDto);
	if(result!=null)
	{
	return result;
	}
	else
	{
		throw new InvalidDetailsException("No Users in the List!!!!!!!!!!");
        
	}
		
	}

}
