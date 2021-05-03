package com.bridgelabz.demo5.service;


import org.springframework.stereotype.Service;

import com.bridgelabz.demo5.dto.UserDto;
import com.bridgelabz.demo5.util.Response;


@Service
public interface IService {


	  public Response register(UserDto userdto);
}
