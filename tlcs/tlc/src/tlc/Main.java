package tlc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Exemple de table de transition:");

        Afficher bt = new Afficher();

        System.out.println("Contruisez votre table de transition");

        System.out.print("Nombre de ligne de votre table de transition:");
        Scanner x = new Scanner(System.in);
        int l = x.nextInt();
        x.nextLine();
        System.out.print("\nNombre de colonne de votre table de transition:");
        int c = x.nextInt();
        Automate a = new Automate(l, c);
        a.afficher();
        a.identification();
        System.out.println("Reconstruction de la table de transition");
        a.transformation();

    }



}