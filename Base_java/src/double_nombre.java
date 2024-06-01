import java.util.Scanner;

public class double_nombre {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez un nombre:");
        double nombre = clavier.nextDouble();



        System.out.println("Le double de ce nombre est "+nombre*2);

        clavier.close();
        System.out.println();
    }

}
