package day23;

import java.util.*;

public class Question89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for(char c : str.toCharArray()) {
            if (map.get(c)== 1){
                System.out.println("First non-repeating character :" +c);
                return;
            }
        }
        System.out.println("There is no non-repeating character");
        sc.close();
    }

    
}
