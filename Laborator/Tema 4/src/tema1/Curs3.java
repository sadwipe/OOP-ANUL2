package tema1;

public class Curs3 {
	public static void main(String[] args) {
		boolean a, b;

        System.out.println("a\tb\ta && b\ta || b\t!a");
        
        a = true;
        b = true;
        System.out.println(a + "\t" + b + "\t" + (a && b) + "\t" + (a || b) + "\t" + !a);

        a = true;
        b = false;
        System.out.println(a + "\t" + b + "\t" + (a && b) + "\t" + (a || b) + "\t" + !a);

        a = false;
        b = true;
        System.out.println(a + "\t" + b + "\t" + (a && b) + "\t" + (a || b) + "\t" + !a);

        a = false;
        b = false;
        System.out.println(a + "\t" + b + "\t" + (a && b) + "\t" + (a || b) + "\t" + !a);

        System.out.println("*************************************");
        
        final byte e = 2;
        final short s = 3;
        final char c = 'A';
        final int i = 5;
        final long l = 1000L;
        final float f = 2.5f;
        final double d = 3.14;

        System.out.println("Rezultatele înmulțirii dintre variabile:");

        System.out.println("b * s = " + (e * s));
        System.out.println("b * c = " + (e * c));
        System.out.println("b * i = " + (e * i));
        System.out.println("b * l = " + (e * l));
        System.out.println("b * f = " + (e * f));
        System.out.println("b * d = " + (e * d));

        System.out.println("s * c = " + (s * c));
        System.out.println("s * i = " + (s * i));
        System.out.println("s * l = " + (s * l));
        System.out.println("s * f = " + (s * f));
        System.out.println("s * d = " + (s * d));

        System.out.println("c * i = " + (c * i));
        System.out.println("c * l = " + (c * l));
        System.out.println("c * f = " + (c * f));
        System.out.println("c * d = " + (c * d));

        System.out.println("i * l = " + (i * l));
        System.out.println("i * f = " + (i * f));
        System.out.println("i * d = " + (i * d));

        System.out.println("l * f = " + (l * f));
        System.out.println("l * d = " + (l * d));

        System.out.println("f * d = " + (f * d));

        System.out.println("**********************");
        System.out.println("Marginile inferioare și superioare ale tipurilor de date primitive:");

        System.out.println("byte:");
        System.out.println("Min: " + Byte.MIN_VALUE);
        System.out.println("Max: " + Byte.MAX_VALUE);

        System.out.println("short:");
        System.out.println("Min: " + Short.MIN_VALUE);
        System.out.println("Max: " + Short.MAX_VALUE);

        System.out.println("int:");
        System.out.println("Min: " + Integer.MIN_VALUE);
        System.out.println("Max: " + Integer.MAX_VALUE);

        System.out.println("long:");
        System.out.println("Min: " + Long.MIN_VALUE);
        System.out.println("Max: " + Long.MAX_VALUE);

        System.out.println("float:");
        System.out.println("Min: " + Float.MIN_VALUE);
        System.out.println("Max: " + Float.MAX_VALUE);

        System.out.println("double:");
        System.out.println("Min: " + Double.MIN_VALUE);
        System.out.println("Max: " + Double.MAX_VALUE);

        System.out.println("char:");
        System.out.println("Min: " + (int) Character.MIN_VALUE);
        System.out.println("Max: " + (int) Character.MAX_VALUE);
        
        System.out.println("**************************");
        int x = 5;
        int y = 10;

        System.out.println("Valori inițiale:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int result1 = ++x + y--;
        int result2 = x-- - --y;

        System.out.println("Valori după aplicarea operatorilor:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Rezultat 1 = " + result1);
        System.out.println("Rezultat 2 = " + result2);
	}
}
