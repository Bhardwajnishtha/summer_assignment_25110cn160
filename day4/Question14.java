package day4;

public class Question14 {
    public static void main(String[] args) {
        int num = 10;
        int a = 0, b = 1;
        if(num ==1) {
            System.out.println("The 1st term in the Fibonacci series is: " + a);
        } else if(num == 2) {
            System.out.println("The 2nd term in the Fibonacci series is: " + b);
        } else {
            for(int i=3; i<=num; i++){
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println("The " + num + "rd term in the Fibonacci series is: " + b);
            
        }
    }
    
}
