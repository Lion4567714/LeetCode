public class Timer {

    private long startTime;
    private long endTime;

    public Timer() {
        startTime = 0;
        endTime = 0;
    }

    public boolean start() {
        startTime = System.nanoTime();
        return true;
    }

    public boolean stop() {
        endTime = System.nanoTime();
        return true;
    }

    public long elapsedTime() {
        return endTime - startTime;
    }

    public boolean reset() {
        startTime = 0;
        endTime = 0;
        return true;
    }
}
