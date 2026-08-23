import java.util.*;
public class Problem5{
    public static void main(String[]args){
        int n = 371;
        int original = n;
        int count = 0;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            count++;
            n=n/10;
        };

        n=original;

        while(n>0){
            int rem = n%10;
            sum += (int)Math.pow(rem,count);
            
            n=n/10;
        };

        if(sum == original){
            System.out.println("Yes the number is armstrong");
        }
        else{
            System.out.println("No the number isnt armstrong");
        }




    }
}