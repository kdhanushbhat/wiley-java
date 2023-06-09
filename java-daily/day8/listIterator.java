package day8;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listIterator {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("orange");

        ListIterator<String> iterator = fruits.listIterator();
        // while (iterator.hasNext()) {
        // String fruit = iterator.next();
        // if (fruit.equals("banana")) {
        // iterator.remove();
        // }
        // }
        fruits.remove("orange");
        System.out.println(fruits); // prints "[apple, orange]"
    }
}
