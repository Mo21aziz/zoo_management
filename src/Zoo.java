public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    Zoo() {
    }

    Zoo(String family, String name, String city, int nbrCages) {
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("Zoo name: " + this.name + ", City: " + this.city + ", Cages: " + this.nbrCages);
    }
}