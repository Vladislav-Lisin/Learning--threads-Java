package SleepAndJoin;

public class SummingNumbersRunner {

    private static final int FIRST_START_NUMBER = 1;
    private static final int FIRST_END_NUMBER = 500;

    private static final int SECOND_START_NUMBER = 501;
    private static final int SECOND_END_NUMBER = 1000;
    private static final String TEMPLATE_MESSAGE_THREAD_NAME_AND_NUMBER = "%s : %d\n";
//    private static final int TIME_WAITING_IN_MILLIS = 1000;

    public void run() throws InterruptedException {



        final TaskSummingNumber firstTask =
                new TaskSummingNumber(FIRST_START_NUMBER, FIRST_END_NUMBER);

        final TaskSummingNumber secondTask =
                new TaskSummingNumber(SECOND_START_NUMBER, SECOND_END_NUMBER);

        Thread firstThread = new Thread(firstTask);
        Thread secondThread = new Thread(secondTask);

        firstThread.start();
        secondThread.start();

        ThreadUtils.waitForTasksFinished(firstThread, secondThread);

        int result = firstTask.getSum() + secondTask.getSum();

        System.out.printf(TEMPLATE_MESSAGE_THREAD_NAME_AND_NUMBER, Thread.currentThread().getName(), result);
    }
}
