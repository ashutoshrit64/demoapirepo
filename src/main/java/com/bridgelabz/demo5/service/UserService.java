package com.bridgelabz.demo5.service;

import java.util.Optional;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.demo5.Model.UserModel;
import com.bridgelabz.demo5.dto.UserDto;
import com.bridgelabz.demo5.exception.RegisterException;
import com.bridgelabz.demo5.repository.UserRepository;
import com.bridgelabz.demo5.util.Response;
import com.bridgelabz.demo5.util.TokenUtil;
@Service
public class UserService implements IService{
	@Autowired(required=true)
	private UserRepository repository;
	@Autowired
	private ModelMapper modelmapper;
	@Autowired
	TokenUtil tokenutil;
	@Override
	public Response register(UserDto userdto) {
		Optional<UserModel> isThere = repository.findByEmailid(userdto.getEmailid());

		if (isThere.isPresent()) {
			throw new RegisterException(400, "user already present");
		} else {
//			userdto.setPassword(passwordencoder.encode(userdto.getPassword()));
			//map the all entities with userdto
			UserModel user = modelmapper.map(userdto, UserModel.class);
			//save the user in database
			repository.save(user);
			
			//send email to the user for verification
//			email.setTo(userdto.getEmailid());
//			email.setFrom("ashutoshrit64@gmail.com");
//			email.setSubject("Verification...");
			String token=tokenutil.createToken(user.getId());
//			email.setBody(mailservice.getLink("http://localhost:4200/verify/", user.getId()));
//			messageproducer.sendMessage(email);
//			String token="1234";
			return new Response(200, "registered succesfully..", token);
		}
	}
	
	public Response login() {
		return null;
	}
	
	

}
