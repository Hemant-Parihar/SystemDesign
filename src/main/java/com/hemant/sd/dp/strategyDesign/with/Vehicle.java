package com.hemant.sd.dp.strategyDesign.with;

import com.hemant.sd.dp.strategyDesign.with.strategy.Drive;

public class Vehicle {
    private Drive obj;

    public Vehicle(Drive ob) {
        this.obj = ob;
    }

    public void drive() {
        obj.drive();
    }
}
