package com.shrek.HeroAcademyV2.dao;

import com.shrek.HeroAcademyV2.model.Race;

import java.util.List;

public interface IRaceDao extends IGenericDao<Race> {
	
	public List<Race> getAllRaces();
	
	public Race getRace(Long id);
	
	public Race addRace(Race race);
	
	public Race updateRace(Race race);
	
	public void deleteRace(Race race);
	
	
}
