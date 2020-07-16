package com.cg.usermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.usermanagement.dao.UpdateDao;
import com.cg.usermanagement.entity.UserDto;

@Service

public class UpdateServiceImpl  implements UpdateService
{
	@Autowired
	UpdateDao updatedaoobj;

	@Override
	public UserDto createUser(UserDto userDto1) {
	
		updatedaoobj.save(userDto1);
		return userDto1;

	}

	@Override
	public List<UserDto> getUsers(UserDto userDto2) {
		
		return updatedaoobj.findAll();
	}
}


