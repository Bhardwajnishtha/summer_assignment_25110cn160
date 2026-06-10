package day10;

public class Question40 {
    public static void main(String[] args) {
        char i, j, n, space;
        n='E';
        for(i='A';i<=n;i++){
            for(space='A';space<=n-i;space++) {
                System.out.print(" ");
            }
            for(j='A';j<=i;j++) {
                System.out.print(j);
        }
        for(j=(char)(i-1);j>='A';j--) {
            System.out.print(j);
        }
        System.out.println();
            }
        }
    }

