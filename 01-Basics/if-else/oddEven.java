// check whether number is odd or even

import java.util.Scanner;
public class oddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = sc.nextInt();

        // condition checking

        if(input % 2 != 0){
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }
}