package pl.LearningJava_sp;

public interface Computation {
	double Multiplication (double arg1, double arg2);
	double Addition (double arg1, double arg2);
	double Division (int arg1, int arg2);
	void menuComputation(char sc);
	char chooseAction();
	double sqrtEquation(double number);
}
