package td7;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class InteractifChiffresSuivants {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    System.out.println("Entrer un nombre:");
    int input = scanner.nextInt();
    int inputSuivant= 0;
    System.out.println("Les 10 nombres suivanst sont:" );
    for(int i= 1; i<=10; i++){

        inputSuivant = input + i;
        System.out.println(inputSuivant);

    }

    scanner.close();
    }




}
