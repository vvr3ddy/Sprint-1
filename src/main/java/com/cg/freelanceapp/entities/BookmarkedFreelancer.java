package com.cg.freelanceapp.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class BookmarkedFreelancer {

	@Id
	@SequenceGenerator(name = "bkdFr_seq", initialValue = 1001)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	private Skill skill;

	@OneToOne(cascade = CascadeType.ALL)
	private Freelancer freelancer;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="recruiter_id")
	private Recruiter bookmarkedBy;

	public BookmarkedFreelancer() {
		super();
	}

	public BookmarkedFreelancer(Long id, Skill skill, Freelancer freelancer, Recruiter bookmarkedBy) {
		super();
		this.id = id;
		this.skill = skill;
		this.freelancer = freelancer;
		this.bookmarkedBy = bookmarkedBy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

	public Recruiter getBookmarkedBy() {
		return bookmarkedBy;
	}

	public void setBookmarkedBy(Recruiter bookmarkedBy) {
		this.bookmarkedBy = bookmarkedBy;
	}

}
