package com.hemant.sd.dp.strategyDesign.with;

import com.hemant.sd.dp.strategyDesign.with.child.PassengerVehicle;
import com.hemant.sd.dp.strategyDesign.with.child.SportVehicle;
import com.hemant.sd.dp.strategyDesign.with.strategy.NormalDrive;

public class Main {
    public static void main(String[] args) {
        // Here we are using drive as capability and each vehicle can choose what drive capability they want.
        // The difference between with or without is. Here each vehicle can choose from the avaiable drive strategy.
        // Earlier each vehicle is writing their own drive strategy or have base strategy.
        // There is a risk of two vehicle writing same strategy causing duplicate code.

        Vehicle vehicle = new Vehicle(new NormalDrive());
        SportVehicle sportVehicle = new SportVehicle();
        PassengerVehicle passengerVehicle = new PassengerVehicle();

        vehicle.drive();
        sportVehicle.drive();
        passengerVehicle.drive();

        // Also, If a vehicle wants to have new strategy, then they can first implement this and have it.
        // When they implement this strategy, they also make it available for others if they want to use this strategy instead of writing that same strategy.
    }
}
