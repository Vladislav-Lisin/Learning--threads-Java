import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        final Thread thread = new MyThread();
        thread.start();
    }

    private static final class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println(currentThread().getName());
        }
    }
}

