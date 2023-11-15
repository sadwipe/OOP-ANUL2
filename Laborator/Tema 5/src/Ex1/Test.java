/*
Să se dezvolte clasa TreiNumere, care are variabile de instanță trei numere întregi
a, b și c, și ca metode:
- constructorul ce face inițializările
- metoda maxim(), ce returnează maximul dintre a, b și c
- metoda suntPitagoreice(), ce returnează true, dacă a, b și c sunt numere pitagoreice.
Scrieți și o clasă de test pentru clasa trei numere.
*/

package Ex1;
public class Test {
    public static void main(String[] args) {
        
        TreiNumere numerePitagoreice = new TreiNumere(4, 5, 3);
        
        // constructor cu parametrii
        TreiNumere tripletCuParametrii = new TreiNumere(12, 44, 28);
        
        // constructor fără parametrii
        TreiNumere tripletFaraParametrii;
        
        // testare metoda maxim()
        System.out.println(tripletCuParametrii.maxim()); // afișează 12
        
        // testare metoda suntPitagoreice()
        System.out.println(numerePitagoreice.suntPitagoreice()); // afișează true
        System.out.println(tripletCuParametrii.suntPitagoreice()); // afișează false;
    }
}
