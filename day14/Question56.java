package day14;

import java.util.*;

public class Question56 {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the elements of the array:");
        for( int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Duplicates of the elements are:");
        for(int i =0; i<n; i++) {
            for(int j = i + 1; j< n; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
    
}
