package day6;

import java.util.*;

public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        String binaryStr = sc.nextLine();
        int decimalValue = Integer.parseInt(binaryStr, 2);
        System.out.println("Decimal representation of " + binaryStr + " is: " + decimalValue);
        sc.close();
    }
    
}
