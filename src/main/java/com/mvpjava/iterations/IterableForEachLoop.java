package com.mvpjava.iterations;

import java.util.List;

import static java.util.List.of;

// Debut in Java 8
public class IterableForEachLoop {
    private static final List<String> famousPaintings;

    static  {
        famousPaintings = of("Mona Lisa", "Girl with a Pearl", "The Birth of Venise", "Starry Night", "The Kiss");
    }

    public static void loop() {

        System.out.println("================== While loop ... Java 8 forEachRemaining - NO LOOP Necessary!!");
        // No while loop and no methods off the iterator to call. Love it! Same thing as List.forEach though
        famousPaintings.iterator().forEachRemaining((person) -> {
            System.out.println(person);
        });

        // Same but with Method Reference instead of lambda Consumer code
        System.out.println("================== While loop ... Java 8 forEachRemaining - NO LOOP Necessary!! + Method Reference");
        famousPaintings.iterator().forEachRemaining(System.out::println);
    }
}
