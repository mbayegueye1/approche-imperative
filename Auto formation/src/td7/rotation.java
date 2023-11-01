package td7;

public class rotation {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};
        int[] newTab = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            // Calculate the new index for the rotated element
            int newIndex = (i + 1) % array.length;
            newTab[newIndex] = array[i];
        }

        // Copy the rotated elements back to the original array
        System.arraycopy(newTab, 0, array, 0, array.length);

        // Print the rotated array
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
