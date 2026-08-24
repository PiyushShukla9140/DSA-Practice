// print sum of first n natural numbers

import java.util.*;
public class Problem03{
    // Brute force approach
    public static int sum(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }

        return sum;
    }


    // optimum approach by using recurrsion
    public static int sum01(int n){
        // Base case
        if(n==1){
            return 1;
        }
        
        
        return n+sum01(n-1);


    }

    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = sum(n);
        int result2 = sum01(n);

        System.out.println(result2);


    }
}