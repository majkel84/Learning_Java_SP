package pl.LearningJava_sp;

public class main {
	
	private static int length = 0;
	
	public static String sentence (String sent) {
		System.out.println(sent);
		length += sent.length();
		return sent;
	}
	
	public static int summary (int ... numbers) {
		int sum = 0;
		for (int num : numbers)
			sum += num;
		System.out.println(sum);
		return sum;
	}
	
	public static int maxValue (int ... numbers) {
		int max = 0;
		for (int num : numbers)
			if (num > max)
				max = num;
		
		return max;
	}

	public static void main(String[] args) {
		
		sentence("first");
		sentence("second");
		sentence("third");
		System.out.println(length);
		summary(3, 7);
		System.out.println(maxValue(1, 4, 5, 2));
	}

}
