package tn.esprit.gestionzoo.entities;

public class Zoo {
    Animal[] animals;
    public String name;
    String city;
    static final int nbrCages =25;
    int animalCount;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;

    }

    public void displayAnimals() {
        if (animalCount==0){
            System.out.println("Pas d'animeaux");
        }
        else{
            for (int i = 0; i < this.animals.length; i++) {
                System.out.println(this.animals[i]);
            }
        }
    }

    public boolean addAnimal(Animal animal) {
        if (animal == null) return false;
        if (isZooFull()) {
            System.out.println("tn.esprit.gestionzoo.entities.Zoo plein ! Impossible d’ajouter " + animal.getName());
            return false;
        }
        else{if (animalCount >= nbrCages) return false;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && (animals[i].getName()) == animal.getName()) {
                return false;
            }
        }
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                animalCount++;
                return true;
            }
        }
        return false;
    }}

    public int searchAnimal(Animal animal) {
        if (animal == null){return -1;}
        for (int i = 0; i < this.animals.length; i++) {
            if (animals[i]!=null && (animals[i].getName() == animal.getName())){
                return i;
            }
        }
        return -1;

    }

    public boolean removeAnimal(Animal animal) {
        if (animal == null){return false;}
        for (int i = 0; i < this.animals.length; i++) {
            if (animals[i]!=null && (animals[i].getName() == animal.getName())){
                this.animals[i] = null;
                animalCount--;
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull() {
        if (animalCount>=nbrCages){return true;}
        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount >= z2.animalCount) {
            return z1;
        } else {
            return z2;
        }
    }


    public void displayZoo(){
        System.out.println("tn.esprit.gestionzoo.entities.Zoo name: "+name);
        System.out.println("tn.esprit.gestionzoo.entities.Zoo city: "+city);
        System.out.println("tn.esprit.gestionzoo.entities.Zoo nbr cages: "+nbrCages);
    }



    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{name='" + name + "'," +
                " city='" + city + "', cages=" +
                nbrCages + ", animaux=" + animalCount + "}";
    }

}