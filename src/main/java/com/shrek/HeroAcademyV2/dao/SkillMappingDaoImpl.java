package com.shrek.HeroAcademyV2.dao;

import com.shrek.HeroAcademyV2.model.SkillMapping;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class SkillMappingDaoImpl extends GenericDaoImpl<SkillMapping> implements ISkillMappingDao {
	
	@Transactional
	public List<SkillMapping> getAllSkillMappings() {
		return (List<SkillMapping>) findAll();
	}

	@Transactional
	public SkillMapping getSkillMapping(Long id){
		return (SkillMapping) find(id);
	}
	
	@Transactional
	public SkillMapping addSkillMapping(SkillMapping SkillMapping){
		return (SkillMapping)create(SkillMapping);
	}

	@Transactional
	public SkillMapping updateSkillMapping(SkillMapping skillMapping) {
		return (SkillMapping) update(skillMapping);
	}

	@Transactional
	public void deleteSkillMapping(SkillMapping skillMapping) {
		delete(skillMapping.getId());
	}

}
