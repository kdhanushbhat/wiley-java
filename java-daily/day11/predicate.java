package day11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {
        Predicate<String> pr = (s) -> {
            return s.length() == 4;
        };
        List<String> l = new ArrayList<>(Arrays.asList("abc", "def", "ghi"));
    }
}
