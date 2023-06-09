package day7;

class Something implements Runnable {
    static int x = 0;

    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(x);
        x += 1;
    }
}

public class groupThread1 {

    public static void main(String[] args) {

        ThreadGroup tg = new ThreadGroup("FIRST");
        ThreadGroup tg1 = new ThreadGroup(tg, "child");

        Thread t1 = new Thread(tg, new Something(), "t1");
        Thread t2 = new Thread(tg, new Something(), "t2");
        Thread t3 = new Thread(tg1, new Something(), "t3");

        t1.start();
        t2.start();
        t3.start();
        System.out.println("active count--" + tg.activeCount());
    }
}
