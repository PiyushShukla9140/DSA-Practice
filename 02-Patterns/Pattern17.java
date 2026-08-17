public class Pattern17{
    public static void main(String[]args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}