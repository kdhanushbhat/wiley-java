package day4;

import java.util.StringTokenizer;

public class tokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My name is anthony gonzalvez");
        int i = 0;
        while (st.hasMoreTokens()) {
            i += 1;
            System.out.println("Token no. " + i + ": " + st.nextToken());
        }
    }
}
