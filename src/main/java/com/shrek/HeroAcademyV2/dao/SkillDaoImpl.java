package com.shrek.HeroAcademyV2.dao;

import com.shrek.HeroAcademyV2.model.Skill;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class SkillDaoImpl extends GenericDaoImpl<Skill> implements ISkillDao {
	
	@Transactional
	public List<Skill> getAllSkills() {
		return (List<Skill>) findAll();
	}

	@Transactional
	public Skill getSkill(Long id){
		return (Skill) find(id);
	}
	
	@Transactional
	public Skill addSkill(Skill skill){
		return (Skill)create(skill);
	}

	@Transactional
	public Skill updateSkill(Skill skill) {
		return (Skill) update(skill);
	}

	@Transactional
	public void deleteSkill(Skill skill) {
		delete(skill.getId());
	}

}
