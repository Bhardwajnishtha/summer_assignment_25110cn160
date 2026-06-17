package day14;

import java.util.*;

public class Question54 {
    public static int Frequency(int arr[] , int key){
        int count = 0;
        for(int i=0; i< arr.length;i++){
            if(arr[i] == key){
                count++;
            }

        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements:");
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to find frequency:");
        int key = sc.nextInt();
        int Frequency = Frequency(arr , key);
        System.out.println("frequency of" + key+ "is" + Frequency);
        
        sc.close();
    }
    
}
