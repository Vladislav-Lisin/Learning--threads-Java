import SleepAndJoin.SummingNumbersRunner;
import SleepAndJoin.TaskSummingNumber;
import ThreadsStates.ThreadsStatesRunner;

import static java.lang.Thread.currentThread;

public class Main {
    public static void main(String[] args)  throws InterruptedException {
        ThreadsStatesRunner runner = new ThreadsStatesRunner();
        runner.run();
        System.out.println("WAITING/TIME_WAITING");
    }
}

