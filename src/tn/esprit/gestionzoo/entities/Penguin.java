package tn.esprit.gestionzoo.entities;

public class Penguin extends Animal{
    private float swimmingDepth;
    public Penguin(String name, float swimmingSpeed){
        super(name);
        this.swimmingDepth = swimmingSpeed;
    }
    @Override
    public String toString() {
        return "Penguin{name=" + name +  ", swimmingDepth=" + swimmingDepth + "}";
    }
}
