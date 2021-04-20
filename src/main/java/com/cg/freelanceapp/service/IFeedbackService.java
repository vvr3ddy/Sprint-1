package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.Feedback;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Recruiter;

@Service
public interface IFeedbackService {

	Feedback createFeedback(Recruiter recruiter, Freelancer freelancer, int rating, String review);

	int averageRating(Freelancer freelancer);

	List<Feedback> findFeedbacksByFreelancer(Freelancer freelancer);
}
