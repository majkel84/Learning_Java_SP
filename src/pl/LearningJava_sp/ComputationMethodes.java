package pl.LearningJava_sp;

import java.util.Scanner;

public class ComputationMethodes implements Computation {

		@Override
		public double Multiplication(double arg1, double arg2) {
			double multiplesByPi = arg1 * Math.PI;
			System.out.println("type conversion to int: " + (int)multiplesByPi);
			System.out.println("standard double value: " + multiplesByPi);
			return arg1 * arg2;
		}		
	
		@Override
		public double Addition(double arg1, double arg2) {
			return arg1 + arg2;
		}
		
		@Override
		public double Division(int arg1, int arg2) {
			//double division = 
			return (double)arg1/(double)arg2;
		}
		
		@Override
		public char chooseAction() {
			System.out.println("Select method: + or *");
			Scanner scanner = new Scanner(System.in);
			char c = scanner.next().charAt(0);
			scanner.close();
			return c;
		}
		
		@Override
		public void menuComputation(char sc) {
			switch (sc) {
			case '+':
				System.out.println(Addition(2, 3));
				break;
			case '*':
				System.out.println(Multiplication(2, 3));
				break;
				default:
					System.out.println("Wrong option");	
					break;		
			}
		}
		
		@Override
		public double sqrtEquation(double number) {
			if (number < 0)
				throw new IllegalArgumentException("Number lower than 0");
			return java.lang.Math.sqrt(number);
		}
}
