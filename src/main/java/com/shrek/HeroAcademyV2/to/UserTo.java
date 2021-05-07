package com.shrek.HeroAcademyV2.to;

import java.util.Date;

public class UserTo {

    String image;
    String firstName;
    String middleName;
    String lastName;
    String userName;
    String password;
    String gender;
    String primaryEmail;
    String secondaryEmail;

    Date dob;

    Integer height;
    Integer weight;
    Integer strength;
    Integer speed;
    Integer intelligence;
    Integer stamina;
    Integer willpower;
    Integer fortitude;
    Integer durabillity;
    Integer coordination;

    Integer race;
    Integer symbol;
    Integer element;
    int[] skillsLevelArray;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getWillpower() {
        return willpower;
    }

    public void setWillpower(Integer willpower) {
        this.willpower = willpower;
    }

    public Integer getFortitude() {
        return fortitude;
    }

    public void setFortitude(Integer fortitude) {
        this.fortitude = fortitude;
    }

    public Integer getDurabillity() {
        return durabillity;
    }

    public void setDurabillity(Integer durabillity) {
        this.durabillity = durabillity;
    }

    public Integer getCoordination() {
        return coordination;
    }

    public void setCoordination(Integer coordination) {
        this.coordination = coordination;
    }

    public Integer getRace() {
        return race;
    }

    public void setRace(Integer race) {
        this.race = race;
    }

    public Integer getSymbol() {
        return symbol;
    }

    public void setSymbol(Integer symbol) {
        this.symbol = symbol;
    }

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public int[] getSkillsLevelArray() {
        return skillsLevelArray;
    }

    public void setSkillsLevelArray(int[] skillsLevelArray) {
        this.skillsLevelArray = skillsLevelArray;
    }

    public UserTo() {
    }

    public UserTo(String image, String firstName, String middleName, String lastName, String userName, String password, String gender, String primaryEmail, String secondaryEmail, Date dob, Integer height, Integer weight, Integer strength, Integer speed, Integer intelligence, Integer stamina, Integer willpower, Integer fortitude, Integer durabillity, Integer coordination, Integer race, Integer symbol, Integer element, int[] skillsLevelArray) {
        this.image = image;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.gender = gender;
        this.primaryEmail = primaryEmail;
        this.secondaryEmail = secondaryEmail;
        this.dob = dob;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.speed = speed;
        this.intelligence = intelligence;
        this.stamina = stamina;
        this.willpower = willpower;
        this.fortitude = fortitude;
        this.durabillity = durabillity;
        this.coordination = coordination;
        this.race = race;
        this.symbol = symbol;
        this.element = element;
        this.skillsLevelArray = skillsLevelArray;
    }
}
