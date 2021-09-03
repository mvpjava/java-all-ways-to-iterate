package com.mvpjava.iterations;

import java.util.Iterator;
import java.util.List;

import static java.util.List.of;

// Debut in Java 5
public class ForEachLoop {
    private static final List<String> famousDesserts;

    static  {
        famousDesserts = of("Tiramisu", "Gulab Jamun", "Smores" , "Churros", "Lamingtons", "Pasteis de Nata");
    }

    public static void loop() {
        System.out.println("================== ForEach Loop ...");
        for (String dessert: famousDesserts){
            System.out.println(dessert);
        }

        System.out.println("================== ForEach Loop ...  with Iterable Interface /Lambda Consumer - Method Reference");
        famousDesserts.forEach(System.out::println);
    }
}
