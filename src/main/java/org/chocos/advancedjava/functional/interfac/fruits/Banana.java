package org.chocos.advancedjava.functional.interfac.fruits;

public final class Banana extends Fruit{
    private static final FruitType FRUIT_TYPE = FruitType.BANANA;

    public Banana(String color, Double weight) {
        this.color = color;
        this.weight=weight;
    }

    public Banana setColor(String color) {
        this.color = color;
        return this;
    }

    public Banana setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }
    public static String type(){
        return FRUIT_TYPE.toString();
    }
}
