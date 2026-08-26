// check whehter the given string is pallindrome or not
public class Problem06{
    // two pointer approach
    public static boolean StrPallin(String name){
        int p1 = 0;
        int p2 = name.length()-1;

        while(p1<p2){
            if(name.charAt(p1)!=name.charAt(p2)){
                return false;
            }

            p1++;
            p2--;
        }

        return true;
    }

    // recursion 
    // it is also similar to the two pointer approach
    public static boolean StrPallin2(int i, String str){
        // base case
        if(i>=str.length()/2){
            return true;
        }

        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }

        return StrPallin2(i+1,str);
    }
    public static void main(String[]args){
        String name = "ABCDA";
        // if(!StrPallin(name)){
        //     System.out.print("The given string is not pallindrome");
        // }
        // else{
        //     System.out.print("The given string is pallindrome");
        // }

        if(!StrPallin2(0,name)){
            System.out.print("The given string is not pallindrome");
        }
        else{
            System.out.print("The given string is pallindrome");
        }
    }
}