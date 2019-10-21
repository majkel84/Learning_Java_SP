package pl.LearningJava_sp;

public class Humans extends Mammals {
	private String name;
	private String surname;
	
	public Humans() {}
	
	public Humans(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
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
