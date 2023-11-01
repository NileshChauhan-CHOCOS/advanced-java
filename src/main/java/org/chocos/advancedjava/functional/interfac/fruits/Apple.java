package org.chocos.advancedjava.functional.interfac.fruits;

public final class Apple extends Fruit{
    private static final FruitType FRUIT_TYPE = FruitType.APPLE;

    public Apple(String color, double weight){
        this.color=color;
        this.weight=weight;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
    public String type(){
        return FRUIT_TYPE.toString();
    }
}
