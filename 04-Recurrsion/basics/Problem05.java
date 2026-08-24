// revrse an array
// there are three ways to solve this ques

public class Problem05{
    // brute force approach create a new array and store the value of the previous array from the end in the new array
    public static int[] arrayRev(int arr[]){
        int n = arr.length;
        int anotherArr [] = new int[n] ;
        for (int i=0;i<n;i++){
            anotherArr[i] = arr[n-1-i];

        }

        return anotherArr;

    }

    // optimum approach
    // two pointer approach
    public static void arrayRev2(int arr[]){
        // initialize two pointers one at the starting of the array and ohter at the end
        // swwap boht the pointers until first is p1 is smaller than p2
        int p1 = 0;
        int p2 = arr.length-1;

        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;

        }
    }

    // third method is to use java inbuilt collection.reverse method

    public static void main(String[]args){
        int arr[] = {1,2,3,4,5};

        // int result[] = arrayRev(arr);

        // for (int i=0;i<result.length;i++){
        //     System.out.print(result[i]);
        // }

        arrayRev2(arr);

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }



    }
}