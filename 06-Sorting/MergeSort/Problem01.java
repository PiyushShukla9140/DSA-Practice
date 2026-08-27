// Merge Sort is a classic divide and conquer algorithm.
// The core idea is based on breaking down a big problem into smaller, manageable sub-problems i.e. sorting smaller arrays and then merging those solutions to get the final sorted result.

// Dividing means breaking bigger problem into smaller parts.
// Conquering means concluding those smaller solution and forming a solution for bigger problems


public class Problem01{
    // function to merge the divided parts of the array
    public static void merge(int arr[],int si, int mid, int ei){
        int n=arr.length;
        int temp[] = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;

            }
            k++;
        }


        // loop for left overs

        while(i<=mid){
            temp[k++] = arr[i++];
            
        }

        while(j<=ei){
            temp[k++] = arr[j++];
            
        }

        // copying the temporary array into the original array
        for(i=si,k=0;k<temp.length;i++,k++){
            arr[i] = temp[k];
        }


    }

    public static void mergeSort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);

        merge(arr,si,mid,ei);
    }

    public static void main(String[]args){
        int arr[] = {2,1,4,7,6,5};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}