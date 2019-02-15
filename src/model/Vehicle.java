package model;

public abstract class Vehicle {
    private String type;
    private int costMoney;

    public Vehicle(String type, int costMoney) {
        this.type = type;
        this.costMoney = costMoney;
    }

    public abstract String explain();

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCostMoney() {
        return this.costMoney;
    }

    public void setCostMoney(int costMoney) {
        this.costMoney = costMoney;
    }
}
