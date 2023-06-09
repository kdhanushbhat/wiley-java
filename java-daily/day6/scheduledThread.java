package day6;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Something extends Thread {
    static int x = 0;

    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(x);

        x += 1;
    }
}

public class scheduledThread {
    public static void main(String[] args) {
        ScheduledExecutorService ex = Executors.newScheduledThreadPool(2);
        ex.scheduleAtFixedRate(new Something(), 5, 2, TimeUnit.SECONDS);

    }

}
