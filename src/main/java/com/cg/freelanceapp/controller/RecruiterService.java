package com.cg.freelanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.entities.Recruiter;
import com.cg.freelanceapp.service.IRecruiterService;

@RestController
@RequestMapping("/recruiter")
public class RecruiterService {

	@Autowired
	IRecruiterService recruiterService;
	
	public ResponseEntity<Object> addRecruiter(Recruiter recruiter){
		recruiterService.save(recruiter);
		return new ResponseEntity<Object>("Added Recruiter successfully", HttpStatus.OK);
	}
}
