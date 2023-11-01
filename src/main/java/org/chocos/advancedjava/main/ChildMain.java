package org.chocos.advancedjava.main;

public abstract class ChildMain extends ParentMain {
    public static void main(String[] args){
        System.out.println("-------------- Child class main method --------------");
        ParentMain.main(args);
    }
}
