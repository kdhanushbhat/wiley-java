package day7;

import java.util.Scanner;

class task extends Thread {
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("is daemon");
        } else {
            System.out.println("not daemon");
        }
    }
}

public class Daemon {
    public static void main(String[] args) {
        task t1 = new task();
        t1.setDaemon(true);
        t1.start();
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        sc.close();
    }
}
