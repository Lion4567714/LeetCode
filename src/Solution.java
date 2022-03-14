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
     * Question 9: Palindrome Number
     */
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Question 11: Container With Most Water
     */
    public int maxArea(int[] height) {
        int maxVol = 0;
        int[] dimensions = new int[]{0, 0};

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = height.length - 1; j > i; j--) {
                if (height[j] < dimensions[0] && height[j] < dimensions[1]) {
                    continue;
                }

                dimensions[0] = j - i;
                dimensions[1] = height[i];
                if (height[j] < dimensions[1]) {
                    dimensions[1] = height[j];
                }

                if (dimensions[0] * dimensions[1] > maxVol) {
                    maxVol = dimensions[0] * dimensions[1];
                }
            }
        }

        return maxVol;
    }

    /**
     * Question 56: Merge Intervals
     */
    public int[][] merge(int[][] intervals) {
        boolean[] isUsed = new boolean[intervals.length];
        ArrayList<int[]> mergedIntervals = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            if (isUsed[i])
                continue;

            int[] mergeInterval = intervals[i];
            isUsed[i] = true;

            for (int j = i; j < intervals.length; j++) {
                if (isUsed[i])
                    continue;

                if (intervals[j][0] < mergeInterval[0]) {
                    mergeInterval[0] = intervals[j][0];
                    isUsed[j] = true;
                }
                if (mergeInterval[1] < intervals[j][1]) {
                    mergeInterval[1] = intervals[j][1];
                    isUsed[j] = true;
                }
            }

            mergedIntervals.add(mergeInterval);
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
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
