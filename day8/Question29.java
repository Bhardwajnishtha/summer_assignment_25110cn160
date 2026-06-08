package day8;

public class Question29 {
    public static void main(String[] args) {
        int i ,j,space,n;
        n=5;
        for(i=0;i<=n;i++){
            for(space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
}
