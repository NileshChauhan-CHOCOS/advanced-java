package org.chocos.advancedjava.functional.interfac.fruits;


public class Mango extends Fruit{
    private static final FruitType FRUIT_TYPE = FruitType.MANGO;
    private static Mango instance = null;

    private Mango(String color, Double weight){
        this.color = color;
        this.weight = weight;
    }
    public static Mango getInstance(String color, Double weight){
        if(instance == null){
            instance = new Mango(color, weight);
        }
        return instance;
    }
    public String getColor() {
        return color;
    }
    public Mango setColor(String color) {
        this.color = color;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public Mango setWeight(Double weight) {
        this.weight = weight;
        return this;
    }
    public static String type(){
        return FRUIT_TYPE.toString();
    }

    @Override
    public String toString() {
        return "Mango{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
