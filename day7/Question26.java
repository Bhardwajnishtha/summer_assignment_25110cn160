package day7;

import java.util.*;

public class Question26 {
    static int finonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return finonacci(n - 1) + finonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative integer:");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Fibonacci is not defined for negative numbers.");
        } else {
            System.out.println("Fibonacci of " + num + " is: " + finonacci(num));
        }
        sc.close();
    }
    
}
