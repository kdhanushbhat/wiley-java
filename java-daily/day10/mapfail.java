package day10;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class mapfail {
    public static void main(String[] args) {
        Map<Integer, String> l = new ConcurrentHashMap<>();
        l.put(0, "a");
        l.put(1, "b");
        Iterator<Integer> it = l.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            l.put(2, "c");
        }
    }
}
