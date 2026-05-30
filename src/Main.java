import java.util.List;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        final Thread thread = new Thread(){
            @Override
            public void run (){
                System.out.println(currentThread().getName());
            }
        };
        thread.start();
    }

}

