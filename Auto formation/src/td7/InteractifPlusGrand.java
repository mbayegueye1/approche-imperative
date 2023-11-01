package td7;
import java.util.Scanner;
public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer 10  nombres");

        int maxVal =Integer.MIN_VALUE ;
        int [] tab = new int[10];
        for(int i= 0; i<10 ; i++) {
            System.out.print("Entrez le nombre #" + (i + 1) + ": ");
            tab[i]= scanner.nextInt();
            if(tab[i]>maxVal){
                maxVal =tab[i];
            }

        }
        System.out.println("le plus garnd nobre est :"+ maxVal);




        scanner.close();
    }
}

