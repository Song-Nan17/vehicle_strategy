package model;

public class Bus extends Vehicle {
    public Bus() {
        super("大巴车", 300);
    }

    @Override
    public String explain() {
        return "可以坐大巴车";
    }
}
