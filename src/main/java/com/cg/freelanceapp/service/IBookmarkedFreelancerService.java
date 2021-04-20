package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.entities.Recruiter;
import com.cg.freelanceapp.entities.Skill;

@Service
public interface IBookmarkedFreelancerService {

	BookmarkedFreelancer bookmarkFreelancer(BookmarkedFreelancer bookmarkedFreelancer);

	List<BookmarkedFreelancer> findBookmarkedFreelancersBySkill(Skill skill, Recruiter recruiter);

	void removeBookmarkedFreelancer(BookmarkedFreelancer bookmarkedFreelancer);

	BookmarkedFreelancer findById(Long id);

}
