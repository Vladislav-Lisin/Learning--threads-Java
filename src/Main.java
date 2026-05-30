import static java.lang.Thread.currentThread;

public class Main {
    public static void main(String[] args) {
        final Runnable task = () -> System.out.println(currentThread().getName());
        final Thread thread = new Thread(task);
        thread.start(); // вызов потока
    }

}

