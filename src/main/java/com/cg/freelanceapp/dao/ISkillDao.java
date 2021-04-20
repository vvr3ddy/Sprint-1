package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Skill;

@Repository
public interface ISkillDao extends JpaRepository<Skill, Long>{

	@SuppressWarnings("unchecked")
	Skill save(Skill skill);

	Skill update(Skill skill);

}
