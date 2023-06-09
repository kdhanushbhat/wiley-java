package day6;

class T extends Thread {
    int start;
    int end;

    T(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println("Num: " + i);
        }
    }

}

public class thread1 {
    public static void main(String[] args) {
        T t1 = new T(1, 5);
        T t2 = new T(6, 10);
        t1.start();
        t2.start();
    }
}
