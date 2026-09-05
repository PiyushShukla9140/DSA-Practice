// find the second smallest and second largest number in an array

import java.util.*;
public class Problem02{
    // brute force appraoach
    // sort the asending order and then return the second and second last element from the array
    public static void sort(int arr[],int n){
        // Edge case: when the array has less than 2 elements
        if (n == 0 || n == 1) {
            System.out.println(-1 + " " + -1);  // Print -1 for both second smallest and second largest
            return;
        }

        // Sort the array to easily find the second smallest and second largest elements
        Arrays.sort(arr);

        // Second smallest element is at index 1 after sorting
        int small = arr[1];

        // Second largest element is at index n-2 after sorting
        int large = arr[n - 2];

        // Output the second smallest and second largest elements
        System.out.println("Second smallest is " + small);
        System.out.println("Second largest is " + large);
    
    }

    // better approach 
    public static void better(int arr[],int n){
        if (n == 0 || n == 1) {
            System.out.println(-1 + " " + -1);  // Print -1 for both second smallest and second largest
            return;
        }

        int small = Integer.MAX_VALUE , second_small = Integer.MAX_VALUE;
        // stores +infinity 
        int large = Integer.MIN_VALUE , second_large = Integer.MIN_VALUE;
        // stores -infinity

        // here we are finding put the largest and smallest values
        for(int i=0;i<n;i++){
            small = Math.min(small,arr[i]);
            large = Math.max(large,arr[i]);
        }

        // now the second small is just a greater number than smallest
        // and the second largest is just a smaller number than largest
        // therefore we are going to apply condotion to not include largest and smallest no

        for (int i = 0; i < n; i++) {
            if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];  // Update second smallest if a smaller element which is  greater than the smallest is found
            }
            if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];  // Update second largest if a larger element is found
            }
        }

        // Output the second smallest and second largest elements
        System.out.println("Second smallest is " + second_small);
        System.out.println("Second largest is " + second_large);
    }



    // optimum approach 
    

    public static void main(String[]args){
        int arr[] = {1,4,6,8,3,7,9};
        int n = arr.length;
        // sort(arr,n);
        better(arr,n);
    }
}