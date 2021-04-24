package com.shrek.HeroAcademyV2.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shrek.HeroAcademyV2.dao.UserDaoImpl;
import com.shrek.HeroAcademyV2.model.User;
import com.shrek.HeroAcademyV2.to.AllInformationTO;

@Service
public class AllInformationServiceImpl implements IAllInformationService {

	@Autowired
	UserDaoImpl userDao;

	/*
	 * @Autowired private IElementDao elementDao;
	 * 
	 * @Autowired private IRaceDao raceDao;
	 * 
	 * @Autowired private ISymbolDao symbolDao;
	 * 
	 * @Autowired private ISkillDao skillDao;
	 * 
	 * @Autowired private ISkillMappingDao skillMappingDao;
	 */

	@Override
	@Transactional
	public AllInformationTO getAllInformation() {
		AllInformationTO allInformationTO = new AllInformationTO();
		/*
		 * allInformationTO.setElements(elementDao.getAllElements());
		 * allInformationTO.setRaces(raceDao.getAllRaces());
		 * allInformationTO.setSymbols(symbolDao.getAllSymbols());
		 * allInformationTO.setSkills(skillDao.getAllSkills());
		 */
		return allInformationTO;
	}

	@Transactional
	public User getUserInformation(long id) {
		return userDao.getUser(id);
	}

	@Transactional
	public List<User> getAllUsersInformation() {
		return userDao.getAllUsers();
	}

	/*
	 * @Transactional public List<SkillMapping> getSkillMappingData() { return
	 * skillMappingDao.getAllSkillMappings(); }
	 */

	@Transactional
	public boolean addUsers(List<User> users) {
		Iterator<User> itr = users.iterator();
		boolean out = true;
		while (itr.hasNext()) {
			User user = itr.next();
			if (userDao.addUser(user) == null) {
				out = false;
			}
		}
		return out;
	}
}
