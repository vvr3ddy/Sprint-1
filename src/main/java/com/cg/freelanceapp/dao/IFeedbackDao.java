package com.cg.freelanceapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Feedback;
import com.cg.freelanceapp.entities.Freelancer;

@Repository
public interface IFeedbackDao extends JpaRepository<Feedback, Long> {

	@SuppressWarnings("unchecked")
	Feedback save(Feedback feedback);

	Feedback update(Feedback feedback);

	int averageRating(Freelancer freelancer);

	List<Feedback> findFeedbacksByFreelancer(Freelancer freelancer);
}
