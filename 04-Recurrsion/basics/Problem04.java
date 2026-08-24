// Print factorial of a number

public class Problem04{
    // Brute force approach
    public static int fact(int n){
        int factorial = 1;
        for (int i=1;i<=n;i++){
            factorial = factorial * i;
        }

        return factorial;

    }

    // recursive approach
    public static int fact2(int n){
        // base case
        if(n==1){
            return 1;
        }

        return n*fact2(n-1);
    }
    public static void main(String[]args){
        int n=4;
        int result1 = fact(n);
        int result = fact2(n);
        System.out.println(result1);
        System.out.println(result);
    }
}