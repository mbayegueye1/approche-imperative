package td7;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int i = 0;

        for(i =0; i< array.length; i++){

            System.out.println( array[array.length-i-1]);

            int[] copyArray = java.util.Arrays.copyOf(array, array.length);
            System.out.println(copyArray[copyArray.length-i-1]);
        }

        }

}