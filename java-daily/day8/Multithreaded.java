package day8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Multithreaded {
    public static void main(String[] args) throws InterruptedException {
        long start, end;
        List<Integer> array = Collections.synchronizedList(new ArrayList<>());
        List<Integer> vector = new Vector<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                array.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                array.add(i);
            }
        });
        start = System.currentTimeMillis();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        end = System.currentTimeMillis();
        System.out.println("Arraylist: " + array.size() + " -- " + (end - start));
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                vector.add(i);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                vector.add(i);
            }
        });
        start = System.currentTimeMillis();
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        end = System.currentTimeMillis();
        System.out.println("Vecotrlist: " + vector.size() + " -- " + (end - start));
    }
}
