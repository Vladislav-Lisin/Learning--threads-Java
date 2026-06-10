import SleepAndJoin.SummingNumbersRunner;
import SleepAndJoin.TaskSummingNumber;

import static java.lang.Thread.currentThread;

public class Main {
    private static final int FIRST_START_NUMBER = 1;
    private static final int FIRST_END_NUMBER = 500;

    private static final int SECOND_START_NUMBER = 501;
    private static final int SECOND_END_NUMBER = 1000;
    private static final String TEMPLATE_MESSAGE_THREAD_NAME_AND_NUMBER = "%s : %d\n";
    private static final int TIME_WAITING_IN_MILLIS = 1000;


    public static void main(String[] args)  throws InterruptedException {
        SummingNumbersRunner runner = new SummingNumbersRunner();
        runner.run();
    }
}

