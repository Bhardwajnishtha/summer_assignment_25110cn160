package day12;

import java.util.*;

public class Question47 {
    static void Fibonacci(int num) {
        int a = 0, b = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        Fibonacci(n);
    }
    
}
