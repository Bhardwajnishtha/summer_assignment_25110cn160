package day2;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = SC.nextInt();
    int reverse = 0;
    int originalnum = num;
    while(num>0){
        int lastdigit = num % 10;
        reverse = reverse * 10 + lastdigit;
        num = num/10;
    }
    if(originalnum == reverse){
        System.out.println("The number is a palindrome.");
    }
    else{
        System.out.println("The number is not a palindrome.");
    }
    SC.close();
  }
}
