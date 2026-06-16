package day13;

import java.util.*;

public class Question51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++) {
            arr[i] =sc.nextInt();

        }
        int Largest = arr[0];
        int Smallest = arr[0];
        for (int i = 1;i<n;i++){
            if (arr[i] > Largest){
                Largest = arr[i];
            }
            if(arr[i] < Smallest){
                Smallest = arr[i];
            }
    }
    System.out.println("Largest element is:" + Largest);
    System.out.println("Smallest element is:" + Smallest);
    sc.close();
    
}
}
