package com.comp586.backend.controller;

import com.comp586.backend.message.response.ResponseMessage;
import com.comp586.backend.message.response.ResponseUsers;
import com.comp586.backend.model.Post;
import com.comp586.backend.model.User;
import com.comp586.backend.repository.PostRepository;
import com.comp586.backend.repository.UserRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestRestAPIs {

	@Autowired
	PostRepository postRepository;

	@Autowired
    UserRepository userRepository;

	@GetMapping("/api/test/user")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public String userAccess() {

		return ">>> User Contents!";
	}

	@GetMapping(value = "/api/test/admin")
	@PreAuthorize("hasRole('ADMIN')")
    @ResponseBody
	public ResponseUsers adminAccess() {
        List<User> usrs = userRepository.findAll();
        return new ResponseUsers(usrs);
	}
}