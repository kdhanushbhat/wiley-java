package day11;
interface Example {
    void exmp(int a, int b);
}

class Ex2 {
    Ex2(int a, int b) {
        System.out.println("this is reference, sum: " + (a + b));
    }
}

public class methodreference {

    public void printer(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        // Example ex = methodreference::printer; //static type, classname::methodname
        methodreference mt = new methodreference(); // instance type, objectname::methodname
        Example ex = mt::printer; // constructor reference type, must be assigned to functional
        ex.exmp(5, 6);

        Example x = Ex2::new;
        x.exmp(5, 6);
    }
}
