import PremadeClasses.*;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
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
