package com.cg.freelanceapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IBookmarkedFreelancerDao;
import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.entities.Recruiter;
import com.cg.freelanceapp.entities.Skill;

@Service
public class BookmarkedFreelancerServiceImpl implements IBookmarkedFreelancerService {
	@Autowired
	IBookmarkedFreelancerDao bookmarkedFreelancerDao;

	@Override
	public BookmarkedFreelancer bookmarkFreelancer(BookmarkedFreelancer bookmarkedFreelancer) {
		return bookmarkedFreelancerDao.save(bookmarkedFreelancer);
	}

	@Override
	public List<BookmarkedFreelancer> findBookmarkedFreelancersBySkill(Skill skill, Recruiter recruiter) {
		return bookmarkedFreelancerDao.findBookmarkedFreelancerBySkill(skill).stream()
				.filter(e -> e.getBookmarkedBy().equals(recruiter)).collect(Collectors.toList());

	}

	@Override
	public void removeBookmarkedFreelancer(BookmarkedFreelancer bookmarkedFreelancer) {

		bookmarkedFreelancerDao.delete(bookmarkedFreelancer);

	}

	@Override
	public BookmarkedFreelancer findById(Long id) {
		return bookmarkedFreelancerDao.findById(id).get();
	}

}
