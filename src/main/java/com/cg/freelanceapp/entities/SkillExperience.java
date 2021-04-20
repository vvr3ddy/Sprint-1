package com.cg.freelanceapp.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class SkillExperience {

	@Id
	@SequenceGenerator(name = "experience_seq", initialValue = 1001)
	Long id;
	@OneToOne(cascade = CascadeType.ALL)
	Skill skill;
	Integer years;
	@OneToOne(cascade = CascadeType.ALL)
	Freelancer freelancer;

	public SkillExperience() {
		super();
	}

	public SkillExperience(Long id, Skill skill, Integer years, Freelancer freelancer) {
		super();
		this.id = id;
		this.skill = skill;
		this.years = years;
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

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

}
