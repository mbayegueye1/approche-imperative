package td7;

import java.util.Scanner;

public class InteractifStockageNombre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxVal =Integer.MIN_VALUE ;
        int [] tab1 = new int[20];
        int [] tab2 = new int[20];
        System.out.println(tab1);

        System.out.println("Choisir une option");
        for(int i= 0; i<10 ; i++) {
            int val = scanner.nextInt();
            if( val ==1){
                System.out.println("choisi une valeur1");
                int val1 = scanner.nextInt();
                tab1[i] =  val1;
                System.out.println(tab1[i]);
            } else if (val ==2){
                System.out.println("choisi une valeur2");
                int val2 = scanner.nextInt();
                tab1[i] = val2;
                System.out.println(tab2[i]);
            }
            else{
                System.out.println("L'option n'est pas dans le menu");
            }

        }




        scanner.close();
    }
}
