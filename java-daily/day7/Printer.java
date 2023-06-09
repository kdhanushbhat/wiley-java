package day7;

public class Printer<T> {
    T var;

    public Printer(T var) {
        super();
        this.var = var;
    }

    public void print() {
        System.out.println(var);
    }
}
