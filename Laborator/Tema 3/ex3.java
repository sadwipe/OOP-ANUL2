//Se citeste un numar natural N. Sa se calculeze termenul de rang N din sirul lui Fibonacci.

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti N: ");
		n = scanner.nextInt();
		System.out.println("Termenul de rang " + n + " este: " + calculTermenFibonacci(n));
	}
	
	private static int calculTermenFibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		
		return calculTermenFibonacci(n - 2) + calculTermenFibonacci(n - 1);
	}
	
	
}