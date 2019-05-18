/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionSection;

/**
 *
 * @author developer
 */
public class Introduction {

    public static void main(String args[]) {
        System.out.print("\n");
        System.out.print(recursionSum(4));
        System.out.print("\n");
        System.out.print(factorialAlg(5));
        System.out.print("\n");
        System.out.print(calculateFactorial(5));
        //
        System.out.print("\n");
        System.out.print(GCD1(5, 10));
        System.out.print("\n");
        System.out.print(getGCDrecursive(5, 10));

    }

    //addition recursion
    public static int recursionSum(int N) {

        if (N == 1) {
            return 1;
        }
        int sum = N + recursionSum(N - 1);
        return sum;

    }

    //factorial recursion
    public static int factorialAlg(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorialAlg(n - 1);

    }

    //factorial recursion with accumulator
    public static int factorialAlg2(int accumulator, int n) {
        if (n == 1) {
            return accumulator;
        }
        return factorialAlg2(accumulator * n, n - 1);

    }

    public static int calculateFactorial(int n) {
        return factorialAlg2(1, n);
    }

    //calculating the GCD
    public static int GCD1(int num1, int num2) {
        while (num2 == 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int getGCDrecursive(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return getGCDrecursive(num2, num1 % num2);
    }
}
