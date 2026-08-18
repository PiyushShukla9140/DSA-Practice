/*
Reverse Digits of A Number


19

Problem Statement: Given an integer N return the reverse of the given number.

Note: If a number has trailing zeros, then its reverse will not include them. For e.g , reverse of 10400 will be 401 instead of 00401.
 */

public class Problem2{
    public static void main(String[]args){
        int n = 454323;

        int reversed = 0;

        while(n>0){
            int lastDigit = n%10;

            reversed = reversed*10 +lastDigit;

            n=n/10;
        }

        System.out.print(reversed);



    }
}