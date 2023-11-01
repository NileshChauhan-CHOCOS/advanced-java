package org.chocos.advancedjava.main;


public abstract class ParentMain {
    static {
        for(int i = 0; i < 20; i++){
            System.out.println(i);
        }
    }
    public static void main(String [] args) {
        System.out.println("-------------- Parent class main method --------------");
    }
}