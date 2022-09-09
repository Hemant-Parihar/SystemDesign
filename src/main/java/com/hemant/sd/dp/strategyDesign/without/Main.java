package com.hemant.sd.dp.strategyDesign.without;

import com.hemant.sd.dp.strategyDesign.without.child.OffRoadVehicle;
import com.hemant.sd.dp.strategyDesign.without.child.PassengerVehicle;
import com.hemant.sd.dp.strategyDesign.without.child.SportVehicle;

public class Main {
    public static void main(String[] args) {
        // At this point, the code in OffRoadVehicle and SportVehicle is repetitive.
        Vehicle vehicle = new Vehicle();
        SportVehicle sportVehicle = new SportVehicle();
        PassengerVehicle passengerVehicle = new PassengerVehicle();
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();

        vehicle.drive();
        sportVehicle.drive();
        passengerVehicle.drive();
        offRoadVehicle.drive();

        // How we can remove the extra code that we are writing?
        // The Problems is when siblings having duplicate code.
        // S1 & S3 may have duplicate code. S2 and S4 may have duplicate code.
        // We observe that drive is a capability.
    }
}
