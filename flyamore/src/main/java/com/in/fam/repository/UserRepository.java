package com.in.fam.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.fam.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
	public Optional<User> findByUserEmailAndUserPassword(String userEmail,String userPassword);
}
