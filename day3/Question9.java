package day3;

import java.util.*;

public class Question9 {
   public static void main(String[] args) {
Scanner SC = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = SC.nextInt();
int count =0;
for(int i=1; i<=num; i++) {
    if(num % i == 0) {
        count++;
    }
}
if(count == 2) {
    System.out.println(num + " is a prime number.");
} else {
    System.out.println(num + " is not a prime number.");
}
SC.close();
   } 
}