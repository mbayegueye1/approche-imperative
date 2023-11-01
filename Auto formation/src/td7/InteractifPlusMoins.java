package td7;
import java.util.Scanner;
import java.util.Random;


public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nombreAleatoire = random.nextInt(100  + 1) ;
        System.out.println(nombreAleatoire);
        int nbrEssai = 0;
        int myVal= 0;
        for(int i= 1; i< Integer.MAX_VALUE ; i++) {
            System.out.println("Entrer un Valeur ");
            myVal = scanner.nextInt();
            if (myVal > nombreAleatoire || myVal < nombreAleatoire) {
                    System.out.println("Perdu Recommencer");
                }
            else if (myVal == nombreAleatoire) {
                nbrEssai = nbrEssai +i;
                System.out.println("Bravo vous avez trouver apres "+ nbrEssai + "essais");
            }
           else {
                System.out.println("Game Over");

            }
             }







        scanner.close();
    }
}
