// print gcd 

import java.util.*;

public class Problem4{
    // there are three appraches to find the gcd of two numbers


    // brute firce approach

    public static int findGCD(int n1, int n2){
        int gcd = 1;
        for(int i=1;i<Math.min(n1,n2);i++){
            if(n1%i==0 && n2 %i == 0){
                gcd = i;
            }
        }

        return gcd;
        // Why it is brute force approach?
        // Because we are looping from 1 to smallest of boht the integers, if boht the numbers are of 5 digigts then the no of iterations increases 
    }


    // Better approach 
    // Instead of starting from the 1, start the loop from the smaller integer 
    // The hcf of both the integer cannot be grater than the smaller number

    public static int findGCD2(int n1, int n2){
        int gcd = 1;
        for(int i=Math.min(n1,n2);i>0;i--){
            if(n1%i==0 && n2 %i == 0){
                return i;
            }
        }

        return 1;
        // Why it is better than the brute force approach?
        // Because we are starting from the smallest integer itself than going backwards this way no of iterations will be less
    }


    // optimized appraoch
    // using the euclidean theorem
    /*
    The Euclidean Algorithm is a method for finding the greatest common divisor (GCD) of two numbers. It operates on the principle that the GCD of two numbers remains the same even if the smaller number is subtracted from the larger number.

        To find the GCD of n1 and n2 where n1 > n2:

        Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
        Once one becomes 0, the other is the GCD of the original numbers.
        Example: n1 = 20, n2 = 15

        gcd(20, 15) = gcd(20 - 15, 15) = gcd(5, 15)
        gcd(5, 15) = gcd(15 - 5, 5) = gcd(10, 5)
        gcd(10, 5) = gcd(10 - 5, 5) = gcd(5, 5)
        gcd(5, 5) = gcd(5 - 5, 5) = gcd(0, 5)
        Hence, return 5 as the GCD.
     */

    public static int gcd3(int a, int b){
        while(a > 0 && b > 0) {
            // If a is greater than b,
            // subtract b from a and update a
            if(a > b) {
                // Update a to the remainder
                // of a divided by b
                a = a % b;
            }
            // If b is greater than or equal
            // to a, subtract a from b and update b
            else {
                // Update b to the remainder
                // of b divided by a
                b = b % a;
            }
        }
        // Check if a becomes 0,
        // if so, return b as the GCD
        if(a == 0) {
            return b;
        }
        // If a is not 0,
        // return a as the GCD
        return a;
    }



    public static void main(String[]args){
        int n1 = 28;
        int n2 = 21;
        int gcd = findGCD(n1,n2);
        int gcd2 = findGCD2(n1,n2);
        int gcd3 = gcd3(n1,n2);
        System.out.println(gcd);
        System.out.println(gcd2);
         System.out.println(gcd3);
        
        

        
    }
}