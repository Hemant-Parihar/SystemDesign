package com.hemant.sd.dp.decorator.base;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePizza {
    public String BaseType;
    public List<String> toppings = new ArrayList<>();
    public abstract int getCost();

    public BasePizza(String name) {
        this.BaseType = name;
    }
}
