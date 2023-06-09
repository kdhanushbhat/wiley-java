package day3;

abstract class Ex1 {
    static {
        System.out.println("static of 1nst abstract class");
    }

    public abstract void fun1();

    Ex1() {
        System.out.println("Ex1 constructor");
    }
}

abstract class Ex3 {
    static {
        System.out.println("static of 3rd abstract class");
    }
}

class Ex2 extends Ex1 {
    static {
        System.out.println("static of 2nd abstract class");
    }

    Ex2() {
        System.out.println("Ex1 constructor");
    }

    @Override
    public void fun1() {
        System.out.println("This is fun1");
    }
}

public class Abstract_Example {
    public static void main(String[] args) {
        System.out.println("Main is here");
        Ex2 obj = new Ex2();
        obj.fun1();
    }
}