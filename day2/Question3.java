package day2;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = SC.nextInt();
        int product = 1;
        while(num>0){
            int lastdigit = num % 10;
            product *= lastdigit;
            num = num/10;
        }
        System.out.println("Product of the digits is: " + product);
        SC.close();
    }
}
