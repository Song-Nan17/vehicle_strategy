package Service;

import model.*;

public class VehicleStrategy {

    public static void chooseVehicle(int costMoney) {
        Vehicle[] vehicles = {new Bus(), new Train(), new Car(), new Plane()};
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getCostMoney() <= costMoney) {
                System.out.println(vehicle.explain());
            }
        }
    }

}