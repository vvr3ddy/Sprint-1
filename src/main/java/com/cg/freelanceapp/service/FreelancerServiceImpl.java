package com.cg.freelanceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IFreelancerDao;
import com.cg.freelanceapp.entities.Freelancer;

@Service
public class FreelancerServiceImpl implements IFreelancerService {

	@Autowired
	IFreelancerDao freelancerDao;
	
	@Override
	public Freelancer save(Freelancer freelancer) {
		return freelancerDao.save(freelancer);
	}

	@Override
	public Freelancer update(Freelancer freelancer) {
		return freelancerDao.update(freelancer);
	}

	@Override
	public Freelancer findById(Long id) {
		return freelancerDao.findById(id).get();
	}

}
