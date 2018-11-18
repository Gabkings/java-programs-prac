package multidimensionalarrays;

public class MultidimensionalArrays {

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
        outputArray(array2);
    }
    public static void outputArray(int[][] arrays ){
        //loop through the rows
        for(int row = 0;row<arrays.length;row++){
            //loop through the current row columns
            for(int column = 0;column<arrays[row].length;column++){
                System.out.printf("%d ", arrays[row][column]);
            }
            System.out.println();
        }
    }

}
