package ThreadsStates;

public class ThreadsStatesRunner {
    private static final String TEMPLATE_MESSAGE = "%s : %s\n";

    public void run() throws InterruptedException{
        Thread mainThread = Thread.currentThread();
        Thread thread = new Thread(() -> {
            try {
                mainThread.join(2000);
//                mainThread.join();
                showThreadState(Thread.currentThread()); // RUNNABLE
                showThreadState(mainThread);

            } catch (final InterruptedException interruptedException){
                System.out.println();
            }
        });
        showThreadState(thread); //NEW
        thread.start();
        Thread.sleep(1000);
        showThreadState(thread); // TIME_WAITING/WAITING
    }

    public static void showThreadState(Thread thread){
        System.out.printf(TEMPLATE_MESSAGE, thread.getName(), thread.getState());
    }
}
