package day11;

public class Question42 {
    static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int a = 5, b = 10;
        int result = findMax(a, b);
        System.out.println("The maximum of " + a + " and " + b + " is: " + result);
    }
}
