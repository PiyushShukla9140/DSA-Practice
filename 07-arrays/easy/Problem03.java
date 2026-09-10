// check if array is sorted or not

import java.util.*;

public class Problem03{
    // brute force approach
    public boolean isSorted(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If any element is smaller than the previous one, return false
                if (arr[j] < arr[i]) 
                    return false;
            }
        }
        return true; // Return true if no unsorted elements are found
    }


    // optimum approach
    public static boolean sorted(int arr[],int n){
        if(n==1){
            return true;
        }

        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[]args){
        int arr[] = {2,3,8,5,6,7};
        int n = arr.length;

        if(!sorted(arr,n)){
            System.out.println("The given array is not sorted");
        }else{
            System.out.println("The given array is sorted");
        }
    }
}

