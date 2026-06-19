package day19;

import java.util.*;

public class Question75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[rows][cols];
        System.out.println("Enter the elements of the matrix");
        for(int i = 0; i< rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < cols; i++) {
            for(int j =0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpose of the matrix :");
        for(int i = 0; i < cols; i++){
            for(int j =0;j < rows; j++){
                System.out.println(transpose[i][j] + "");
            }
            System.out.println();
    }
    sc.close();
    
}
}
