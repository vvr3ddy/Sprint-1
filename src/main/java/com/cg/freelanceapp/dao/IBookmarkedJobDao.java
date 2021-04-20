package com.cg.freelanceapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.BookmarkedJob;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Skill;

@Repository
public interface IBookmarkedJobDao extends JpaRepository<BookmarkedJob, Long> {

	@SuppressWarnings("unchecked")
	BookmarkedJob save(BookmarkedJob job);

	void remove(BookmarkedJob job);

	List<BookmarkedJob> findBookmarkedJobsBySkill(Skill skill, Freelancer freelancer);

}
