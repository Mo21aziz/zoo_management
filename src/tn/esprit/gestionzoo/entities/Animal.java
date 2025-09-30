package tn.esprit.gestionzoo.entities;

public class Animal {
    private int age;
    public String name;
    private String family;
    private boolean isMammal;

    Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    Animal() {
    }

    public void displayAnimal() {
        System.out.println("tn.esprit.gestionzoo.entities.Animal: " + this.name + ", Family: " + this.family + ", Age: " + this.age + ", Mammal: " + this.isMammal);
    }
    public int getAge(){return age;}
    public String getName(){return name;}
    public String getFamily(){return family;}
    public boolean getIsMammal(){return isMammal;}
    public void setAge(int age){this.age = age;}
    public void setName(String name){this.name = name;}
    public void setFamily(String family){this.family = family;}
    public void setIsMammal(boolean mammal){this.isMammal = mammal;}
}
