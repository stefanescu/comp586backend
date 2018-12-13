package com.comp586.backend.controller;

import com.comp586.backend.model.Post;
import com.comp586.backend.model.User;
import com.comp586.backend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestRestAPIs {

	@Autowired
	PostRepository postRepository;

	@GetMapping("/api/test/user")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public String userAccess() {

		return ">>> User Contents!";
	}

//	@GetMapping("/api/test/pm")
//	@PreAuthorize("hasRole('PM') or hasRole('ADMIN')")
//	public String projectManagementAccess() {
//		return ">>> Project Management Board";
//	}
//
	@GetMapping("/api/test/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {

        Post p = new Post("abc", "bbb", new User());

        postRepository.save(p);

        return ">>> Admin Contents";
	}
}