import java.util.*;

class Solution {
    // Function to get all divisors
    public List<Integer> getDivisors(int N) {
        // Create a list to store divisors
        List<Integer> res = new ArrayList<>();

        // Loop from 1 to square root of N
        for (int i = 1; i * i <= N; i++) {
            // Check if i divides N
            if (N % i == 0) {
                // Add i to result
                res.add(i);

                // If N / i is different from i, add N / i too
                if (i != N / i) {
                    res.add(N / i);
                }
            }
        }

        // Return the list of divisors
        return res;
    }
}

public class Problem6 {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Input number
        int N = 51;

        // Get divisors
        List<Integer> result = sol.getDivisors(N);

        // Print the result
        System.out.print("Divisors of " + N + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
