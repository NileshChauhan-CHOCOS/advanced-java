package org.chocos.advancedjava.functional.interfac.fruits;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger logger =  LoggerFactory.getLogger(Main.class);
    public static void main(String[] args){
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("Green", 24D));
        apples.add(new Apple("Red", 56d));
        apples.add(new Apple("yellow", 12d));
        apples.add(new Apple("Yellow",78d));
        apples.add(new Apple("Red", 10d));
        apples.add(new Apple("Red", 9d));
        apples = Fruit.filter(apples, (List<Apple> ls)->
                ls.stream()
                    .filter((Apple apple)->apple.weight > 12)
                    .toList()
        );
        for (Apple apple : apples) logger.info(apple.toString());
        logger.info("+++++++++++++++++++++++");
        List<Mango> mangos = new ArrayList<>();
        mangos.add(Mango.getInstance("Yellow", 63D));
        mangos.add(Mango.getInstance("Yellow", 46D));
        mangos.add(Mango.getInstance("Green", 34D));
        mangos.add(Mango.getInstance("Green", 53D));
        mangos.add(Mango.getInstance("Green", 23D));
        mangos.add(Mango.getInstance("Green", 45D));
        mangos = Fruit.filter(mangos, (List<Mango> ms)-> ms.stream()
                .filter((Mango m) -> m.color.equalsIgnoreCase("Green"))
                .toList());
        for (Mango mango : mangos)  {
            System.out.println(mango.toString());
            logger.info(mango.toString());
        }
    }
}
