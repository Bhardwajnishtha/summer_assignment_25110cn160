package day22;

import java.util.*;

public class Question85 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string:");
            String str = sc.nextLine();

            String rev = "";

            for(int i = str.length() - 1; i >=0; i--) {
                rev = rev + str.charAt(i);
            }
            if(str.equals(rev)) {
                System.out.println("Palidrome String");
            }
            else{
                System.out.println("Not a palidrome string");
            }
            sc.close();
             
        }
    
}
