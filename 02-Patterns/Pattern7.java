// star pyramid pattern


// rule no 1: count the no of rows
// rule no 2: for the inner loop focus in the columns and connect them somehow to the rows
// rule no 3: print them "*" inside the inner loop
// rule no 4: observe symmetry optional



// there are 5 rows, i=0 to i=4
// now for the first row there are 4 empty spaces, then a star and then again 4 empty spaces
// for the second row there are 3 empty spaces and then 3 stars and then again 3 empty spaces

// we can notice a pattern here 
// first we need to find spaces, n-i-1 is used
// eg: if i=0, n=5, then spaces will be 5-0-1 that is 4

public class Pattern7{
    public static void main(String[]args){
        int n=5;
        for(int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
             System.out.println();
        }
        System.out.println();
    }
    
}


