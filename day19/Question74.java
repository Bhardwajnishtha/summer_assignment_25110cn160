package day19;

import java.util.*;

public class Question74 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows:");
            int rows = sc.nextInt();
            System.out.println("Enter the number of columns:");
            int cols = sc.nextInt();
            int[][] matrix1 = new int[rows][cols];
            int[][] matrix2 = new int[rows][cols];
            int [][]difference = new int[rows][cols];
            System.out.println("Enter the elements of matrix1: ");
            for(int i = 0; i < rows; i++) {
                for( int j =0; j < cols ; j++){
                    matrix1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements of matrix2:");
            for(int i = 0; i < rows ; i++) {
                for(int j = 0; j < cols; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    difference[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            System.out.println("Difference of the two matrices: ");
            for(int i=0; i < rows; i++){
                for(int j =0; j < cols; j++){
                    System.out.println(difference[i][j] + " ");
                }
                System.out.println();
            }
            sc.close();

    }
    
}
