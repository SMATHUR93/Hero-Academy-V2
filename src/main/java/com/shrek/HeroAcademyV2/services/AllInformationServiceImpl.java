package com.shrek.HeroAcademyV2.services;

import com.shrek.HeroAcademyV2.dao.UserDaoImpl;
import com.shrek.HeroAcademyV2.model.User;
import com.shrek.HeroAcademyV2.to.AllInformationTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

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
	public User getUserInformation(int id) {
		return userDao.get(id);
	}

	@Transactional
	public List<User> getAllUsersInformation() {
		return userDao.get();
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
			userDao.save(user);
			/*if (userDao.save(user) == null) {
				out = false;
			}*/
		}
		return out;
	}
}
