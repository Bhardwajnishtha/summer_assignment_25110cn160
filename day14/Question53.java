package day14;

import java.util.*;

public class Question53 {
   public static int Linearsearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
   }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter elements to search:");
        int key = sc.nextInt();
        int position = Linearsearch(arr , key);
        if(position != -1){
            System.out.println("Element found at index:" + position);
        }
        else{
            System.out.println("Element not found in the array");
        }

    }
    
}
