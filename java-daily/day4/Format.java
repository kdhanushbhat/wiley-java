package day4;

public class Format {
    public static void main(String[] args) {
        String books[] = { "Java reference", "Java a to z", "Java beginners guid" };
        double price[] = { 134.32, 345.122, 663.999 };

        for (int i = 0; i < 3; i++) {
            System.out.format("%25s: %f\n", books[i], price[i]);
        }
    }

}
