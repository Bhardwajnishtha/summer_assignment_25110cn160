package day18;

import java.util.*;

public class Question71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();                 
        }
        System.out.println("Enter the element to be searched:");
        int key = sc.nextInt();
        int start =0;
        int end = n-1;
        int position =-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == key) {
                position= mid;
                break;
            }
            else if (arr[mid] > key) {
                end = mid -1;
            }
            else{
                start = mid =1;
            }
        }
        if(position != -1) {
            System.out.println(" Element found at " + position + " index ");
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
    
}
