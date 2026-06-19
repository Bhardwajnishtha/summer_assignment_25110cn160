package day19;

import java.util.*;

public class Question76 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thenumber od rows:");
        int rows =sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        int[][] matrix =new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for(int i =0; i < rows; i++){
            for(int j =0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        for(int i =0; i < rows; i++){
            for(int j = 0; j < cols; j++) {
                if (i==j){
                    sum+=matrix[i][i];
                }
            }
        }
        System.out.println("SUM Of the diagonal elements is:");
        System.out.println(sum  );
    sc.close();
    }
    
    
}
