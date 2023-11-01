package td7;
import java.util.Scanner;
public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int multi =0;

        do{
            System.out.println("donner un nombre");
            input = scanner.nextInt() ;
            if(input>10){
                System.out.println("nombre trop grand, donner un \n autre entre 1 et 10");
            }
        }

        while(input>10);
            System.out.println("le nombre est :"+ input);
            System.out.println("La table de 3:");
            for(int i= 0; i<=10; i++){
            multi = input *i;
                System.out.println(multi);
        }
            scanner.close();
    }
}
