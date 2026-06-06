package day6;

import java.util.*;

public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int count = 0;
    while(num>0) {
        count += (num & 1);
        num >>= 1;
    }
    System.out.println("Number of 1s in the binary representation: " + count);
    sc.close();
 }
    
}
