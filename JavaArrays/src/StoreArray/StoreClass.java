package StoreArray;

public class StoreClass {

    public static void main(String args[]) {
        final int ARRAY_LENGTH = 10; // declare constant
        int[] array = new int[ARRAY_LENGTH]; // create array
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 + 2 * i;
        }
        System.out.printf("%s%8s\n", "Index", "Value"); // column headings
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d\n", i, array[i]);
        }
        int total = 0;
        for(int i = 0; i<array.length; i++){
            total += array[i];
        }
        System.out.printf("%2d", total);
    }

}
