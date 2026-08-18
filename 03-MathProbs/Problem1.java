/*
Count digits in a number

Problem Statement: Given an integer N, return the number of digits in N.
 */


public class Problem1{
    public static void main(String[]args){
        int n=456754;

        int count = 1;

    //    while(n>0){
    //      count = count + 1;

    //      n = n / 10;
    //    }


    for(int i=0;i<=n;i++){
        count = count +1;

        n = n/10;
    }
        System.out.print(count);
    }
}