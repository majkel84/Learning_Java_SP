package pl.LearningJava_sp;

public abstract class Mammals extends Animals {
	@Override
	public String toString() {
		return super.toString() + "Classis: " + getClass().getName();
	}
}
