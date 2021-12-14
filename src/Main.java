public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Timer timer = new Timer();

        timer.start();



        timer.stop();
        System.out.println("\nRuntime:");
        System.out.println("Milliseconds: " + timer.elapsedTime() / 1000000f);
    }
}
