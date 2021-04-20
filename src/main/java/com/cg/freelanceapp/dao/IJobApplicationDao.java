package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.freelanceapp.entities.JobApplication;

public interface IJobApplicationDao extends JpaRepository<JobApplication, Long> {

	@SuppressWarnings("unchecked")
	JobApplication save(JobApplication jobApplication);

	JobApplication update(JobApplication jobApplication);

}
