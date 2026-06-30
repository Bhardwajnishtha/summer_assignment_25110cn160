package day22;

import java.util.*;

public class Question88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Removing spaces using replaceAll
        String noSpaces = input.replaceAll("\\s+", "");

        // Printing the result
        System.out.println("String without spaces: " + noSpaces);
        sc.close();
    }
    
}
