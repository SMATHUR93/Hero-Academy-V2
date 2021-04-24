package com.shrek.HeroAcademyV2.to;

import java.util.List;

import com.shrek.HeroAcademyV2.model.Element;
import com.shrek.HeroAcademyV2.model.Race;
import com.shrek.HeroAcademyV2.model.Skill;
import com.shrek.HeroAcademyV2.model.Symbol;

public class AllInformationTO {

	List<Element> elements;
	List<Race> races;
	List<Symbol> symbols;
	List<Skill> skills;

	public List<Element> getElements() {
		return elements;
	}

	public void setElements(List<Element> elements) {
		this.elements = elements;
	}

	public List<Race> getRaces() {
		return races;
	}

	public void setRaces(List<Race> races) {
		this.races = races;
	}

	public List<Symbol> getSymbols() {
		return symbols;
	}

	public void setSymbols(List<Symbol> symbols) {
		this.symbols = symbols;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

}