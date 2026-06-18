package day18;

import java.util.*;

public class Question70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i<n; i++) {
            arr[i] =sc.nextInt();
        }
        //selection sorting
        for(int i =0; i < n-1; i++) {
            int min = i;
            for(int j =1+i; j < n; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                    
    }
    
}
int temp = arr[i];
arr[i] = arr[min];
arr[min] = temp;
        }
        System.out.println("The sorted array is:");
        for(int i =0; i<n; i++) {
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}
