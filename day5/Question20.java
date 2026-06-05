package day5;

import java.util.*;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        long num = sc.nextLong();

        long largestfactor = -1;
        for (long i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                largestfactor = i;
            }
        }
        System.out.println("The largest factor of " + num + " is: " + largestfactor);
        sc.close();
    }
}
