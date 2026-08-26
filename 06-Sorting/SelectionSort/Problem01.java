// What is selection Sort?
// Selection sort is a sorting technique in which we swap the smallest element of an array at the first position in a single swap
// Selection Sort repeatedly finds the smallest element from the unsorted portion of the array and places it at the beginning of that portion using one swap.


// Time Complexity: O(n square)
// But less swapping than BUBBLE SORT

// In this sorting technique we use a minimum position variable which is used to identify the position at which the element will be placed
// We cannot place every digit on the same first place
//i = position where minimum should go
//minPos = position where current minimum is found

public class Problem01{
    public static int[] selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minPos = i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
    public static void main(String[]args){
        int arr[] = {3,2,5,8,7};
        selectionSort(arr);

        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}