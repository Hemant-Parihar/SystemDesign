package com.hemant.sd.dp.decorator.deco;

import com.hemant.sd.dp.decorator.base.BasePizza;

public class CheeseTopping extends ToppingDecorator{

    BasePizza basePizza;
    public CheeseTopping(BasePizza bp) {
        super(bp.BaseType);
        this.basePizza = bp;
        this.basePizza.toppings.addAll(bp.toppings);
        this.basePizza.toppings.add("Cheese");
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + 10;
    }
}
