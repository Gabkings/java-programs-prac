//Write an application that calculates the product of a series of integers that are passed to
//method product using a variable-length argument list. Test your method with several calls, each
//with a different number of arguments.
package varargstest.java;

/**
 *
 * @author developer
 */
public class VarargsTestJava {

    /**
     * @param args the command line arguments
     */
    public static int product(int... numbers) {
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        return product;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(product(1,2,3,4,5));

    }

}
