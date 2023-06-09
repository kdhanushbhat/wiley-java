package day7;

public class Car extends Vehicles {
    public Car() {
        System.out.println("new created");
    }

    @Override
    public String toString() {
        return "This is a car object";
    }
}
