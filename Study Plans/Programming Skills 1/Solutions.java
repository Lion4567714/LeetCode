public class Solutions {

    /**
     * Problem 1523: Count Odd Numbers in an Interval Range
     * Given two non-negative integers low and high, returns the count of odd numbers
     * between low and high (inclusive).
     */
    public int countOdds(int low, int high) {
        int numOdds = (high - low) / 2;

        if ((low % 2 == 1) || (high % 2 == 1))
            numOdds++;

        return numOdds;
    }

    /**
     * Problem 1491: Average Salary Excluding the Minimum and Maximum Salary
     * Given an array of unique integers salary where salary[i] is the salary of the ith
     * employee, return the average salary (excluding the min and max).
     */
    public double average(int[] salary) {
        double totalSalary = salary[0];
        int minSalary = salary[0];
        int maxSalary = salary[0];

        for (int i = 1; i < salary.length; i++) {
            if (salary[i] < minSalary)
                minSalary = salary[i];
            else if (salary[i] > maxSalary) 
                maxSalary = salary[i];

            totalSalary += salary[i];
        }

        return (totalSalary - minSalary - maxSalary) / (salary.length - 2);
    }
}