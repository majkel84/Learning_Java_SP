package pl.LearningJava_sp;

import java.lang.String;

public class Humans extends Mammals {
	private String name;
	private String surname;
	private Colors eyeColor;
	private Colors hairColor;
	
	public Humans() {}
	
	public Humans(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public Humans(String name, String surname, Colors eyeColor, Colors hairColor) {
		this.name = name;
		this.surname = surname;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public Colors getEyeColor() {
		return eyeColor;
	}
	
	public Colors getHairColor() {
		return hairColor;
	}
	
	public String getHumanInfo() {
		return this.name + '\t' + this.surname + '\t' + this.eyeColor + '\t' + this.hairColor;
	}
	
	@Override
	final public String toString() {
		return super.toString() + " Specie: " + getClass().getSimpleName();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Humans) {
			Humans newHuman = (Humans) obj;
			return name.equals(newHuman.name) &&
					surname.equals(newHuman.surname);
		}
		return false;
	}
	
}
