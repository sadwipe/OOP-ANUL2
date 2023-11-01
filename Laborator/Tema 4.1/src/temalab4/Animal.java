package temalab4;

public class Animal {
    String specie;
    int varsta;
    String dimensiune;
    
    //constructor fara parametrii
    public Animal() {
        this.specie = "Necunoscut";
        this.varsta = 0;
        this.dimensiune = "Necunoscut";
    }
    //constructor cu parametrii
   public Animal(String specie, int varsta, String dimensiune) {
        this.specie = specie;
        this.varsta = varsta;
        this.dimensiune = dimensiune;
    }
    
    //constructor de copiere
   public Animal(Animal obj) {
        this.specie = obj.specie;
        this.varsta = obj.varsta;
        this.dimensiune = obj.dimensiune;
    }
    
    //getteri
    public String getSpecie() {
        return this.specie;
    }
    public int getVarsta() {
        return this.varsta;
    }
    public String getDimensiune() {
        return this.dimensiune;
    }
    
    //setteri
    public void setSpecie(String specie) {
        this.specie = specie;
    }
    public void setDurataDeViata(int varsta) {
        this.varsta = varsta;
    }
    public void setDimensiune(String dimensiune) {
        this.dimensiune = dimensiune;
    }
    
}