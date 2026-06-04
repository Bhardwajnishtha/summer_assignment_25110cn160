package day4;

import java.util.*;

public class Question15 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = SC.nextInt();
        int originalNum = num;
        int sum=0;
        int digits = 
        String.valueOf(num).length();
        while(num>0){
            int lastdigit = num % 10;
            sum += Math.pow(lastdigit, digits);
            num = num/10;
        }
        if(sum == originalNum){
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

    }
    
}
