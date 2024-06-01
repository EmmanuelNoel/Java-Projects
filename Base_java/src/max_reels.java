import java.util.Scanner;


public class max_reels {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez le premier nombre:");
        float n1 = clavier.nextFloat();
        System.out.println("Entrez le second nombre:");
        float n2 = clavier.nextFloat();

        System.out.println("Le maximum de ce nombre est :"+Math.max(n1,n2));

        clavier.close();
    }

}
