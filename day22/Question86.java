package day22;

import java.util.*;

public class Question86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the sentence: ");
        String str = sc.nextLine();
        String[] words= str.trim().split("\\s+");
        System.out.println("Total number of words are" + words.length);
        sc.close();


    }
    
}
