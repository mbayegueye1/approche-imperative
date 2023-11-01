package td7;
import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter un nombre:");
        int input= scanner.nextInt();
        int somme = 0;
        System.out.println("la somme est ègale à :");
        for(int i=0 ;i<=input  ; i++) {
            somme += i;
        }
        System.out.println(somme);

        scanner.close();
    }

}
