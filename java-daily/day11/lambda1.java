package day11;
import java.util.HashMap;
import java.util.function.Function;

public class lambda1 {
    private static HashMap<Integer, String> emp = new HashMap<>();

    static String add(String name, int id) {
        if (emp.containsKey(id))
            return "ID already Exists";
        else {
            return emp.put(id, name);
        }
    }

    public static void main(String[] args) {
        Function<Integer, String> get = (Integer id) -> {
            if (emp.containsKey(id))
                return emp.get(id);
            else
                return "Invalid ID";
        };
        add("dhanush", 24);
        add("sagar", 53);
        add("prashanth", 40);
        add("nandana", 33);
        System.out.println(get.apply(53));
        System.out.println(emp);

    }
}
