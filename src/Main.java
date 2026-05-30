import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }

    private static final class MyThread extends Thread{
        @Override
        public void run(){
            
        }
    }
}

