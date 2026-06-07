package day7;

import java.util.*;

public class Question28 {
    static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative integer:");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Reverse of a negative number is not defined.");
        } else {
            System.out.println("Reverse of " + num + " is: " + reverseNumber(num));
        }
        sc.close();
    }
}
