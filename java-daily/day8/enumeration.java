package day8;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class enumeration {
    public static void main(String[] args) {
        Vector<Integer> vc = new Vector<>();
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(4);
        ll.add(1);
        ListIterator<Integer> li = ll.listIterator();
        vc.addElement(5);
        vc.addElement(4);
        vc.addElement(9);
        // ll.add(6);
        System.out.println(li.next());
        while (li.hasNext()) {
            int x = li.next();
            System.out.println("--" + x);
            if (x == 4)
                li.set(6);
        }
        System.out.println(ll);

    }
}
