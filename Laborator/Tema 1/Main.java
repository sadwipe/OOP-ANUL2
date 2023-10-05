import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int a, b, answer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdu primul numar: ");
		a = sc.nextInt();
		
		System.out.println("Introdu al doilea numar: ");
		b = sc.nextInt();
		
		System.out.println("Introdu rezultatul sumei numerelor " + a + " si " + b + ": ");
		answer = sc.nextInt();
		
		System.out.println((answer == (a + b) ? "Ai raspuns corect!" : "Gresit! Raspunsul corect era: " + (a+b)));
	}
}