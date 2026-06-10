package day11;

public class Question44 {
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        long result = factorial(n);
        System.out.println("The factorial of " + n + " is: " + result);
    }

}
