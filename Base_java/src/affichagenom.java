import java.util.Scanner;

public class affichagenom {

    public static void main(String[] args) {
   Scanner clavier = new Scanner(System.in);


        System.out.println("Entrez votre nom");
      String nom_user =  clavier.nextLine();
        System.out.println("Entrez votre age:");
        int age_user = clavier.nextInt();

        System.out.println("Nom : "+nom_user+ "Age :"+age_user);

    }
}
