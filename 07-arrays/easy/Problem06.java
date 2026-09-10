// rotate array by k places
public class Problem06{
    // brute force appraoch
    public static void rotate(int arr[], int n, int k){
        for(int i=0;i<k;i++){
            int curr = arr[0];
            for(int j=1;j<n;j++){
                arr[i-1] = arr[i];
            }
            arr[n-1] = curr;
        }
        
    }
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k=3;
        rotate(arr,n,k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}