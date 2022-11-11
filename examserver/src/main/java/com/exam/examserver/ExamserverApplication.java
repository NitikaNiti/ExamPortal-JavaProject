package com.exam.examserver;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.examserver.model.Role;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;
import com.exam.examserver.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");
		
		/*
		 * User user = new User(); user.setFirstName("Niti");
		 * user.setLastName("Salgotra"); user.setUsername("niti@salgotra");
		 * user.setPassword("xyz"); user.setEmail("nitika@gnail.com");
		 * user.setProfile("deafult.png");
		 * 
		 * Role role = new Role(); role.setRoleId(44L); role.setRoleName("ADMIN");
		 * 
		 * Set<UserRole> userRoleSet = new HashSet<>();
		 * 
		 * UserRole userRole = new UserRole();
		 * 
		 * userRole.setRole(role); userRole.setUser(user);
		 * 
		 * userRoleSet.add(userRole);
		 * 
		 * User user1 = this.userService.createUser(user, userRoleSet);
		 * System.out.println(user1.getUsername());
		 */
		
	}

}
