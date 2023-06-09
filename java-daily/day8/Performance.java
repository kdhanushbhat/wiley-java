package day8;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Performance {
    public static void main(String[] args) {
        long start, end;
        List<Integer> array = new ArrayList<>();
        List<Integer> vector = new Vector<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            vector.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Vector: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            array.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Array: " + (end - start));

    }
}
