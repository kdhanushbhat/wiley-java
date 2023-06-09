package day10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class failsafe {
    public static void main(String[] args) {
        List<Integer> l = new CopyOnWriteArrayList<>();
        l.add(2);
        l.add(4);
        Iterator<Integer> it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            l.add(1);
        }
        System.out.println(it);
    }
}
