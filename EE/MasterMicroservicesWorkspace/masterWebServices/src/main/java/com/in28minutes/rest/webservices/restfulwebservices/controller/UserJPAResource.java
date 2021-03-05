package com.in28minutes.rest.webservices.restfulwebservices.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservices.exceptions.UserNotFoundException;
import com.in28minutes.rest.webservices.restfulwebservices.models.Post;
import com.in28minutes.rest.webservices.restfulwebservices.models.User;
import com.in28minutes.rest.webservices.restfulwebservices.repositories.PostRepository;
import com.in28minutes.rest.webservices.restfulwebservices.repositories.UserRepository;
import com.in28minutes.rest.webservices.restfulwebservices.service.UserDaoService;


@RestController
@RequestMapping("/jpa")
public class UserJPAResource {

	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public ResponseEntity<Object> retrieveAllUsers() {
		List<User> user = userRepository.findAll();
		
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
	
	@GetMapping("/users/{id}/posts")
	public ResponseEntity<Object> retrieveAllUsersPosts(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);
		if(!user.isPresent()) {
			throw new UserNotFoundException("ID não encontrado: "+id);
		}
		
		
		
		return ResponseEntity.status(HttpStatus.OK).body(user.get().getPosts());
	}
	
	
	@PostMapping("/users/{id}/posts")
	public ResponseEntity<Object> createPostUser(@RequestBody Post post,@PathVariable int id) {
		
		Optional<User> userOptional = userRepository.findById(id);
		
		if(!userOptional.isPresent()) {
			throw new UserNotFoundException("ID não encontrado: "+id);
		}
		
		User user = userOptional.get();
		
		post.setUser(user);
		
		postRepository.save(post);
		
		
		
		
		User savedUser = userRepository.save(user);

		return ResponseEntity.status(HttpStatus.CREATED).body(post);
	}

	

	@GetMapping("/users/{id}")
	public ResponseEntity<Object> retrieveUser(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);
		if (!user.isPresent()) {
			throw new UserNotFoundException("id: " + id);
		}
		return ResponseEntity.status(HttpStatus.OK).body(user);

	}
	
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		 userRepository.deleteById(id);
	}

	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User savedUser = userRepository.save(user);

		return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
	}

}
