import PremadeClasses.*;

import java.util.*;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }

    /**
     * Question 3: Longest Substring Without Repeating Characters
     * Note: This could be optimized a lot using a list of some sort.
     */
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (s.substring(i - length, i).lastIndexOf(c) != -1) {
                // Set the new length equal to the old length minus the characters at and before the repeated character
                length = i - s.substring(0, i).lastIndexOf(c) - 1;
                if (s.charAt(i - 1) == c) {
                    length = 0;
                }
            }

            length++;
            if (length > longest) {
                longest = length;
            }
        }

        return longest;
    }

    /**
     * Question 70: Climbing Stairs
     */
    public int climbStairs(int n) {
        int first = 1;
        int second = 1;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }

        return second;
    }

    /**
     * Question 509: Fibonacci Number
     */
    public int fib(int n) {
        int first = 0;
        int second = 1;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }

        return second;
    }

    /**
     * Question 1137: N-th Tribonacci Number
     */
    public int tribonacci(int n) {
        int first = 0;
        int second = 1;
        int third = 1;

        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        for (int i = 3; i <= n; i++) {
            int temp = first + second + third;
            first = second;
            second = third;
            third = temp;
        }

        return third;
    }
}
