package day10;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class CustomList1<T> extends ArrayList<T> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public boolean add(T val) {
        if (this.contains(val)) {
            return false;
        } else {
            super.add(val);
            return true;
        }
    }
}

public class ex2 {
    public static void main(String[] args) {
        List<String> x = new CustomList1<String>();
        System.out.println(x.add("awd"));
        System.out.println(x.add("tte"));
        System.out.println(x.add("awd"));

        System.out.println(x);
    }
}
