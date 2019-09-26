package pl.LearningJava_sp;

public class BasicMethodes {
	
	private static int length = 0;

	public int sentence (String sent) {
		System.out.println(sent);
		length += sent.length();
		return length;
	}

	public int summary (int ... numbers) {
		int sum = 0;
		for (int num : numbers)
			sum += num;
		return sum;
	}

	public int maxValue (int ... numbers) {
		int max = 0;
		for (int num : numbers)
			if (num > max)
				max = num;
		return max;
	}

}
