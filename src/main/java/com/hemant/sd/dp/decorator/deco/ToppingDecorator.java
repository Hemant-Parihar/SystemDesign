package com.hemant.sd.dp.decorator.deco;

import com.hemant.sd.dp.decorator.base.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    public ToppingDecorator(String name) {
        super(name);
    }
}
