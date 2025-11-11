package tn.esprit.employemanagament.main;

import tn.esprit.employemanagament.entities.Departement;
import tn.esprit.employemanagament.entities.DepartementHashSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(2, "IT", 25);
        Departement d2 = new Departement(1, "RH", 12);
        Departement d3 = new Departement(3, "Finance", 18);

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);

        System.out.println("=== Affichage des départements ===");
        gestion.displayDepartement();

        System.out.println("\nRecherche par nom 'RH' : " + gestion.rechercherDepartement("RH"));
        System.out.println("Recherche par objet d3 : " + gestion.rechercherDepartement(d3));

        System.out.println("\n=== Tri par ID ===");
        TreeSet<Departement> tries = gestion.trierDepartementById();
        for (Departement d : tries) {
            System.out.println(d);
        }
    }
}