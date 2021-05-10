package com.shrek.HeroAcademyV2.controller;

import com.shrek.HeroAcademyV2.services.AllInformationServiceImpl;
import com.shrek.HeroAcademyV2.to.AllInformationTO;
import com.shrek.HeroAcademyV2.to.UserTo;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/academy")
public class AllInformationController {

	@Autowired
	AllInformationServiceImpl allInformationService;

	@RequestMapping(value = "/allInformation", method = RequestMethod.GET)
	public AllInformationTO getAllInformation() {
		return allInformationService.getAllInformation();
	}

	/*
	 * @RequestMapping(value = "/user", method = RequestMethod.GET) public User
	 * getUser(@RequestParam String userId) { long id = Long.parseLong(userId);
	 * return allInformationService.getUserInformation(id); }
	 * 
	 * @RequestMapping(value = "/users", method = RequestMethod.GET) public
	 * List<User> getAllUsers() { return
	 * allInformationService.getAllUsersInformation(); }
	 */

	@RequestMapping(value = "/seedUsers", method = RequestMethod.GET)
	public boolean seedUsersFromJSONFile() {
		List<UserTo> usersToList = new ArrayList<UserTo>();
		JSONParser jsonParser = new JSONParser();
		try (FileReader reader = new FileReader("C:\\WORK\\projectSourceCodes\\Hero-Academy-V2\\userJSONFile2021-05-08-01-24-35.json")) {
			Object obj = jsonParser.parse(reader);
			JSONArray jsonList = (JSONArray) obj;
			Iterator<Object> itr = jsonList.iterator();
			while (itr.hasNext()) {
				JSONObject user = (JSONObject) itr.next();
				System.out.println("===========================================");

				String image = (String) user.get("image");
				String firstName = (String) user.get("firstName");
				String middleName = (String) user.get("middleName");
				String lastName = (String) user.get("lastName");
				String userName = (String) user.get("userName");
				String password = (String) user.get("password");
				String gender = (String) user.get("gender");
				String primaryEmail = (String) user.get("primaryEmail");
				String secondaryEmail = (String) user.get("secondaryEmail");

				Date dob = new Date(Long.parseLong((String) user.get("dob")));
				System.out.println(dob);

				Integer height = Integer.parseInt((String) user.get("height"));
				Integer weight = Integer.parseInt((String) user.get("weight"));
				Integer strength = Integer.parseInt((String) user.get("strength"));
				Integer speed = Integer.parseInt((String) user.get("speed"));
				Integer intelligence = Integer.parseInt((String) user.get("intelligence"));
				Integer stamina = Integer.parseInt((String) user.get("stamina"));
				Integer willpower = Integer.parseInt((String) user.get("willpower"));
				Integer fortitude = Integer.parseInt((String) user.get("fortitude"));
				Integer durabillity = Integer.parseInt((String) user.get("durabillity"));
				Integer coordination = Integer.parseInt((String) user.get("coordination"));

				Integer race = Integer.parseInt((String) user.get("race"));
				Integer symbol = Integer.parseInt((String) user.get("symbol"));
				Integer element = Integer.parseInt((String) user.get("element"));
				JSONObject skillsObject = (JSONObject)user.get("skills");
				Iterator<String> keys = skillsObject.keySet().iterator();
				int[] skillsLevelArray = new int[(skillsObject.keySet().size())*2];
				int i=0;
				while(keys.hasNext()) {
					String key = keys.next();
					if (skillsObject.get(key)!=null) {
						skillsLevelArray[i++] = Integer.valueOf(key).intValue();
						skillsLevelArray[i++] = Integer.valueOf((String)skillsObject.get(key)).intValue();
					}
				}
				UserTo newUser = new UserTo(image, firstName, middleName, lastName, userName,
						password, gender, primaryEmail, secondaryEmail, dob,
						height, weight, strength, speed, intelligence, stamina, willpower, fortitude, durabillity, coordination,
						race, symbol, element, skillsLevelArray);
				System.out.println(user.toString());
				usersToList.add(newUser);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allInformationService.addUsers(usersToList);
	}

	/*
	 * @RequestMapping(value = "/skills", method = RequestMethod.GET) public
	 * List<SkillMapping> getSkills() { return
	 * allInformationService.getSkillMappingData(); }
	 */

	public String uploadFileHandler(MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				// Create the file on server
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSS");
				String currentDate = sdf.format(date);
				String fileName = "D:/BillingSystemData/" + "XLSX_uploaded_" + currentDate + ".xlsx";
				File serverFile = new File(fileName);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				// System.out.println("IN FILE UPLOAD CONTROLLER");
				String fileNameParameter = fileName;
				// excelService.getExcelData(fileNameParameter);
				return "true";
			} catch (Exception e) {
				return "You failed to upload => " + e.getMessage();
			}
		} else {
			return "false";
		}
	}

	public void getExcelData(String fileNameParameter) {
		File xlsxFile = new File(fileNameParameter);
		if (!xlsxFile.exists()) {
			System.err.println("Not found or not a file: " + xlsxFile.getPath());
		}
		int columnsScanned = 5;
		int minColumns = columnsScanned;
		try {
			OPCPackage opcPackage = OPCPackage.open(xlsxFile.getPath(), PackageAccess.READ);
			// XLSX2CSV xlsx2csv = new XLSX2CSV(opcPackage, System.out, minColumns,
			// gradeDao, locationDao, accountDao, employeeDao);
			// xlsx2csv.process();// billRate = xlsx2csv.process();
			opcPackage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
