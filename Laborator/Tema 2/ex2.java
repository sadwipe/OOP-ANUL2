import javax.swing.JOptionPane;

class Exercitiul2 {
	public static void main(String[] args) {
		int a, b, c;
		a = Integer.parseInt(JOptionPane.showInputDialog("Introduceti primul numar: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Introduceti al doilea numar: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Introduceti al treilea numar: "));
		
		if(a > b && a > c) {
			System.out.println("Cel mai mare numar este: " + a);
			if(b > c) {
				System.out.println("Al doilea cel mai mare numar este: " + b);
				System.out.println("Cel mai mic numare este: " + c);
			} else {
				System.out.println("Al doilea cel mai mare numar este: " + c);
				System.out.println("Cel mai mic numare este: " + b);
			}
		} else if(b > a && b > c) {
			System.out.println("Cel mai mare numar este: " + b);
			if(a > c) {
				System.out.println("Al doilea cel mai mare numar este: " + a);
				System.out.println("Cel mai mic numar este: " + c);
			} else {
				System.out.println("Al doilea cel mai mare numar este: " + c);
				System.out.println("Cel mai mic numar este: " + a);
			}
		} else {
            System.out.println("Cel mai mare numar este: " + c);
            if(a > b) {
                System.out.println("Al doilea cel mai mare numar este: " + a);
                System.out.println("Cel mai mic numar este: " + b);
            } else {
            	System.out.println("Al doilea cel mai mare numar este: " + b);
                System.out.println("Cel mai mic numar este: " + a);
            }
		}
	}
}