// left rotate array by one
public class Problem05{
    // brute force approach
    public static void solve(int[] arr, int n) {
        int[] temp = new int[n];  // Temporary array to store shifted elements

        // Shift elements to the left by one position
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];  // First element moves to the last position

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }


    // optimal approach
    public static void rotate(int arr[],int n){
        int curr = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }

        arr[n-1] = curr;
    }
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        rotate(arr,n);
        rotate(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}