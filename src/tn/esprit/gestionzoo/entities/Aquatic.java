package tn.esprit.gestionzoo.entities;

public class Aquatic  extends Animal {
    private String habitat;
    public Aquatic(String name, String habitat){
        super(name);
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return "Aquatic{name=" + name + ", habitat=" + habitat + "}";
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
