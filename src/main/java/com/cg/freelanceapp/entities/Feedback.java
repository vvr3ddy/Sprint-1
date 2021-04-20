package com.cg.freelanceapp.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Feedback {

	@Id
	@SequenceGenerator(name = "feedback_seq", initialValue = 1001)
	Long id;
	Integer ranges;
	String comments;

	@ManyToOne(cascade = CascadeType.ALL)
	Recruiter createdBy;
	@OneToOne(cascade = CascadeType.ALL)
	Freelancer createdFor;

	public Feedback() {
		super();
	}

	public Feedback(Long id, Integer ranges, String comments, Recruiter createdBy, Freelancer createdFor) {
		super();
		this.id = id;
		this.ranges = ranges;
		this.comments = comments;
		this.createdBy = createdBy;
		this.createdFor = createdFor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRanges() {
		return ranges;
	}

	public void setRange(Integer ranges) {
		this.ranges = ranges;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Recruiter getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Recruiter createdBy) {
		this.createdBy = createdBy;
	}

	public Freelancer getCreatedFor() {
		return createdFor;
	}

	public void setCreatedFor(Freelancer createdFor) {
		this.createdFor = createdFor;
	}

}
