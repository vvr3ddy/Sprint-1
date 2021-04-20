package com.cg.freelanceapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.service.IBookmarkedFreelancerService;

@RestController
@RequestMapping("/job/bkdFrl")
public class BookmarkedFreelancerController {
	
	IBookmarkedFreelancerService bookmarkedfreelancerService;
	
	@PostMapping("/add")
	public ResponseEntity<Object> bookmarkFreelancer(@RequestBody BookmarkedFreelancer bookmarkedFreelancer) {
		return new ResponseEntity<>("Bookmarked Freelancer Successfully", HttpStatus.ACCEPTED);
	}
}
