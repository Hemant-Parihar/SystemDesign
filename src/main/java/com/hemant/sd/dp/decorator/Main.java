package com.hemant.sd.dp.decorator;

import com.hemant.sd.dp.decorator.base.BasePizza;
import com.hemant.sd.dp.decorator.base.DelightPizza;
import com.hemant.sd.dp.decorator.base.OnionPizza;
import com.hemant.sd.dp.decorator.deco.CheeseTopping;
import com.hemant.sd.dp.decorator.deco.VeggieTopping;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new OnionPizza();
        System.out.println(basePizza.BaseType + ":" + basePizza.getCost());
        System.out.println(basePizza.toppings);

        BasePizza basePizza1 = new CheeseTopping(new OnionPizza());
        System.out.println(basePizza1.BaseType + ": " + basePizza1.getCost());
        System.out.println(basePizza1.toppings);

        BasePizza basePizza2 = new VeggieTopping(new CheeseTopping(new DelightPizza()));
        System.out.println(basePizza2.BaseType + " : " + basePizza2.getCost());
        System.out.println(basePizza2.toppings);
    }
}
