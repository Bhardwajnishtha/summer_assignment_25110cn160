package day10;

public class Question38 {
    public static void main(String[] args) {
        int i, j, n, space;
        n=5;
        for(i=n;i>=1;i--){
            for(space=1;space<=n-i;space++) {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
