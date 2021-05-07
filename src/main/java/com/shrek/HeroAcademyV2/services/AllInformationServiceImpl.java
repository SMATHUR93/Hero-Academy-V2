package com.shrek.HeroAcademyV2.services;

import com.shrek.HeroAcademyV2.dao.*;
import com.shrek.HeroAcademyV2.model.*;
import com.shrek.HeroAcademyV2.to.AllInformationTO;
import com.shrek.HeroAcademyV2.to.UserTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class AllInformationServiceImpl implements IAllInformationService {

	@Autowired
	private IUserDao userDao;

	@Autowired
	private IElementDao elementDao;

	@Autowired
	private IRaceDao raceDao;

	@Autowired
	private ISymbolDao symbolDao;

	@Autowired
	private ISkillDao skillDao;

	@Autowired
	private ISkillMappingDao skillMappingDao;

	@Override
	@Transactional
	public AllInformationTO getAllInformation() {
		AllInformationTO allInformationTO = new AllInformationTO();
		allInformationTO.setElements(elementDao.getAllElements());
		allInformationTO.setRaces(raceDao.getAllRaces());
		allInformationTO.setSymbols(symbolDao.getAllSymbols());
		allInformationTO.setSkills(skillDao.getAllSkills());
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

	@Transactional
	public List<SkillMapping> getSkillMappingData() {
		return skillMappingDao.getAllSkillMappings();
	}

	@Transactional
	public boolean addUsers(List<UserTo> users) {
		Iterator<UserTo> itr = users.iterator();
		boolean out = true;
		while(itr.hasNext()) {
			UserTo userTo = itr.next();

			String image = userTo.getImage();
			String firstName = userTo.getFirstName();
			String middleName = userTo.getMiddleName();
			String lastName = userTo.getLastName();
			String userName = userTo.getUserName();
			String password = userTo.getPassword();
			String gender = userTo.getGender();
			String primaryEmail = userTo.getPrimaryEmail();
			String secondaryEmail = userTo.getSecondaryEmail();

			Date dob = userTo.getDob();

			Integer height = userTo.getHeight();
			Integer weight = userTo.getWeight();
			Integer strength = userTo.getStrength();
			Integer speed = userTo.getSpeed();
			Integer intelligence = userTo.getIntelligence();
			Integer stamina = userTo.getStamina();
			Integer willpower = userTo.getWillpower();
			Integer fortitude = userTo.getFortitude();
			Integer durabillity = userTo.getDurabillity();
			Integer coordination = userTo.getCoordination();

			Integer raceId = userTo.getRace();
			Race race = raceDao.getRace(Long.valueOf(raceId.toString()));

			Integer symbolId = userTo.getSymbol();
			Symbol symbol = symbolDao.getSymbol(Long.valueOf(symbolId.toString()));

			Integer elementId = userTo.getElement();
			Element element = elementDao.getElement(Long.valueOf(elementId.toString()));

			int[] skillsLevelArray = userTo.getSkillsLevelArray();

			// JSONArray skillsList = (JSONArray) user.get("skills");
			User newUser = new User(userName, image, password, firstName, middleName, lastName, dob,
					gender, primaryEmail, secondaryEmail, height, weight, strength,
					speed, intelligence, stamina, willpower, fortitude,
					durabillity, coordination, null, race, symbol, element,
					null, null);

			User savedUser = userDao.addUser(newUser);
			if(savedUser==null) {
				out = false;
			} else {
				int i=0;
				while(i<skillsLevelArray.length){
					Skill skill = skillDao.getSkill(Long.valueOf(skillsLevelArray[i++]));
					Integer skillLevel = skillsLevelArray[i++];
					skillMappingDao.addSkillMapping(new SkillMapping(savedUser, skill, skillLevel));
				}
			}
		}
		return out;
	}
}
