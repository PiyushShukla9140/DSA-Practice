public class Problem07{
    public static int Fibonacci(int n){
        // base case 
        if(n==0||n==1){
            return n;
        }

        int fn1 = Fibonacci(n-1);
        int fn2 = Fibonacci(n-2);
        int fn = fn1 + fn2;
        return fn;
    }
    public static void main(String[]args){
        int n=6;
        int result = Fibonacci(n);

        System.out.println(result);
    }
}