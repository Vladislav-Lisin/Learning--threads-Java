import java.util.stream.IntStream;
import static java.lang.Thread.currentThread;

public class TaskSummingNumber implements Runnable{

    private final int startNumber;
    private final int endNumber;
    private int sum = 0;

    public TaskSummingNumber(int startNumber, int endNumber){
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public int getSum(){
        return sum;
    }

    @Override
    public void run(){
        IntStream.rangeClosed(startNumber, endNumber).forEach(i -> sum += i);
        System.out.println(currentThread().getName() + " : " + sum);
    }

}
