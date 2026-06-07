package day7;

import java.util.*;

public class Question27 {
    static int sumofDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumofDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative integer:");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Sum of digits is not defined for negative numbers.");
        } else {
            System.out.println("Sum of digits of " + num + " is: " + sumofDigits(num));
        }
        sc.close();
    }
    
}
