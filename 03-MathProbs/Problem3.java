public class Problem3{
    public static int reversed(int n){
        int reversed=0;
        while(n>0){
            int lastDigit = n%10;

            reversed = reversed * 10 + lastDigit;

            n=n/10;
        }

        return reversed;
    }
    public static void main(String[]args){
        int n = 4554;

        int reversed = reversed(n);

        if(n==reversed){
            System.out.print("Yes the Number is pallindrome.");
        }else{
            System.out.print("No the number is not pallindrome.");
        }

        
    }
}