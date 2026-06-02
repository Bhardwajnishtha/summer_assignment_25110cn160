<<<<<<< HEAD
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;   
        }

        System.out.println("The number has digits: " + count);

        sc.close();
    }
}
=======
package day1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;   
        }

        System.out.println("The number has digits: " + count);

        sc.close();
    }
}
>>>>>>> 16eab36 (Save local changes before pull)
