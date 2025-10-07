package tn.esprit.gestionzoo.entities;

public class Dolphin extends Animal{
    private float swimmingSpeed;
    public Dolphin(String name, float swimmingSpeed){
        super(name);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public String toString() {
        return "Dolphin{name=" + name +  ", swimmingSpeed=" + swimmingSpeed + "}";
    }

    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

}
