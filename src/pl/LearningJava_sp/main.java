package pl.LearningJava_sp;

import pl.LearningJava_sp.BasicMethodes;

public class main {

	public static void main(String[] args) {
		
		BasicMethodes basicMethodes = new BasicMethodes();

		System.out.println(basicMethodes.sentence("first"));
		System.out.println(basicMethodes.summary(3, 7));
		System.out.println(basicMethodes.maxValue(1, 4, 5, 2));
		basicMethodes.printingNumbers(10, 15);
		System.out.println();
		int tab[] = {1, 2, 4, 10};
		basicMethodes.countNumbers(tab);
	}
}
