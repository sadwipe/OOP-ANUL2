//Se citesc n1 si n2 capetele unui interval inchis. Sa se afiseze daca in intervalul [n1, n2] exista cel putin un numar prim.

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int a, b;
		boolean hasPrime = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti capetele intervalelor: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		// parcurgem intervalul[a, b]
		for(int i = a; i <= b; i++) {
			// daca gasim un numar care este prim intrerupem for si-l afisam.
			if(isPrime(i)) {
				hasPrime = true;
				System.out.println("Intervalul contine un numarul prim: " + i);
				break;
			}
		}
		if (hasPrime == false) {
			System.out.println("Intervalul nu contine niciun numar prim.");
		}
	}

	private static boolean isPrime(int n) {
		if(n % 2 == 0) {
			return false;
		}
		for(int i = 2; i <= n / 2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
