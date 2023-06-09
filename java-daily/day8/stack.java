package day8;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(6);
        st.push(1);
        st.push(6);
        st.push(6);
        st.push(6);
        st.push(6);
        st.push(6);
        st.push(1);
        st.push(9);

        int x = st.peek();
        System.out.println(x + "  ");
        System.out.println(st.empty());
        int y = st.search(9);
        System.out.println(y);
    }
}
