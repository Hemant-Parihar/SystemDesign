package com.hemant.sd.dp.strategyDesign.with.child;

import com.hemant.sd.dp.strategyDesign.with.strategy.SportsDrive;
import com.hemant.sd.dp.strategyDesign.with.Vehicle;

public class SportVehicle extends Vehicle {

    public SportVehicle() {
        super(new SportsDrive());
    }
}
