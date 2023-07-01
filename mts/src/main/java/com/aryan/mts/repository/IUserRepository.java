package com.aryan.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aryan.mts.beans.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

	@Query("select users from User users where users.email=:email")
	public User findByEmail(@Param("email") String email);
	
}
