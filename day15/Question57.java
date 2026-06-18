package day15;

import java.util.*;

public class Question57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int start =0;
        int end = n-1;
        while(end> start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Enter the reversed array:");
        for(int i=0; i<n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    
}
