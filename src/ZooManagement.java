public class zooManagement {
    public static void main(String[] args) {
        Animal lyon = new Animal();
        lyon.name = "Simba";
        lyon.family = "lyon";
        lyon.age = 14;
        lyon.isMammal = true;
        Zoo myZoo = new Zoo();
        myZoo.name = "belvedaire";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 25;
        myZoo.animals = new Animal[25];
        System.out.println("Welcome to the Zoo management system");
        System.out.println("zoo" + myZoo.name);
        new Animal("tiger", "Bagira", 10, true);
        myZoo.displayZoo();
        System.out.println(myZoo);
        lyon.displayAnimal();
        System.out.println(lyon);
    }
}