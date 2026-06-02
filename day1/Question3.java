<<<<<<< HEAD
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int fact = 1;

        while(num > 0){
            fact *= num;
            num--;
        }
        System.out.println("The factorial of the given number is: " + fact);
        sc.close();
    }
}
=======
package day1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int fact = 1;

        while(num > 0){
            fact *= num;
            num--;
        }
        System.out.println("The factorial of the given number is: " + fact);
        sc.close();
    }
}
>>>>>>> 16eab36 (Save local changes before pull)
