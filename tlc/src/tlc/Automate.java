package tlc;

import java.util.*;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Automate {

    //déclaration des variables
     /* private String tab = new String[][];*/
    private String[][] tab;

    private  MultiValueMap<String, String> liste;

    private  MultiValueMap<String, String> tabListe;


   private List<String> parcouru ;
    private List<String> nonParcouru ;



    private int ligne;
      private int colonne;

     /* private String etat;*/
      private String t;

    //Entrée des données dans le tableau tab
    public Automate(int l, int c) {
        this.ligne = l;
        this.colonne = c;
        /*String[][] tab = new String[ligne][colonne];*/
       tab = new String[ligne][colonne];

        int i;
        int j;
        Scanner x = new Scanner(System.in);
        for (i = 0; i < ligne; i++) {
            System.out.println("\nEntrée des données de la ligne"+(i+1)+"\n");
            for (j = 0; j < colonne; j++)
            {
                System.out.print("Donnée ligne "+(i+1)+" colonne "+(j+1)+":");
                tab[i][j] = x.nextLine();
                System.out.print("\n");

            }
        }

    }


// affichage de la tab de transition

    public void afficher()
    {
        int i,j;
        String val;
        for( i = 0;i < ligne;i++)
        {
            for( j = 0;j < colonne;j++)
            {

   /*             Object[][] tab = new Object[0][0];*/
                System.out.printf("%-8s",tab[i][j]);
            }

            System.out.print("\n");

        }

      /*  System.out.println(tab[0][0].length());
        System.out.println(tab[0][1].length());
        System.out.println(tab[1][2].length());
        System.out.println(tab[2][2].length());*/
    }

    //Identifions si l'automate est un AFD,AFN,£-AFN

    public void identification()
    {
        int i,j;
        String val="";
        String etat="";
        for( i = 0;i < ligne;i++)
        {



            for( j = 0;j < colonne;j++)
            {
                val = tab[i][j];
               if(val.length() > 2)
               {
                  etat = "L'automate est un AFN";
                  t="AFN";
                  break;
               } else if (tab[i][j].equals("£")) {
                   etat = "L'automate est un £-AFN";
               t="£-AFN";
                   break;
               }
               else
               {
                   etat = "L'automate est un AFD";
                   t="AFD";
               }
            }

            if(etat != null)
            {
                break;
            }

        }

        System.out.println(etat);

    }



    //Transformation en AFD
    public void transformation()
    {
           liste  = new MultiValueMap<>();
           parcouru  = new ArrayList<String>();
           nonParcouru = new ArrayList<String>();
           tabListe = new MultiValueMap<>();
           int i;
           int j;
           int m;

        //mettre le contenu de tab dans la liste tabListe

        for( i = 0;i < ligne;i++)
        {
            m=0;
            for( j = 0;j < colonne;j++)
            {

                tabListe.put(tab[i][m], tab[i][j]);


            }

        }


        if(t.equals("AFN"))
        {
 //Début
            for( i = 0;i < 1;i++)
            {
                for( j = 0;j < colonne;j++)
                {
                    parcouru.add(tab[i][i]);
                    liste.put(tab[i][i], tab[i][j]);
                    nonParcouru.add(tab[i][j]);

                }

            } //fin

//Reconstruction de la table de transition


            for ( i = 0; i < nonParcouru.size(); i++) {
                String[] contenuColonne = new String[10];
                if(!parcouru.contains(nonParcouru.get(i)))
                {
                    String val = nonParcouru.get(i);
                    if(val.length() > 2)
                    {
                        String[] value = val.split(",");
                        for ( i = 0; i < value.length; i++) {
                            contenuColonne[i] = value[i];
//                            liste.put(val, tabListe.get(contenuColonne));
                            //position de contenuColonne dans tab
                            int[] indices = new int[0];
                            for ( i = 0; i < ligne; i++) {
                                for ( j = 0; j < colonne; j++) {
                                    if (tab[i][j].equals(contenuColonne)) {
                                        indices[0] = i;
                                        indices[1] = j;

                                    }
                                }
                            }

                            //fin

                             //Récuperation des elements de contenuColonne
                            String[] donnees = new String[0];
                            for ( i = indices[0]; i < indices[0]; i++)
                            {
                                for ( j = 0; j < colonne; j++)
                                {
                                    donnees[i] = tab[i][j];

                                }
                            }
                            //fin

                            //Ajout des elements de donnees à liste et à la liste nonParcouru

                            for ( i = 0; i < donnees.length; i++)
                            {
                                liste.put(val, ""+donnees[i]);
//                                nonParcouru.add(tab[i][j]);

                            }
                            //fin

                        }

                    }
                }
            }
//Fin de la reconstruction de la table de transition



        }





    }







}
