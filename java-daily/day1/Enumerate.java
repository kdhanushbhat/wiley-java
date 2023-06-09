package day1;

enum Days {
    monday, tuesday, wednesday
}

public class Enumerate {
    public static void main(String[] args) {

        for (Days day : Days.values()) {
            System.out.println(Days.values());
        }
    }
}
