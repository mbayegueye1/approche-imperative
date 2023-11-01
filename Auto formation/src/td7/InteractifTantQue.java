package td7;
import java.util.Scanner;
public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nb = 0;

        do{
            System.out.println("donner un chiffre");
            nb = scanner.nextInt();
            if(nb >10){
                System.out.println("trop grand donner un  autre chiffre");
            }
        }
        while (nb > 10);

        System.out.println("le Chiffre est:"+ nb);

        scanner.close();
        }






}
