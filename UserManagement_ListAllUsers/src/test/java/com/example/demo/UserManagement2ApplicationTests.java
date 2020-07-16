package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.VerificationCollector;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cg.usermanagement.dao.UpdateDao;
import com.cg.usermanagement.entity.UserDto;
import com.cg.usermanagement.service.UpdateServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserManagement2ApplicationTests {
@Rule
public VerificationCollector verificationCollector = MockitoJUnit.collector();
@Mock
    private UpdateDao dao;
@InjectMocks
private UpdateServiceImpl service;

@Before
public void setup(){
MockitoAnnotations.initMocks(this);
}
@Test
public void testGetUsers(){
List<UserDto> userList = new ArrayList<UserDto>();
userList.add(new UserDto(67, "abh@gmail.com","Harsha","av23"));
when(dao.findAll()).thenReturn(userList);
assertEquals(1, userList.size());
}
}
