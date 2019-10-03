package pl.LearningJava_sp;

public class ComputationMethodes implements Computation {

		@Override
		public double Multiplication(double arg1, double arg2) {
			return arg1 * arg2;
		}		
	
		@Override
		public double Addition(double arg1, double arg2) {
			return arg1 + arg2;
		}		
}
