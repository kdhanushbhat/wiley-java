package day3;

class Example {
    public void fun1() {
        System.out.println("Public");
    }

    protected void fun2() {
        System.out.println("Protected");
    }

    private void fun3() {
        System.out.println("Private");
    }

    public void fun4() {
        fun3();
    }
}

class ex2 extends Example {
    public void fun() {
        super.fun2();
    }
}

public class AcessModify {

    public static void main(String[] args) {
        ex2 obj = new ex2();
        obj.fun1();
        obj.fun();
        obj.fun4();
    }

}
