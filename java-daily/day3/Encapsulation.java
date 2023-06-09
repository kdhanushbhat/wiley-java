package day3;

import java.lang.String;

class Employee {
    private String name;

    void setName(String name) {
        System.out.println("adinaw");
        this.name = name;
    }

    String getName() {
        return name;
    }

}

public class Encapsulation {

    public static void main(String[] args) {
        System.out.println("adiabwd");
        Employee obj = new Employee();
        obj.setName("awud");
        System.out.println(obj.getName());

    }
}
