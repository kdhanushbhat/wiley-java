package day8;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class nullcheck {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<Integer> ll = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        ll.add(5);
        ll.add(null);
        ll.add(5);
        st.push(null);
        st.push(6);
        st.push(null);
        st.push(1);
        st.push(null);
        String x = String.valueOf(st.peek());
        Integer y = st.pop();
        System.out.println(ll);
        System.out.println(st);
        System.out.println(x + " " + y);
    }
}
