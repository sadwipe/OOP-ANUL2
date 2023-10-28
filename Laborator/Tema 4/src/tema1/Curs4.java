
package tema1;

public class Curs4 {
	public static void main(String[] args) {
		String firstString = "Acesta este primul SIR";
	    String secondString = "cel de-al doilea sir de caractere";

	    char charAt5 = firstString.charAt(5);
	    char charAt15 = firstString.charAt(15);
	    System.out.println("Caracterul de pe poziția 5: " + charAt5);
	    System.out.println("Caracterul de pe poziția 15: " + charAt15);

	    boolean areEqual = firstString.equals(secondString);
	    System.out.println("Cele două șiruri sunt egale: " + areEqual);

	    String lowercaseFirstString = firstString.toLowerCase();
	    System.out.println("Primul șir transformat în litere mici: " + lowercaseFirstString);

	    int lengthOfFirstString = firstString.length();
	    System.out.println("Lungimea primului șir: " + lengthOfFirstString);

	    String replacedString = firstString.replace("SIR", "string");
	    System.out.println("Șirul cu înlocuirea lui 'SIR': " + replacedString);
	    
	    System.out.println("***************************");
	    
	    String input = "sir in oglinda";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
        
        System.out.println("****************************");
        double absoluteValue = Math.abs(-10.5);
        System.out.println("Valoarea absolută a lui -10.5 este: " + absoluteValue);

        double power = Math.pow(2, 3);
        System.out.println("2 la puterea 3 este: " + power);

        double sqrt = Math.sqrt(25);
        System.out.println("Rădicalul lui 25 este: " + sqrt);

        double sinValue = Math.sin(Math.PI / 2);
        System.out.println("Sinusul lui 90 de grade este: " + sinValue);

        double cosValue = Math.cos(Math.PI);
        System.out.println("Cosinusul lui 180 de grade este: " + cosValue);

        int max = Math.max(10, 20);
        System.out.println("Valoarea maximă dintre 10 și 20 este: " + max);

        int min = Math.min(5, 15);
        System.out.println("Valoarea minimă dintre 5 și 15 este: " + min);
        
	}
}
