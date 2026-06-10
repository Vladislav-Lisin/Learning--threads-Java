import static java.lang.Thread.currentThread;

public class Main {
    private static final int FIRST_START_NUMBER = 1;
    private static final int FIRST_END_NUMBER = 500;

    private static final int SECOND_START_NUMBER = 501;
    private static final int SECOND_END_NUMBER = 1000;
    private static final String TEMPLATE_MESSAGE_THREAD_NAME_AND_NUMBER = "%s : %d\n";
    private static final int TIME_WAITING_IN_MILLIS = 1000;


    public static void main(String[] args)  throws InterruptedException {
        final TaskSummingNumber firstTask =  new TaskSummingNumber(FIRST_START_NUMBER, FIRST_END_NUMBER);
        final TaskSummingNumber secondTask = new TaskSummingNumber(SECOND_START_NUMBER, SECOND_END_NUMBER);
        Thread firstThread = new Thread(firstTask);
        Thread secondThread = new Thread(secondTask);
        firstThread.start();
        secondThread.start();

        waitForTasksFinished(firstThread, secondThread);
        final int resultNumber = firstTask.getSum() + secondTask.getSum();
        System.out.printf(TEMPLATE_MESSAGE_THREAD_NAME_AND_NUMBER, currentThread().getName(), resultNumber);
    }

//    public static void startThread(final Runnable runnable){
//        Thread thread = new Thread(runnable);
//        thread.start();
//    }

    public static void waitForTasksFinished(final Thread... threads) throws InterruptedException{
        for (Thread thread : threads) {
            thread.join();
        }
    }

}

