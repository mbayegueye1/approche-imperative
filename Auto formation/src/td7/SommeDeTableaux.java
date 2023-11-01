package td7;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int [] array1 = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        int [] array2 = {-1,12,17,14,5,-9,0,18,-6,0,4,-13,5,7,-2,8,-1};

        if (array1.length > array2.length) {
            int[] tableauDimens = new int[array1.length];
            for (int i = 0; i < tableauDimens.length; i++) {
                tableauDimens[i] = array1[i] + array2[i];
            }
        }
        else {
            int[] tableauDimens = new int[array2.length];
            for (int i = 0; i < tableauDimens.length; i++) {
                tableauDimens[i] = array1[i] + array2[i];
            }
            System.out.println(tableauDimens);
        }

    }
}
