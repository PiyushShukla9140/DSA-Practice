// Find the largest element in an array
import java.util.*;

public class Problem01{
    // brute force approach
    // sort the array the array in ascending order and return the last element
    public static int sortArray(int arr[]){
        int n = arr.length-1;

        Arrays.sort(arr);

        return arr[n];
    }


    // optimal approach
    // take a varaible largest and assume that the first element is the largest number
    // then compare it to the second number if it is larger store the second number in that variable
    // this way run till n

    public static int largest(int arr[]){
        int largest = arr[0];

        for(int i=1; i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[]args){
        int arr[] = {5,8,4,10,12,6,8,15};
        int result = sortArray(arr);

        System.out.println(result);

        int result2 = largest(arr);
        System.out.println(result2);

    }
}