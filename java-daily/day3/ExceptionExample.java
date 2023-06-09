package day3;

import java.io.*;

class NewException extends Exception {
    NewException(String message) {
        System.out.println(message);
    }

    @Override
    public String getMessage() {
        return "This string is invalid";
    }

    public String getTracing(StackTraceElement[] e) {
        return "Exception at: " + e[0].getLineNumber();
    }
}

public class ExceptionExample {
    public static void main(String[] args) throws NewException {
        System.out.println("hello");
        int a[] = { 1, 2, 3, 4, 5 };
        try {
            System.out.println(a[1]);
            throw new NewException("Exception of kind unkown");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        } catch (NewException e) {
            System.out.println(e.getTracing(e.getStackTrace()));

        }
        System.out.println("hello");
    }
}
