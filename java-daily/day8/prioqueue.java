package day8;
import java.util.PriorityQueue;
import java.util.Queue;

public class prioqueue {
    public static void main(String[] args) {
        Queue<Integer> x = new PriorityQueue<>();

        x.add(5);
        x.add(1);
        x.add(7);
        x.add(4);
        x.add(2);
        System.out.println(x);
    }
}
