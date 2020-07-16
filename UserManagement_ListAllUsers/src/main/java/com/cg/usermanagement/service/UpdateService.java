package com.cg.usermanagement.service;

import java.util.List;

import com.cg.usermanagement.entity.UserDto;

public interface UpdateService {

	//String updateUser(UserDto userDto);

	UserDto createUser(UserDto userDto);

	List<UserDto> getUsers(UserDto userDto);

}
