import java.util.Scanner;

// rule no 1: count the no of rows
// rule no 2: for the inner loop focus in the columns and connect them somehow to the rows
// rule no 3: print them "*" inside the inner loop
// rule no 4: observe symmetry optional

public class Pattern2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}