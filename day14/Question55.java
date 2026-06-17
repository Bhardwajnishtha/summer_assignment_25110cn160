package day14;

import java.util.*;

public class Question55 {
    public static int secondlargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secondlargest =Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++) {
            if(arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
             }

        }
        return secondlargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = secondlargest(arr);
        if(result == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest element: " + result);
        }
        sc.close();
    }

}
    

