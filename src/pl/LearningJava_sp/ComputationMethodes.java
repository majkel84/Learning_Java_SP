package pl.LearningJava_sp;

import java.util.Scanner;

public class ComputationMethodes implements Computation {

		@Override
		public char chooseAction() {
			System.out.println("Select method: +, -, *, /");
			Scanner scanner = new Scanner(System.in);
			char c = scanner.next().charAt(0);
			scanner.close();
			return c;
		}
		
		@Override
		public void menuComputation(char sc) {
			switch (sc) {
			case '+':
				System.out.println(Calculator.ADD.perform(2, 3));
				break;
			case '-':
				System.out.println(Calculator.SUBSTRACT.perform(2, 3));
				break;
			case '*':
				System.out.println(Calculator.MULTIPLY.perform(2, 3));
				break;
			case '/':
				System.out.println(Calculator.DIVIDE.perform(2, 3));
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
