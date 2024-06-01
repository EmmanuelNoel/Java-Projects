import java.util.Scanner;

public class fonction_factoriel {



   public static int factoriel(int n)
    {
        int fac = 1;
        if(n == 0)
        {
            fac = 1;
        }
        else
        {
            for(int i=1;i <= n;i++)
            {
                fac *= i;
            }
        }

        return fac;
    }

    public static void main(String[] args) {






        Scanner clavier = new Scanner(System.in);
int nombre;
      do
      {
          System.out.println("Entrez un nombre supérieur ou égale à 0:");
          nombre = clavier.nextInt();
      }while(nombre < 0);


        System.out.println("Le factoriel de ce nombre est "+factoriel(nombre));

        clavier.nextLine();





    }
}
