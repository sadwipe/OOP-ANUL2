package tema1;

public class Curs2 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		float minFloat = Float.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		double minDouble = Double.MIN_VALUE;
		
		
		System.out.println("Operatori unari: ");
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("--a = " + (--a));
		System.out.println("++a = " + (++a));
		System.out.println("****************");
		System.out.println("Valoarea maxima pentru int: " + maxInt);
		System.out.println("Valoarea minima pentru int: " + minInt);
		
		System.out.println("Valoarea maxima pentru long: " + maxLong);
		System.out.println("Valoarea minima pentru long: " + minLong);
		
		System.out.println("Valoarea maxima pentru float: " + maxFloat);
		System.out.println("Valoarea minima pentru float: " + minFloat);
		
		System.out.println("Valoarea maxima pentru double: " + maxDouble);
		System.out.println("Valoarea minima pentru double: " + minDouble);
	}
}
