package Classe_Point;

public class Coordonnees {


        private String nom;
        private Integer abscisse;

        public void affiche(Integer abscisse, String nom)
        {
            this.nom = nom;
            this.abscisse = abscisse;

            System.out.println("Nom du point :"+nom+ " Abscisse : "+abscisse);
        }


}
