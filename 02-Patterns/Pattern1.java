import java.util.Scanner;


// rule no 1: count the no of rows
// rule no 2: for the inner loop focus in the columns and connect them somehow to the rows
// rule no 3: print them "*" inside the inner loop
// rule no 4: observe symmetry optional

public class Pattern1{
    public static void main(String[]args){
        int n=5;
        for (int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}