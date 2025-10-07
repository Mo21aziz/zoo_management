package tn.esprit.gestionzoo.entities;

public class Terrestre extends Animal{
    private int nbrLegs;
    public Terrestre(String name, int nbrLegs){
        super(name);
        this.nbrLegs = nbrLegs;
    }
    @Override
    public String toString() {
        return "Terrestrial{name=" + name + ", nbrLegs=" + nbrLegs + "}";
    }
}
