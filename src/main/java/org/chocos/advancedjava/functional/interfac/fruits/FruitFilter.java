package org.chocos.advancedjava.functional.interfac.fruits;

import java.util.List;
@FunctionalInterface
public interface  FruitFilter<T> {
    List<T> filter(List<T> fruitList);
}
