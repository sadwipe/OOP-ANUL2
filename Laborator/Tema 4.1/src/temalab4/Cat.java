package temalab4;

public class Cat extends Animal implements Comparable<Cat>{
    String rasa;
    String culoareaBlanii;
    
    //constructor implicit;
    public Cat() {
        super();
        this.rasa = "Necunoscut";
        this.culoareaBlanii = "Necunoscut";
    }
    
    //constructor explicit
    public Cat(String specie, int varsta, String dimensiune, String rasa, String culoareaBlanii) {
        super(specie, varsta, dimensiune);
        this.rasa = rasa;
        this.culoareaBlanii = culoareaBlanii;
    }
    //constructor de copiere
    public Cat(Cat obj) {
        super(obj.getSpecie(), obj.getVarsta(), obj.getDimensiune());
        this.rasa = obj.rasa;
        this.culoareaBlanii = obj.culoareaBlanii;
    }
    
    //getteri
    public String getRasa() {
        return this.rasa;
    }
    
    public String getCuloareaBlanii() {
        return this.culoareaBlanii;
    }
    
    //setteri
    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
    
    public void setCuloareaBlanii(String culoareaBlanii) {
        this.culoareaBlanii = culoareaBlanii;
    }
    
    @Override
    public int compareTo(Cat otherCat) {
        return Integer.compare(this.varsta, otherCat.varsta);
    }
}