package day3;

import java.util.ArrayList;

class StringNotFound extends RuntimeException {
    public StringNotFound(String message) {
        super(message);
    }
}

public class Exception2 {
    public static void main(String[] args) {
        ArrayList<String> stds = new ArrayList<>();
        stds.add("jbh");
        stds.add("jnw");
        stds.add("oijq");
        if (!stds.contains("iuq")) {
            try {
                throw new StringNotFound("weird things");
            } catch (StringNotFound e) {
                e.printStackTrace();
            }
        }
        System.out.println("ibwowadoinda");
    }
}
