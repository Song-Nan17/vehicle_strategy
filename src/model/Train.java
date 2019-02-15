package model;

public class Train extends Vehicle {
    public Train() {
        super("火车", 500);
    }

    @Override
    public String explain() {
        return "可以坐火车";
    }
}
