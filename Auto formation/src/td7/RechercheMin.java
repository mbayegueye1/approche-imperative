package td7;

public class RechercheMin {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println("La valeur min est:");

        int maxArray = array[0];
        int i = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] < maxArray) {
                maxArray =array[i];
                System.out.println(array[i]);

            }
        }
    }


}
