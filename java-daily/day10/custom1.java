package day10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class CustomList<T> extends ArrayList<T> {
    @Override
    public boolean add(T val) {
        if (this.contains(val)) {
            return false;
        } else {

            return super.add(val);
        }
    }

    @Override
    public boolean contains(Object o) {

        return super.contains(o);

    }
}

class salaryComparator implements Comparator<GenStudent> {
    @Override
    public int compare(GenStudent g1, GenStudent g2) {
        return g1.salary - g2.salary;
    }
}

class GenStudent implements Comparable<GenStudent> {
    String name;
    int id;
    int salary;

    GenStudent(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "GeniusStudent [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GenStudent other = (GenStudent) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

    @Override
    public int compareTo(GenStudent g) {
        if (this.id == g.id) {
            return 0;
        } else if (this.id < g.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

public class custom1 {
    public static void main(String[] args) {
        List<GenStudent> l = new ArrayList<>();
        GenStudent g1 = new GenStudent("mahesh", 2, 56000);
        GenStudent g2 = new GenStudent("mahesh", 5, 60000);
        GenStudent g3 = new GenStudent("ganesh", 1, 24032);
        l.add(g1);
        l.add(g2);
        l.add(g3);
        System.out.println(l);
        Collections.sort(l, new salaryComparator());
        System.out.println(l);
    }
}
