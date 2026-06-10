package day9;

public class Question35 {
    public static void main(String[] args) {
        char i, j, n;
        n = 'E';
        for(i = 'A'; i <= 'E'; i++) {
            for(j = 'A'; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}

