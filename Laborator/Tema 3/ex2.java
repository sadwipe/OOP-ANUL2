import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		int n, t1, r;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti N: ");
		n = scanner.nextInt();
		System.out.println("Introduceti primul numar al progresiei aritmetice: ");
		t1 = scanner.nextInt();
		System.out.println("Introduceti ratia: ");
		r = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print(t1 + " ");
			t1 += r;
		}
		
	}

}