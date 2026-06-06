package day6;

import java.util.*;

public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base (x):");
        int x = sc.nextInt();
System.out.println("Enter exponent (n):");
        int n = sc.nextInt();
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        System.out.println(x + " raised to the power of " + n + " is: " + result);
        sc.close();
    }
    
}
