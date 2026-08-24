// Print numbers from 1 to n


public class Problem02{
    public static void Incream(int n){
        // base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }

        Incream(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[]args){
        int n=10;
        Incream(n);
    }
}