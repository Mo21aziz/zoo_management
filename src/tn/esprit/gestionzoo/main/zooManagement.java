package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestre;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

import java.util.Scanner;

public class zooManagement {
    public static void main(String[] args) {
        int nbrCages=20;
        String ZooName= "My tn.esprit.gestionzoo.entities.Zoo";
        System.out.println("tn.esprit.gestionzoo.entities.Zoo Name: "+ZooName + "nbr Cages: "+nbrCages);
        Scanner input = new Scanner(System.in) ;
        System.out.println("insert zoo name");
        ZooName = input.nextLine();

        System.out.println("insert zoo age");
        nbrCages = input.nextInt();
        System.out.println("tn.esprit.gestionzoo.entities.Zoo Name: "+ZooName+ " nbr Cages: "+nbrCages);

        Animal dog = new Animal(11, "daleji", "doberman", true);
        Animal cat = new Animal(3, "bechbech", "gatt", true);
        Animal bird = new Animal(2, "ziwziw", "boumzayen", false);
        Zoo myZoo = new Zoo("Myzoo", "tunis", 30);
        myZoo.addAnimal(dog);
        System.out.println("tn.esprit.gestionzoo.entities.Zoo Name"+myZoo.name);
        System.out.println(myZoo);
        System.out.println(myZoo.toString());


        Zoo myZoo2 = new Zoo("Belvedaire", "tunis", 3);
        myZoo2.addAnimal(dog);
        myZoo2.addAnimal(cat);
        myZoo2.addAnimal(dog);

        myZoo2.removeAnimal(dog);


        System.out.println(Zoo.comparerZoo(myZoo, myZoo2).name);
        myZoo2.displayAnimals();
        myZoo2.displayZoo();
        System.out.println(myZoo2.isZooFull());

        int index = myZoo2.searchAnimal(dog);
        System.out.println(index);
        Aquatic a = new Aquatic("9erch","hiroshima nakazaki");
        Terrestre t = new Terrestre("wral",2);
        Dolphin d = new Dolphin("7amma",4);
        Penguin p = new Penguin("yassin",50);
        System.out.println(a);
        System.out.println(t);
        System.out.println(d);
        System.out.println(p);
    }
}