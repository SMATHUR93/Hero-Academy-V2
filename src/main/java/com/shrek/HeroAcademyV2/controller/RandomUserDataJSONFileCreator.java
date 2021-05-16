package com.shrek.HeroAcademyV2.controller;

import com.shrek.HeroAcademyV2.constants.HeroAcademyConstants;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class RandomUserDataJSONFileCreator {

	public static void main(String[] args) {

		JSONArray userArray = new JSONArray();
		int count = 25;

		for (int i = 0; i < count; i++) {
			Map<String, Object> userMap = new HashMap<String, Object>();
			String imageURL = "http://localhost:8080/HeroAcademy/assets/" + String.format("%04d",
					(int) Math.floor(Math.random() * HeroAcademyConstants.NUMBER_OF_SAMPLE_IMAGES)) + ".jpg";
			userMap.put("image", imageURL);
			userMap.put("password", "12345678");
			String gender = Math.random() < 0.5 ? "F" : "M";
			userMap.put("gender", gender);
			String fName = gender.equals("M") ? randomValues(fantasyMaleFirstNames)
					: randomValues(fantasyFemaleFirstNames);
			userMap.put("firstName", fName);
			userMap.put("middleName", "");
			String lName = randomValues(lastNamesSet);
			userMap.put("lastName", lName);
			String userName = fName.substring(0, 2) + lName;
			userMap.put("userName", userName);
			String dob = Long.toString(getRandomDate());
			userMap.put("dob", dob);
			userMap.put("primaryEmail", "shreymathur93@gmail.com");
			userMap.put("secondaryEmail", "shreymathur93@gmail.com");
			userMap.put("height", Integer.toString(((int) Math.floor(Math.random() * 10))+1));
			userMap.put("weight", Integer.toString(((int) Math.floor(Math.random() * 10))+1));
			userMap.put("strength", Integer.toString(((int) Math.floor(Math.random() * 10))+1));
			userMap.put("speed", Integer.toString(((int) Math.floor(Math.random() * 10))+1));
			userMap.put("intelligence", Integer.toString(((int) Math.floor(Math.random() * 10))+1));
			userMap.put("stamina", Integer.toString(((int) Math.floor(Math.random() * 10))+1));
			userMap.put("willpower", Integer.toString(((int) Math.floor(Math.random() * 10))+1));
			userMap.put("fortitude", Integer.toString(((int) Math.floor(Math.random() * 10))+1));
			userMap.put("durabillity", Integer.toString(((int) Math.floor(Math.random() * 10))+1));
			userMap.put("coordination", Integer.toString(((int) Math.floor(Math.random() * 10))+1));

			userMap.put("race", Integer.toString(((int) Math.floor(Math.random() * 15))+1));
			userMap.put("symbol", Integer.toString(((int) Math.floor(Math.random() * 158))+1));
			userMap.put("element", Integer.toString( ((int) Math.floor(Math.random() * 9))+1 ));

			Map<String, String> skillsMap = new HashMap<String, String>();
			for(int k=0;k<3;k++){
				skillsMap.put(Integer.toString(((int) Math.floor(Math.random() * 150))+1), Integer.toString(((int) Math.floor(Math.random() * 10))+1));
			}
			/*skillsMap.put(Integer.toString(((int) Math.floor(Math.random() * 150))+1), Integer.toString(((int) Math.floor(Math.random() * 10))+1));
			skillsMap.put(Integer.toString(((int) Math.floor(Math.random() * 150))+1), Integer.toString(((int) Math.floor(Math.random() * 10))+1));*/
			userMap.put("skills", skillsMap);

			JSONObject userObj = new JSONObject(userMap);
			userArray.add(userObj);
		}

		System.out.println("loop over");

		try {
			SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
			String fileName = "C:\\WORK\\projectSourceCodes\\Hero-Academy-V2\\userJSONFile" + ft.format(new Date()) + ".json";
			File file1 = new File(fileName);
			file1.createNewFile();
			FileWriter fileWriter = new FileWriter(file1);
			System.out.println("Writing JSON object to file " + fileName);
			fileWriter.write(userArray.toJSONString());
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static long getRandomDate() {
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		Date fromTimeStamp = new Date();
		try {
			fromTimeStamp = ft.parse("1900-00-01");
		} catch (Exception e) {
			System.out.println("Unparseable using " + ft);
		}
		Date toTimeStamp = new Date();
		// System.out.println("to = "+ toTimeStamp.getTime() + " || from =
		// "+fromTimeStamp.getTime());
		long diff = toTimeStamp.getTime() - fromTimeStamp.getTime();
		long diff2 = (long) (Math.random() * (double) diff);
		long newTime = fromTimeStamp.getTime() + diff2;
		// System.out.println(diff + " || " + diff2 + " || " + newTime);
		// Date output = new Date(newTime);
		// return output;
		return newTime;
	}

	static String randomValues(String[] list) {
		double index = Math.floor(Math.random() * list.length);
		return list[(int) index];
	}

	static String[] fantasyMaleFirstNames = { "Ptorik", "Joz", "Varog", "Gethrod", "Hezra", "Feron", "Ophni", "Colborn",
			"Fintis", "Gatlin", "Jinto", "Hagalbar", "Krinn", "Lenox", "Revvyn", "Hodus", "Dimian", "Paskel", "Kontas",
			"Weston", "Azamarr", "Jather", "Tekren", "Jareth", "Adon", "Zaden", "Eune", "Graff", "Tez", "Jessop",
			"Gunnar", "Pike", "Domnhar", "Baske", "Jerrick", "Mavrek", "Riordan", "Wulfe", "Straus", "Tyvrik",
			"Henndar", "Favroe", "Whit", "Jaris", "Renham", "Kagran", "Lassrin", "Vadim", "Arlo", "Quintis", "Vale",
			"Caelan", "Yorjan", "Khron", "Ishmael", "Jakrin", "Fangar", "Roux", "Baxar", "Hawke", "Gatlen", "Barak",
			"Nazim", "Kadric", "Paquin", "Kent", "Moki", "Rankar", "Lothe", "Ryven", "Clawsen", "Pakker", "Embre",
			"Cassian", "Verssek", "Dagfinn", "Ebraheim", "Nesso", "Eldermar", "Rivik", "Rourke", "Barton", "Hemm",
			"Sarkin", "Blaiz", "Talon", "Agro", "Zagaroth", "Turrek", "Esdel", "Edard", "John", "Abraham", "Brandon",
			"Tyrion", "James", "Peter", "Bruce", "Clark", "Charles", "Richard", "Edward", "Nicolas" };

	static String[] fantasyFemaleFirstNames = { "Syrana", "Resha", "Varin", "Wren", "Yuni", "Talis", "Kessa",
			"Magaltie", "Aeris", "Desmina", "Krynna", "Asralyn", "Herra", "Pret", "Kory", "Afia", "Tessel", "Rhiannon",
			"Zara", "Jesi", "Belen", "Rei", "Ciscra", "Temy", "Renalee", "Estyn", "Maarika", "Lynorr", "Tiv", "Annihya",
			"Semet", "Tamrin", "Antia", "Reslyn", "Basak", "Vixra", "Pekka", "Xavia", "Beatha", "Yarri", "Liris",
			"Sonali", "Razra", "Soko", "Maeve", "Everen", "Yelina", "Morwena", "Hagar", "Palra", "Elysa", "Sage",
			"Ketra", "Lynx", "Agama", "Thesra", "Tezani", "Ralia", "Esmee", "Heron", "Naima", "Rydna", "Sparrow",
			"Baakshi", "Ibera", "Phlox", "Dessa", "Braithe", "Taewen", "Larke", "Silene", "Phressa", "Esther", "Anika",
			"Rasy", "Harper", "Indie", "Vita", "Drusila", "Minha", "Surane", "Lassona", "Merula", "Kye", "Jonna",
			"Lyla", "Zet", "Orett", "Naphtalia", "Turi", "Rhays", "Shike", "Hartie", "Beela", "Leska", "Vemery",
			"Lunex", "Fidess", "Tisette", "Partha" };

	static String[] lastNamesSet = { "Abawi", "Allard", "Adara", "Abbott", "Acampora", "Ackerman", "Ackroyd",
			"Abbington", "Axworthy", "Ainge", "Abernathy", "Atkinson", "Abner", "Abella", "Agholor", "Allred", "Asola",
			"Abrams", "Acker", "Abrell", "Acuff", "Archer", "Asterio", "Adair", "Albright", "Adelson", "Atwood",
			"Aguillar", "Adler", "Arrowood", "Agnew", "Akuna", "Alcott", "Alstott", "Austin", "Algarotti", "Alvarez",
			"Armani", "Anderson", "Amherst", "Adkins", "Ayesa", "Argento", "Arrowood", "Andruzzi", "Abraham", "Angle",
			"Armstrong", "Attard", "Annenberg", "Arrhenius", "Acosta", "Antrican", "Adderley", "Atwater", "Agassi",
			"Apatow", "Archeletta", "Averescu", "Arrington", "Agrippa", "Aiken", "Albertson", "Alexander", "Amado",
			"Anders", "Armas", "Akkad", "Aoki", "Aldrich", "Almond", "Alinsky", "Agnello", "Bynes", "Bray", "Budreau",
			"Byrne", "Bragg", "Banner", "Bishop", "Burris", "Boggs", "Brembilla", "Booth", "Bullard", "Booker",
			"Buckner", "Borden", "Breslin", "Bryant", "BIles", "Brunt", "Brager", "Brandt", "Bosa", "Bradshaw",
			"Brubaker", "Berry", "Brooks", "Bandini", "Bristow", "Barrick", "Biddle", "Brennan", "Brinkmann", "Benz",
			"Braddock", "Bright", "Berman", "Bracco", "Bartley", "Briggs", "Bonanno", "Boyle", "Beeks", "Bernthal",
			"Boldon", "Bowser", "Benwikere", "Bowman", "Bamberger", "Bowden", "Batch", "Blaustein", "Blow", "Boulware",
			"Bezos", "Boulder", "Bauer", "Ballard", "Benton", "Bixby", "Bostwick", "Biles", "Bobusic", "Belinski",
			"Blood", "Bisley", "Bettis", "Bensen", "Binion", "Bloch", "Blixt", "Bellisario", "Botkin", "Benoit",
			"BInda", "Baldwin", "Bennett", "Bourland", "Bester", "Bender", "Best", "Bald", "Bersa", "Belt", "Bourne",
			"Barks", "Beebe", "Banu", "Bozzelli", "Bogaerts", "Cyrus", "Craggs", "Crisper", "Cotheran", "Curry",
			"Conard", "Cutler", "Coggins", "Cates", "Crisp", "Curio", "Creed", "Costner", "Cortse", "Cunningham",
			"Cooper", "Cullen", "Castle", "Cugat", "Click", "Cassidy", "Crespo", "Crusher", "Cooper", "Coates",
			"Crowley", "Creel", "Crassus", "Cogdill", "Cross", "Crabtree", "Cranham", "Carver", "Cox", "Coltrane",
			"Chatwin", "Conklin", "Colt", "Coulter", "Cleveland", "Coppens", "Coolidge", "Copeland", "Celino", "Coffin",
			"Cena", "Conti", "Coin", "Connelly", "Cents", "Carney", "Carmichael", "Coffey", "Carling", "Christie",
			"Chadwick", "Cobo", "Clay", "Capra", "Candy", "Clancy", "Chalk", "Chambers", "Callahan", "Cirque",
			"Cabrera-Bello", "Cherry", "Cannon", "Chung", "Cave", "Challenger", "Cobb", "Calaway", "Chalut", "Cayce",
			"Cahill", "Cruz", "Cohen", "Caylor", "Cagle", "Cline", "Crawford", "Cleary", "Cain", "Champ", "Dubois",
			"Darby", "Draper", "Dwyer", "Dixon", "Danton", "Devereaux", "Ditka", "Dominguez", "Decker", "Dobermann",
			"Dunlop", "Dumont", "Dandridge", "Diamond", "Dobra", "Dukas", "Dyer", "Decarlo", "Delpy", "Dufner",
			"Driver", "Dalton", "Dark", "Dawkins", "Driskel", "Derbyshire", "Davenport", "Dabney", "Dooley",
			"Dickerson", "Donovan", "Dallesandro", "Devlin", "Donnelly", "Day", "Daddario", "Donahue", "Denver",
			"Denton", "Dodge", "Dempsey", "Dahl", "Earp", "Eberstark", "Egan", "Elder", "Eldridge", "Ellenburg",
			"Eslinger", "England", "Epps", "Eubanks", "Everhart", "Evert", "Eastwood", "Elway", "Eslinger",
			"Ellerbrock", "Edge", "Endo", "Etter", "Ebersol", "Everson", "Earwood", "Ekker", "Future", "Fitzpatrick",
			"Fontana", "Fenner", "Furyk", "Finch", "Fullbright", "Fassbinder", "Flood", "Fong", "Fleetwood", "Fugger",
			"Frost", "Fsik", "Fawcett", "Fishman", "Freeze", "Fissolo", "Foley", "Fairchild", "Freeman", "Flanagan",
			"Freed", "Fogerty", "Foster", "Finn", "Fletcher", "Floris", "Flynn", "Fairbanks", "Fawzi", "Finau",
			"Floquet", "Fleiss", "Ferguson", "Froning", "Fitzgerald", "Fingermann", "Flagg", "Finchum", "Flair",
			"Ferber", "Fuller", "Farrell", "Fenton", "Fangio", "Faddis", "Ferenz", "Farley", "Gundlach", "Gannon",
			"Goulding", "Greenway", "Guest", "Gillis", "Gellar", "Gaither", "Griffith", "Grubbs", "Glass", "Gotti",
			"Goodwin", "Grizzly", "Glover", "Grimes", "Gleason", "Gardner", "Geske", "Griffo", "Glunt", "Golden",
			"Gardel", "Gribble", "Grell", "Gearey", "Grooms", "Glaser", "Greer", "Geel", "Gallagher", "Glick", "Graber",
			"Gore", "Gabbard", "Gelpi", "Gilardi", "Goddard", "Gabel", "Hyde", "Hood", "Hull", "Hogan", "Hitchens",
			"Higgins", "Hodder", "Huxx", "Hester", "Huxley", "Hess", "Hutton", "Hobgood", "Husher", "Hitchcock",
			"Huffman", "Herrera", "Humber", "Hobbs", "Hostetler", "Henn", "Horry", "Hightower", "Hindley", "Hitchens",
			"Holiday", "Holland", "Hitchcock", "Hoagland", "Hilliard", "Harvick", "Hardison", "Hickey", "Heller",
			"Hartman", "Halliwell", "Hughes", "Hart", "Healy", "Head", "Harper", "Hibben", "Harker", "Hatton", "Hawk",
			"Hardy", "Hadwin", "Hemmings", "Hembree", "Helbig", "Hardin", "Hammer", "Hammond", "Haystack", "Howell",
			"Hatcher", "Hamilton", "Halleck", "Hooper", "Hartsell", "Henderson", "Hale", "Hokoda", "Heers", "Homa",
			"Inch", "Inoki", "Ingram", "Idelson", "Irvin", "Ives", "Ishikawa", "Irons", "Irwin", "Ibach", "Ivanenko",
			"Ibara", "Jurado", "Jammer", "Jagger", "Jackman", "Jishu", "Jingle", "Jessup", "Jameson", "Jett", "Jackson",
			"Kulikov", "Kellett", "Koo", "Kitt", "Keys", "Kaufman", "Kersey", "Keating", "Kotek", "Kuchar", "Katts",
			"Kilmer", "King", "Kubiak", "Koker", "Kerrigan", "Kumara", "Knox", "Koufax", "Keagan", "Kestrel", "Kinder",
			"Koch", "Keats", "Keller", "Kessler", "Kobayashi", "Klecko", "Khan", "Kicklighter", "Kincaid", "Kershaw",
			"Kaminsky", "Kirby", "Keene", "Kenny", "Keogh", "Litvak", "Lawler", "London", "Lynch", "Lacroix", "Ledford",
			"LeMay", "Lovejoy", "Lombardo", "Lovecraft", "Laudermilk", "Locke", "Leishman", "Leary", "Lott", "Ledger",
			"Lords", "Lacer", "Longwood", "Lattimore", "Laker", "Lecter", "Liston", "Londos", "Lomax", "Leaves",
			"Lipman", "Lambert", "Lesnar", "Lazenby", "Lichter", "Lafferty", "Lovin", "Lucchesi", "Murray", "Morrison",
			"McKay", "Merchant", "Murillo", "Mooney", "Murdock", "Matisse", "Massey", "McGee", "Minter", "Munson",
			"Mullard", "Mallory", "Meer", "Mercer", "Mulder", "Malik", "Moreau", "Metz", "Mudd", "Meilyr", "Motter",
			"McNamara", "Malfoy", "Moses", "Moody", "Morozov", "Mason", "Metcalf", "McGillicutty", "Montero",
			"Molinari", "Marsh", "Moffett", "McCabe", "Manus", "Malenko", "Mullinax", "Morrissey", "Mantooth", "Mintz",
			"Messi", "Mattingly", "Mannix", "Maker", "Montoya", "Marley", "McKnight", "Magnusson", "Marino", "Maddox",
			"Macklin", "Mackey", "Necessary", "Nicely", "Nejem", "Nunn", "Neiderman", "Naillon", "Nyland", "Novak",
			"Nygard", "Norwood", "Norris", "Namath", "Nabor", "Nash", "Noonan", "Nolan", "Nystrom", "Niles", "Napier",
			"Nunley", "Nighy", "Overholt", "Ogletree", "Opilio", "October", "Ozu", "O'Rourke", "Owusu", "Oduya", "Oaks",
			"Odenkirk", "Ottinger", "O'Donnell", "Orton", "Oakley", "Oswald", "Ortega", "Ogle", "Orr", "Ogden",
			"Onassis", "Olson", "Ollenrenshaw", "O'Leary", "O'Brien", "Oldman", "O'Bannon", "Oberman", "O'Malley",
			"Otto", "Prado", "Prunk", "Piper", "Putnam", "Pittman", "Post", "Price", "Plunkett", "Pitcher", "Pinzer",
			"Punch", "Paxton", "Powers", "Previn", "Pulman", "Puller", "Peck", "Pepin", "Platt", "Powell", "Pawar",
			"Pinder", "Pickering", "Pollock", "Perrin", "Pell", "Pavlov", "Patterson", "Perabo", "Patnick", "Panera",
			"Prescott", "Portis", "Perkins", "Palmer", "Paisley", "Pladino", "Pope", "Posada", "Pointer", "Poston",
			"Quinn", "Quan", "Quaice", "Quaid", "Quirico", "Quarters", "Quimby", "Qua", "Quivers", "Quall", "Quick",
			"Qugg", "Quint", "Rudd", "Ripperton", "Renfro", "Rifkin", "Rand", "Root", "Rhodes", "Rowland", "Ramos",
			"Ryan", "Rafus", "Radiguet", "Ripley", "Ruster", "Rush", "Race", "Rooney", "Russo", "Rude", "Roland",
			"Reader", "Renshaw", "Rossi", "Riddle", "Ripa", "Richter", "Rosenberg", "Romo", "Ramirez", "Reagan",
			"Rainwater", "Romirez", "Riker", "Riggs", "Redman", "Reinhart", "Redgrave", "Rafferty", "Rigby", "Roman",
			"Sutton", "Swift", "Sorrow", "Spinks", "Suggs", "Seagate", "Story", "Soo", "Sullivan", "Sykes", "Skirth",
			"Silver", "Small", "Stoneking", "Sweeney", "Surrett", "Swiatek", "Sloane", "Stapleton", "Seibert", "Stroud",
			"Strode", "Stockton", "Scardino", "Spacek", "Spieth", "Stitchen", "Stiner", "Soria", "Saxon", "Shields",
			"Stelly", "Steele", "Standifer", "Shock", "Simerly", "Swafford", "Stamper", "Sotelo", "Smoker", "Skinner",
			"Shaver", "Shivers", "Savoy", "Small", "Skills", "Sinclair", "Savage", "Sereno", "Sasai", "Silverman",
			"Silva", "Shippen", "Sasaki", "Sands", "Shute", "Sabanthia", "Sheehan", "Sarkis", "Shea", "Santos",
			"Snedeker", "Stubbings", "Streelman", "Skaggs", "Twigg", "Tracy", "Truth", "Tillerson", "Thorisdottir",
			"Tooms", "Tripper", "Tway", "Taymor", "Tamlin", "Toller", "Tussac", "Turpin", "Tippett", "Tabrizi",
			"Tanner", "Tuco", "Trumbo", "Tucker", "Theo", "Thain", "Trapp", "Trumbald", "Trench", "Terrella", "Tait",
			"Tanaka", "Tapp", "Tepper", "Trainor", "Turner", "Teague", "Templeton", "Temple", "Teach", "Tam", "Udder",
			"Uso", "Uceda", "Umoh", "Underhill", "Uplinger", "Ulett", "Urtz", "Unger ", "Vroman", "Vess", "Voight",
			"Vegas", "Vasher", "Vandal", "Vader", "Volek", "Vega", "Vestine", "Vaccaro", "Vickers", "Witt", "Wolownik",
			"Winding", "Wooten", "Whitner", "Winslow", "Winchell", "Winters", "Walsh", "Whalen", "Watson", "Wooster",
			"Woodson", "Winthrop", "Wall", "Wight", "Webb", "Woodard", "Wixx", "Wong", "Whesker", "Wolfenstein",
			"Winchester", "Wire", "Wolf", "Wheeler", "Warrick", "Walcott", "Wilde", "Wexler", "Wells", "Weeks",
			"Wainright", "Wallace", "Weaver", "Wagner", "Wadd", "Withers", "Whitby", "Woodland ", "Xavier", "Xanders",
			"Xang", "Ximinez", "Xie", "Xenakis", "Xu", "Xiang", "Xuxa", "Yearwood", "Yellen", "Yaeger", "Yankovich",
			"Yamaguchi", "Yarborough", "Youngblood", "Yanetta", "Yadao", "Yale", "Yasumoto", "Yates ", "Zuckerberg",
			"Zeck", "Zavaroni", "Zeller", "Zipser", "Zedillo", "Zook", "Zeigler", "Zimmerman", "Zeagler", "Zale",
			"Zasso", "Zant", "Zappa", "Zapf", "Zahn", "Zabinski", "Zade", "Zabik", "Zader", "Zukoff", "Zullo", "Swan",
			"Starr", "Herold", "Ramey", "Lester", "Shepherley", "Kipke", "Sessions", "Horowitz", "Rise", "Blackledge",
			"Sikora", "Krynski", "Sterling", "Queen", "Noble", "Dever", "Jaeger", "Stark", "Targeryon", "Lannistor",
			"Baratheon", "Wayne", "Lincoln", "Roy", "Martell", "Greyjoy", "Arryn", "Caesar", "Bolton" };

	static String[] vikingsFirstNames = { "Aesir", "Axe", "Bear", "Berg", "Biscuit", "Blade", "Blood", "Blue", "Boar",
			"Board", "Bone", "Cage", "Cave", "Cheese", "Code", "Coffee", "Death", "Dragon", "Dwarf", "Eel", "Elk",
			"Fjord", "Flame", "Flour", "Forge", "Fork", "Fox", "Frost", "Furnace", "Goat", "God", "Gold", "Granite",
			"Griffon", "Grim", "Haggis", "Hall", "Hamarr", "Helm", "Horn", "Horse", "House", "Huskarl", "Ice",
			"Iceberg", "Jarl", "Kelp", "Kettle", "Kraken", "Lake", "Long", "Mace", "Maelstrom", "Mail", "Mammoth",
			"Man", "Many", "Mead", "Mountain", "Noun", "Oath", "Owl", "Pain", "Peak", "Pot", "Rat", "Raven", "Red",
			"Refreshingbeverage", "Ring", "Rock", "Root", "Rune", "Salmon", "Sap", "Sea", "Shield", "Ship", "Sky",
			"Slush", "Smoke", "Snow", "Spear", "Squid", "Steam", "Stone", "Swine", "Three", "Tongue", "Torch", "Tree",
			"Troll", "Ulfsark", "Unsightly", "Valkyrie", "Wave", "White", "Woman", "Worm", "Wyvern" };

	static String[] vikingsLastNames = { "Admirer", "Arm", "Back", "Baker", "Basher", "Beard", "Bearer", "Bender",
			"Blade", "Blender", "Blood", "Boiler", "Bone", "Boot", "Borer", "Born", "Bow", "Breaker", "Breeder",
			"Bringer", "Brow", "Builder", "Chaser", "Chiller", "Collar", "Counter", "Clubber", "Curser", "Dancer",
			"Dottir", "Dreamer", "Drinker", "Drowner", "Ear", "Eater", "Face", "Fearer", "Foot", "Friend", "Fury",
			"Gorer", "Grim", "Grinder", "Grower", "Growth", "Hacker", "Hall", "Ham", "Hammer", "Hand", "Hands", "Head",
			"Hilt", "Hunter", "Killer", "Leg", "Licker", "Liker", "Lost", "Lover", "Masher", "Mender", "Minder",
			"Miner", "Mocker", "Monger", "Neck", "Rage", "Rhyme", "Rider", "Ringer", "Roarer", "Roller", "Sailor",
			"Screamer", "Sequel", "Server", "Shield", "Shoe", "Singer", "Skinner", "Slinger", "Slugger", "Smasher",
			"Sniffer", "Stinker", "Sucker", "Sword", "Tail", "Tamer", "Taster", "Thigh", "Tongue", "Tracker", "Washer",
			"Wielder", "Wing", "Wisher", "Wrath" };

	static String[] colors = { "Red", "blue", "green", "Yellow", "Orange", "Purple", "White", "Black", "Grey" };
	static String[] cities = { "London", "New York", "Tokyo", "Paris", "Rio De Janerio", "Moscow", "Hong Kong",
			"Los Angeles", "Bombay", "Sydney" };

	static String[] fantasyLocation = { "Noble Crest Stables", "Gibb’s Farm", "Triple Axes Pub", "Arrowhead Inn",
			"Yeomen’s Manor", "Bootstraps & Buckles Cobbler", "Dwarf’s Gullet Tavern", "Hollowvale Village",
			"Thunder Hoof Stables", "Clipper’s County", "Gresgo’s Pond", "Hemm’s Tailors", "Ditch’n’Dagger Tavern",
			"Twin Horses Lake Town", "Boggs Landing", "Heatherstown Village", "Trekker’s Square", "Embris Hollow",
			"Zagoroth Mountain Town", "Padsley Village", "Sleeping Dragon Inn", "Ramoth Lye Creek", "Dragmire Drove",
			"Archer’s Ale House", "Peeker’s Valley", "Anvil & Flint Blacksmithery", "Artwork by Jongmin Ahn",
			"Pale Thorn Cove", "Fang Peak", "Arc of the Holy Shield Monastery", "Breggo’s Beard Brewery",
			"Golden Stalk Granary", "Saw and Splinter’s Woodshop", "Siren’s Shipyard", "Silver Fin Fishery",
			"Addler’s Drove", "Black Morrow Marshes", "Shepherd’s Field", "Honeyclover Meadow", "Finch & Fox Inn",
			"The Warren Pub", "Fennel & Fallow Bakery", "Rose & Crown Tavern", "Knight’s Motte and Bailey",
			"White Elk Hall", "Briar Bridge Village", "Mighty Hart Furriers", "Ekhart Bridge", "The Magpie’s Market",
			"Thresh’s Cove", "Denmarrow Mountains", "Simple Beasts Watering Hole", "Lowly Strider Almshouse",
			"Miss Plunkerhouse’s Grand Tailors", "White Lion Halls", "Thousand Lanterns Inn",
			"Wild Hare Country Tavern", "Laskerville Village", "Scout’s Towers", "Golden Longbow Fields",
			"Tuckborrow Village", "Trader’s Turn Plaza", " Stoneburrow Town", "Brather’s Town", "Stout Dragon Tavern",
			"Dueling Swords Blacksmithery", "The Braided Plait Bakery", "Mossy Stone Cove", "Fairy Winds Beach",
			"Old Stone Giant Mill", "Sacred Scroll Holy Monastery", "King Rothenham Square", "Brewer’s Bounty Alehouse",
			"Oslocrest Town", "Parsca’s Plaza", "Old Mayfield Farms", "Fowler’s Prize Furrers", "Iron Halberd Smithy",
			"Dukes Valley", "Burrowing Badger Inn", "Pork Belly’s Butcher Shop", "Cast Iron Almshouse",
			"Three Braided Beards Tavern", "King’s Own Tailors", "County Arms Smithy", "Golden Rise Bakery",
			"Spotted Finch Meadows", "Fairy Sisters Pasture", "Twin Owls Inn", "Snow Bard Village", "DarkVale Valley",
			"Tallard’s Orchards", "Two Moons Cove", "Star Fin Shipyard", "White Wind Mill Bakery",
			"Troll’s Hand Masons", "Vatrecastle Village", "Archer’s Arm Tavern", "Throne of the Ancient One Temple",
			"Swift Axes Woodcutter Shoppe ", "Evenly Yoked Stables", "Open Hands Almshouse", "Far Wren Village" };
}