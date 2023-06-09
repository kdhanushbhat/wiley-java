package day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Something2 extends Thread {
    static int x = 0;

    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(x);
        x += 1;
    }
}

public class thread2 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 100; i++) {
            es.execute(new Something2());
            if (Something2.x == 45) {
                es.shutdownNow();
            }
        }
        es.close();

    }
}
