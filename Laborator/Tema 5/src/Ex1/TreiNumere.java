package Ex1;

public class TreiNumere {
    public int a, b, c;
    
    // constructor implicit
    TreiNumere() {
        a = 0;
        b = 0;
        c = 0;
    }
    
    //constructor explicit
    TreiNumere(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int maxim() {
        int max = a;
        if(b > max) {
            b = max;
        }
        if(c > max) {
            c = max;
        }
        return max;
    }
    
    public boolean suntPitagoreice() {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }
    
}