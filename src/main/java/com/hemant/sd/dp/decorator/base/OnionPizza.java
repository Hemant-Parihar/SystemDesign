package com.hemant.sd.dp.decorator.base;

public class OnionPizza extends BasePizza {

    int cost;

    public OnionPizza() {
        super("Onion");
    }

    @Override
    public int getCost() {
        cost = 200;
        return cost;
    }
}
