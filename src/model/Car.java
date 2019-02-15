package model;

public class Car extends Vehicle {
    public Car() {
        super("自驾", 500);
    }

    @Override
    public String explain() {
        return "可以自驾";
    }
}
