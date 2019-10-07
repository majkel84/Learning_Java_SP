package pl.LearningJava_sp;

public class Humans extends Mammals {
	@Override
	final public String toString() {
		return super.toString() + " Specie: " + getClass().getSimpleName();
	}
}
