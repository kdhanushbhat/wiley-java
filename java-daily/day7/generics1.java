package day7;

import java.util.ArrayList;
import java.util.List;

public class generics1 {
    public static void main(String[] args) {
        Printer print = new Printer<>(5000);
        print.print();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        printlist(list);
        func(new Car(), "value");
    }

    public static <T, V> void func(T var, V var2) {
        System.out.println(var + " !! " + var2);
    }

    public static void printlist(List<Integer> list) {
        System.out.println(list);
    }
}
