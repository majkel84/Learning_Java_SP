package pl.LearningJava_sp;

import pl.LearningJava_sp.BasicMethodes;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		BasicMethodes basicMethodes = new BasicMethodes();
		ComputationMethodes computationMethodes = new ComputationMethodes();
		Humans human = new Humans();

		System.out.println(basicMethodes.sentence("first"));
		System.out.println(basicMethodes.summary(3, 7));
		System.out.println(basicMethodes.maxValue(1, 4, 5, 2));
		basicMethodes.printingNumbers(10, 15);
		System.out.println();
		int tab[] = {1, 2, 4, 10};
		int tab2[][] = {{2, 4}, {3, 5}};
		basicMethodes.countNumbers(tab);
		System.out.println(basicMethodes.notesAverage(tab2));
		
		System.out.println("Select method: + or *");
		Scanner scanner = new Scanner(System.in);
		char c = scanner.next().charAt(0);
		switch (c) {
		case '+':
			System.out.println(computationMethodes.Addition(2, 3));
			break;
		case '*':
			System.out.println(computationMethodes.Multiplication(2, 3));
			break;
			default:
				System.out.println("Try again");	
				scanner = new Scanner(System.in);
				c = scanner.next().charAt(0);
				break;
		}	
		System.out.println(human.toString());
	}
}
