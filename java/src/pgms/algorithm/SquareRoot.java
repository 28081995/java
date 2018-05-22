package pgms.algorithm;

public class SquareRoot {
	public static void main(String[] args) {
		double number = Double.parseDouble(args[0]);
		double res = sqrt(number);
		System.out.println(res);
	}

	public static double sqrt(double c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - (c / t)) > (epsilon * t)) {
			t = ((c / t) + t) / 2.0;
		}
		return t;
	}
}
