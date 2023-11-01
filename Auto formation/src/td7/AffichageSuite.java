package td7;

public class AffichageSuite {
    public static void main(String[] args) {
        /*/ Affichage 1 à 10//
     /*   int i = 0;
        for (i = 0; i < 10; i++) {
            int myval = i + 1;
            System.out.println("1à 10 inclus " + myval);
        }
        // Affichage 1 à 10 nombre pair//
        for (i = 0; i < 10; i = i + 2) {
            System.out.println("1 à 10 pair " + i);
        }
        // Affichage 1 à 10 nombre impair//
        for (i = 0; i < 10; i++) {
            if ((i % 2) != 0) {
                System.out.println("1 à 10 impair " + i);
            }
        }*/
        int a = 1;
        System.out.println("1 à 10 pair avec while");
        /* Affichage 1 à 10 inclus avec while/*/
        while (a <= 10) {
            System.out.println(a);
            ++a;

        }

        System.out.println("Nombre pairs 1 à 10 pair avec while");
        a = 1;
        while (a <= 10) {
            if ((a % 2) == 0) {
                System.out.println(a);
                ;
            }
            ++a;

        }
        System.out.println("Nombre pairs 1 à 10 impair avec while");
        a = 1;
        while (a <= 10) {
            if ((a % 2) != 0) {
                System.out.println(a);
                ;
            }
            ++a;
        }
    }
}