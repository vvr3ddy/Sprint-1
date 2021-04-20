package com.cg.freelanceapp.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class BookmarkedJob {
	@Id
	@SequenceGenerator(name = "BkdJob_seq", initialValue = 1001)
	Long id;
	@OneToOne(cascade = CascadeType.ALL)
	Skill skill;
	@OneToOne(cascade = CascadeType.ALL)
	Job job;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "freelancer_id")
	Freelancer freelancer;

	public BookmarkedJob() {
		super();
	}

	public BookmarkedJob(Long id, Skill skill, Job job, Freelancer freelancer) {
		super();
		this.id = id;
		this.skill = skill;
		this.job = job;
		this.freelancer = freelancer;
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

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

}
