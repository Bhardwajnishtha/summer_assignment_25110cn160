package day2;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = SC.nextInt();
    int sum = 0;
    
    while(num>0){
        int lastdigit = num % 10;
        sum += lastdigit;
        num = num/10;
    }
    System.out.println("the sum of the digits is: " + sum);
        SC.close();
    }
}
