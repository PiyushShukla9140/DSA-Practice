/*
What is Recursion?
    Recursion is a programming technique where a function calls itself directly or indirectly to solve a problem, 
    by breaking it down into smaller subproblems until it reaches a base case that stops further calls.

    if  there is no condition to stop the recursive calls, the calls will run indefinitely until the stack runs out of memory (stack overflow ).



What is Stack Overflow in Recursion?
    Whenever recursion calls are executed, they’re simultaneously stored in a recursion stack where they wait for the completion of the recursive function. 
    A recursive function can only be completed if a base condition is fulfilled and the control returns to the parent function. 

    But, when there is no base condition given for a particular recursive function, 
    it gets called indefinitely which results in a Stack Overflow i.e,
    exceeding the memory limit of the recursion stack and hence the program terminates giving a Segmentation Fault error. 



Base Condition:
    It is the condition that is written in a recursive function in order for it to get completed and not to run infinitely. 
    After encountering the base condition, the function terminates and returns back to its parent function simultaneously.



 */



// An example to understand recurrsion. A program to print name n no of times

class Solution{
    public void name(String name, int n, int count){
        if(count==n){// this is our base condition from where we are going to return 
            return;
        }

        System.out.println(name);

        name(name,n,count+1);
    }
}

public class Intro{
    public static void main(String[]args){
        Solution obj = new Solution();
        int n=5;
        String name = "Piyush";

        obj.name(name,n,0);
    }
}
