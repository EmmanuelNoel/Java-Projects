package tlc;

//Exemple d'affichage de table de transition

public class Afficher {

    public  Afficher() {
        String[][] tab = new String [5][3];

        tab[0][0] = "";
        tab[0][1] = "0";
        tab[0][2] = "1";
        tab[1][0] = "q1";
        tab[1][1] = "q2";
        tab[1][2] = "q3";
        tab[2][0] = "q2";
        tab[2][1] = "q2";
        tab[2][2] = "q4";
        tab[3][0] = "q3";
        tab[3][1] = "q2";
        tab[3][2] = "q3";
        tab[4][0] = "q4";
        tab[4][1] = "q2";
        tab[4][2] = "q3";

        for(int i = 0;i < 4;i++)
        {
            for(int j = 0;j < 3;j++)
            {

                System.out.printf("%-8s",tab[i][j]);
            }
            System.out.print("\n");
        }


    }
}