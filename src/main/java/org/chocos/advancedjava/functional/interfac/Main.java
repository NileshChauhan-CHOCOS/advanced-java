package org.chocos.advancedjava.functional.interfac;

import org.chocos.advancedjava.functional.interfac.fruits.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
        if(inventory != null && p != null){
            return inventory.stream()
                    .filter(p::test)
                    .toList();
        }
        return new ArrayList<>();
    }
    public static void main(String[] args){
        List<Apple> apples = new ArrayList<>(Arrays.asList(
                new Apple("Green", 89.90),
                new Apple("Red", 904.84),
                new Apple("Green", 874.03),
                new Apple("Red", 486.89),
                new Apple("Green", 100.7),
                new Apple("Green", 84.859),
                new Apple("Red", 89.95),
                new Apple("Red", 857.345),
                new Apple("Green", 120.84)));

       /* apples = apples.stream()
                .filter(Apple::isHeavyApple)
                .toList();
        for (Apple apple : apples) {
            System.out.println(apple);
        }*/
        apples = filterApples(apples, null);
        apples = filterApples(apples, apple -> apple.getWeight() >= 145);
        apples.sort(Comparator.comparing(Apple::getWeight));
        for (Apple apple : apples) {
            System.out.println(apple.toString());
        }
    }
}
