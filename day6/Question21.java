package day6;

import java.util.*;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int num = sc.nextInt();
        System.out.println("Binary representation of " + num + " is: " + Integer.toBinaryString(num));
        sc.close();
    }
    
}
