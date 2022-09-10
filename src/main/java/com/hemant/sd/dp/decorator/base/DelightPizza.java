package com.hemant.sd.dp.decorator.base;

public class DelightPizza extends BasePizza{

    int cost;

    public DelightPizza() {
        super("DelightPizza");
    }

    @Override
    public int getCost() {
        cost = 400;
        return cost;
    }
}
