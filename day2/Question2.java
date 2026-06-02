package day2;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = SC.nextInt();
    int reverse = 0;
    while(num>0){
        int lastdigit = num % 10;
        reverse = reverse * 10 + lastdigit;
        num = num/10;
    }
    System.out.println("Reversed of the number is: " + reverse);
}
}