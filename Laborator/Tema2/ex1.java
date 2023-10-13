import java.util.Scanner;

class ClasaParinte {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		n += 1;
		while(true) {
			if(isPrime(n) == false) {
				n++;
				continue;
			} else {
				break;
			}
		}
		
		System.out.println(n);
	}
	
	static boolean isPrime(int n) {
		boolean flag = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}
}