package com.hemant.sd.dp.decorator.deco;

import com.hemant.sd.dp.decorator.base.BasePizza;

public class VeggieTopping extends ToppingDecorator{
    BasePizza basePizza;

    public VeggieTopping(BasePizza bp) {
        super(bp.BaseType);
        this.basePizza = bp;
        this.basePizza.toppings.addAll(bp.toppings);
        this.basePizza.toppings.add("Veggie");
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + 20;
    }
}
