// What is bubble sort?
// It is a sorting technique where the largest element of an array comes to the end of the erray 
// or sort the array in such a way that largest element becomes the last element of an array

// For this we are going to use nested for loop
// First loop will iterate from 0 to n-1 (first to last element)
// Second loop will iterate from 0 to n-1-i (first to second last element)
// Why are we using n-1-i?
// Because for the first element we have to go till last and sort the largest element at the last 
// But after this first iteration last place is fixed as we have already placed the largest  element at the last cant replace it now
// So for the second iteration, the seconf for loop will run from 0 to second last index

// Space Complexity: O(1)

// Time complexity:
// For the first loop, we are iterating from 0 to n
// For the second loop, again we are iterating from 0 to nearly n
// Time complexity in the worst case will be O(n square)


// What if array is already sorted?
// This is our best case, we are going to use boolean swapp variable 
// This indicates that if swaaping has happened then array was not sorted but if swapping has not happened array was already sorted
// Initially after forst forst loop we will initailize the variable as false, assuming the swapping has not happened yet
// Then in the second loop we will change its value to true after swapping
// Time complexity; as the first loop got broken, second loop didn't run the time complexity is O(n)

public class Problem01{
    public static int[] BubbleSort(int arr[]){
        int n = arr.length;
       

        // For ascending order

        // for (int i=0;i<n-1;i++){
        //     for (int j=0;j<n-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j+1];
        //             arr[j+1] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }


        // For descending order
        for (int i=0;i<n-1;i++){
             boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        return arr;
    }

    public static void main(String[]args){
        int arr[] = {4,5,9,8,6};
        int arr2[] = {9,8,6,5,4};
        BubbleSort(arr2);

        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }


}