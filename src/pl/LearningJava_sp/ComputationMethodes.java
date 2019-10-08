package pl.LearningJava_sp;

import java.util.Scanner;

public class ComputationMethodes implements Computation {

		@Override
		public double Multiplication(double arg1, double arg2) {
			return arg1 * arg2;
		}		
	
		@Override
		public double Addition(double arg1, double arg2) {
			return arg1 + arg2;
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
}
