package day10;

public class Question39 {
    public static void main(String[] args) {
        int i, j, n, space;
        n=5;
        for(i=1;i<=n;i++){
            for(space=1;space<=n-i;space++) {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++) {
                System.out.print(j);
        }
        for(j=i-1;j>=1;j--) {
            System.out.print(j);
        }
        System.out.println();
    }
}

}
