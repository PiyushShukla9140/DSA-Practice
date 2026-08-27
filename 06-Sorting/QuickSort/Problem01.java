// What is Quick Sort?
// Quick sort works on pivot and partition technique
// In this technique, we take an element as a pivot, it can either be first element ot the last element
// After taking the pivot we place it in the center of the array then we place those element which are smaller on the left side of the pivot
// and those elements which are larger on the right side of the pivot

public class Problem01{
    
    public static void quickSort(int arr[], int si, int ei){
        // base conditon
        if(si>=ei){
            return;
        }

        int pivotIndex = partition(arr,si,ei);
        quickSort(arr,si,pivotIndex-1);
        quickSort(arr,pivotIndex+1,ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;
        return i;
    }
    public static void main(String[]args){
        int arr[] = {1,4,6,3,7,2};
        quickSort(arr,0,arr.length-1);

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}