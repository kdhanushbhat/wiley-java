package day7;

class calc {
    public synchronized void writeln(int k) {
        for (int i = 0; i < 10; i++) {
            System.out.println(k + "--" + i * k);
        }
    }
}

class c1 extends Thread {
    calc obj;
    int k;

    public c1(calc obj, int k) {
        this.obj = obj;
        this.k = k;
    }

    @Override
    public void run() {
        obj.writeln(this.k);
    }
}

public class sync {

    public static void main(String[] args) {
        calc obj = new calc();
        c1 t1 = new c1(obj, 5);
        c1 t2 = new c1(obj, 10);
        t1.start();
        t2.start();
    }

}
