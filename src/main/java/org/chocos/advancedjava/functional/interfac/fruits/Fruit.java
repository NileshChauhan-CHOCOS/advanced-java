package org.chocos.advancedjava.functional.interfac.fruits;

import org.springframework.util.Assert;

import java.util.List;

public abstract class Fruit {
    String color;
    Double weight;
    public static <T> List<T> filter(List<T> list, FruitFilter<T> fruitFilter){
        Assert.notNull(list, "List cannot be null");
        Assert.notNull(fruitFilter, "Fruit Filter cannot be Null");
        return fruitFilter.filter(list);
    }
}
