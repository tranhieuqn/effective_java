package com.hieutran.items.item2;

import static com.hieutran.items.item2.NyPizza.Size.SMALL;
import static com.hieutran.items.item2.Pizza.Topping.MUSHROOM;
import static com.hieutran.items.item2.Pizza.Topping.ONION;

public class Main {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(SMALL)
                .addTopping(MUSHROOM)
                .addTopping(ONION)
//                .addTopping(MUSHROOM)

                .build();
        System.out.println(nyPizza.toppings);
    }
}
