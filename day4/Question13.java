package day4;

public class Question13 {
    public static void main(String[] args) {
        int num=10;
        int a =0, b=1;
        System.out.print("Fibonacci series: ");
        for(int i=1; i<=num; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    
}
