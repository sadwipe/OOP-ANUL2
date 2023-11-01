package temalab4;
import java.util.Arrays;

public class TemaLab4 {

    public static void main(String[] args) {
        Cat[] cats = new Cat[] {
            new Cat("Siamese", 5, "Small", "Siamese", "Cream"),
            new Cat("Persian", 3, "Medium", "Persian", "White"),
            new Cat("Maine Coon", 2, "Large", "Maine Coon", "Tabby")
        };
        
        Arrays.sort(cats);
        
        for(Cat cat: cats) {
            System.out.println("Specie: " + cat.getSpecie() + ", Varsta: " + cat.getVarsta());
        }
        
    }
    
}
