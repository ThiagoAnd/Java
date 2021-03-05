package com.in28minutes.rest.webservices.restfulwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28minutes.rest.webservices.restfulwebservices.models.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

}
