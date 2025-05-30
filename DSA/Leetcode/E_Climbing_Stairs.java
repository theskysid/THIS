package Leetcode;

import java.util.Arrays;

public class E_Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(40));
    }
    static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }

    static int helper(int n, int[] dp) {
        if (n <= 3) return n;
        if (dp[n] != -1) return dp[n];

        dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
        return dp[n];
    }
}

