package day20;

import java.util.*;

public class Question79 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows =sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        int [][] matrix1 = new int[rows][cols];
        int [][] matrix2 = new int[rows][cols];
        int[][] multiply = new int[rows][cols];
        
        System.out.println("Enter the elements of the first matrix:");
        for(int i =0; i < rows; i++) {
            for(int j =0; j < cols; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix:");
        for(int n = 0; n< rows; n++){
            for(int m = 0; m < cols; m++){
                matrix2[n][m] = sc.nextInt();
            }
        }
        // multiply matrices (assumes cols of first == rows of second)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                for (int k = 0; k < cols; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                multiply[i][j] = sum;
            }
        }
    System.out.println("multiplication of two matrix is:");
    for(int i = 0; i < rows ; i++){
            for(int m =0; m < cols; m++){
                System.out.print(multiply[i][m] + " ");
            }
    System.out.println();
}
    }

    
}
