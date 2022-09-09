package com.hemant.sd.dp.strategyDesign.with.child;

import com.hemant.sd.dp.strategyDesign.with.Vehicle;
import com.hemant.sd.dp.strategyDesign.with.strategy.SportsDrive;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportsDrive());
    }
}
