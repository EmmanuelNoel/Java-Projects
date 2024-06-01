package Automate;

import java.util.*;

public class ConvertAutomaton {

    public static void main(String[] args) {

        // Définition de l'automate sous forme de table de transition
        int[][] table = {
                {1, 2, -1},
                {3, -1, 2},
                {3, -1, 2},
                {-1, -1, -1}
        };

        int[] finalStates = {2, 3};

        // Conversion de l'automate en AFD
        int[][] newTable = convertToAFD(table, finalStates);

        // Affichage de la nouvelle table de transition de l'AFD
        System.out.println("Nouvelle table de transition : ");
        for (int i = 0; i < newTable.length; i++) {
            for (int j = 0; j < newTable[i].length; j++) {
                System.out.print(newTable[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fonction pour la conversion d'un automate en AFD
    public static int[][] convertToAFD(int[][] table, int[] finalStates) {

        // Initialisation des variables
        int nbStates = table.length;
        int nbInputs = table[0].length;
        int[][] newTable = new int[nbStates][nbInputs];

        // Création d'une liste pour stocker les nouveaux états
        List<int[]> newStates = new ArrayList<>();
        newStates.add(new int[]{0});

        // Boucle pour la création de nouveaux états
        for (int i = 0; i < newStates.size(); i++) {
            int[] state = newStates.get(i);

            // Boucle pour chaque entrée de l'automate
            for (int j = 0; j < nbInputs; j++) {

                // Création d'une liste pour stocker les états accessibles depuis l'état courant avec l'entrée j
                List<Integer> nextStates = new ArrayList<>();

                // Boucle pour chaque état de l'automate
                for (int k = 0; k < state.length; k++) {
                    int nextState = table[state[k]][j];

                    // Si l'état est accessible depuis l'état courant avec l'entrée j, on l'ajoute à la liste
                    if (nextState != -1 && !nextStates.contains(nextState)) {
                        nextStates.add(nextState);
                    }
                }

                // Si la liste n'est pas vide, on la trie et on vérifie si elle correspond à un nouvel état
                if (!nextStates.isEmpty()) {
                    Collections.sort(nextStates);
                    int index = newStates.indexOf(nextStates);

                    // Si la liste correspond à un nouvel état, on l'ajoute à la liste des nouveaux états
                    if (index == -1) {
                        newStates.add(nextStates.stream().mapToInt(Integer::intValue).toArray());
                        index = newStates.size() - 1;
                    }

                    // On ajoute la transition de l'état courant vers le nouvel état à la nouvelle table de transition
                    newTable[i][j] = index;
                }
            }
        }

        // Création du tableau des états finaux de l'AF
//////////*****
        List<Integer> finalStatesList = new ArrayList<>();

        // Boucle pour chaque nouvel état
        for (int i = 0; i < newStates.size(); i++) {
            int[] state = newStates.get(i);

            // Boucle pour chaque état final de l'automate original
            for (int j = 0; j < finalStates.length; j++) {
                int finalJ = j;
                if (Arrays.stream(state).anyMatch(x -> x == finalStates[finalJ])) {
                    finalStatesList.add(i);
                    break;
                }
            }
        }

        // Conversion de la liste des états finaux en tableau
        int[] newFinalStates = finalStatesList.stream().mapToInt(Integer::intValue).toArray();

        // Création de la nouvelle table de transition de l'AFD
        int[][] result = new int[newStates.size()][nbInputs];
        for (int i = 0; i < newTable.length; i++) {
            for (int j = 0; j < nbInputs; j++) {
                result[i][j] = newTable[i][j] + 1;
            }
        }

        return result;
    }
}