package Automate;

import java.util.*;

public class AutomateConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie du nombre d'états, d'entrées et de transitions
        System.out.print("Nombre d'états : ");
        int nbStates = scanner.nextInt();

        System.out.print("Nombre d'entrées : ");
        int nbInputs = scanner.nextInt();

        System.out.print("Nombre de transitions : ");
        int nbTransitions = scanner.nextInt();

        // Saisie des états finaux
        System.out.print("Etats finaux : ");
        int[] finalStates = new int[scanner.nextInt()];
        for (int i = 0; i < finalStates.length; i++) {
            finalStates[i] = scanner.nextInt();
        }

        // Saisie de la table de transition
        int[][] table = new int[nbStates][nbInputs];
        for (int i = 0; i < nbTransitions; i++) {
            System.out.print("Transition " + (i + 1) + " : ");
            int state = scanner.nextInt();
            int input = scanner.nextInt();
            int nextState = scanner.nextInt();
            table[state][input] = nextState;
        }

        // Conversion en AFD
        int[][] afdTable = convertToAFD(table, finalStates, nbInputs);

        // Affichage de la table de transition de l'AFD résultant
        System.out.println("Table de transition de l'AFD :");
        for (int i = 0; i < afdTable.length; i++) {
            for (int j = 0; j < nbInputs; j++) {
                System.out.print(afdTable[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] convertToAFD(int[][] table, int[] finalStates, int nbInputs) {
        // ...
        // Le reste de la fonction convertToAFD est identique à la version précédente
        // ...
        return table;
    }

}