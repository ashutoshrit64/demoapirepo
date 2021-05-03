package com.bridgelabz.demo5.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.demo5.Model.UserModel;


public interface UserRepository extends JpaRepository<UserModel, Long> {

	public Optional<UserModel> findByEmailid(String emailid);

}
