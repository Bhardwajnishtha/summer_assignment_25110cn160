package day23;
import java.util.*;

public class Question90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        
        HashSet<Character> seen = new HashSet<>();
        char repeatingChar = '\0'; 

        for (char c : input.toCharArray()) {
            if (seen.contains(c)) {
                repeatingChar = c;
                break; 
            } else {
                seen.add(c);
            }
        }

        if (repeatingChar != '\0') {
            System.out.println("First repeating character: " + repeatingChar);
        } else {
            System.out.println("No repeating character found.");
        }

        sc.close();
    }
}

