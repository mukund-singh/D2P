package com.jwt;

import com.jwt.entity.User;
import com.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class JwtDemoApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initUser(){
		List<User> userList = Arrays.asList(
				new User(101, "Mukund", "Mukund", "mukund@gmail.com"),
				new User(102, "Amit", "Amit", "amit@gmail.com"),
				new User(103, "Sumit", "Sumit", "sumit@gmail.com"),
				new User(104, "Ram", "Ram", "ram@gmail.com")
		);
		userRepository.saveAll(userList);
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtDemoApplication.class, args);
	}

}
