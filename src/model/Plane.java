package model;

public class Plane extends Vehicle {
    public Plane() {
        super("飞机", 1000);
    }

    @Override
    public String explain() {
        return "可以坐飞机";
    }
}
