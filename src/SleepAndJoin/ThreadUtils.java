package SleepAndJoin;

public final class ThreadUtils {

    private ThreadUtils() {
    }

    public static void waitForTasksFinished(Thread... threads)
            throws InterruptedException {

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
