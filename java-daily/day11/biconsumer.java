package day11;
import java.util.function.BiConsumer;

public class biconsumer {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> bi = (a, b) -> {
            if (a < b) {
                System.out.println("a is more");
            } else {
                System.out.println("b is more");
            }
        };
        bi.accept(5, 63);
    }
}
