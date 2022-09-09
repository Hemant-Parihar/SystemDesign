package com.hemant.sd.dp.strategyDesign.with.child;

import com.hemant.sd.dp.strategyDesign.with.Vehicle;
import com.hemant.sd.dp.strategyDesign.with.strategy.NormalDrive;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
