package org.chocos.advancedjava.functional.interfac.generic;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassGenerics {
    public static void iterate(List<Class<?>> list){
        Assert.notNull(list, "list cannot be null");
        list.add(("Nilesh").getClass());// String
        //list.add((Addressable.class));  // Addressable
    }
    public static boolean support(Class<?> str){
        Assert.notNull(str, "Object cannot be null");
        if(str.isPrimitive()){
           return true;
        }
        return false;
    }
    public static void main(String[] args){
        Class<?> str = String.class;
        System.out.println(str);
        str = List.class;
        System.out.println(str);
        System.out.println(support(str));
        str = int.class;
        System.out.println(support(str));

        List<? extends Number> lis = new ArrayList<>(Arrays.asList(23, 34, 89.590, 589, 34, 47));
        Number a = lis.get(0);
        System.out.println(a.getClass());
        a = lis.get(2);
        List<? super Integer> arr=new ArrayList<>();
        arr.add(89);
        Number s = 84.84;;
        System.out.println(a.getClass());
    }

}
