public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Timer timer = new Timer();

        timer.start();

        System.out.println(solution.tribonacci(25));

        timer.stop();
        System.out.println("Milliseconds: " + timer.elapsedTime() / 1000000f);
        System.out.println("Seconds: " + timer.elapsedTime() / 1000000000f);
    }
}
