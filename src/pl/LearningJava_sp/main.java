package pl.LearningJava_sp;

import pl.LearningJava_sp.BasicMethodes;

public class main {
	static int tab[] = {1, 2, 4, 10};
	static int tab2[][] = {{2, 4}, {3, 5}};

	public static void main(String[] args) {
		
		BasicMethodes basicMethodes = new BasicMethodes();
		ComputationMethodes computationMethodes = new ComputationMethodes();
		Humans human = new Humans();
		Humans human1 = new Humans("Bob", "Nowak");
		Humans human2 = new Humans("Bob", "Nowak");
		Humans human3 = new Humans("Bob", "Nowak", Colors.BLUE, Colors.YELLOW);

		System.out.println(basicMethodes.sentence("first"));
		System.out.println(basicMethodes.summary(3, 7));
		System.out.println(basicMethodes.maxValue(1, 4, 5, 2));
		basicMethodes.printingNumbers(10, 15);
		System.out.println();
		basicMethodes.countNumbers(tab);
		System.out.println(basicMethodes.notesAverage(tab2));
		computationMethodes.menuComputation(computationMethodes.chooseAction());
		System.out.println(computationMethodes.sqrtEquation(9));
		System.out.println(human.toString());
		System.out.println("humen1 equals human 2: " + human1.equals(human2));
		System.out.println(human3.getHumanInfo());
	}
}
