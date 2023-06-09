package day8;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class dequeu {
    public static void main(String[] args) {
        Deque<Integer> x = new LinkedList<>();

        x.add(5);
        x.add(1);
        x.add(7);
        x.add(4);
        x.add(2);
        x.addFirst(22);
        System.out.println(x);
    }
}
