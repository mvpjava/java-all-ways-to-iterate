package com.mvpjava.iterations;

import java.util.Iterator;
import java.util.List;

import static java.util.List.of;

public class ForLoopClassic {
    private static final List<String> famousCars;

    static  {
        famousCars = of("Batmobile", "James Bond 1964 Aston Martin DB5" +
                        "DeLorean DMC-12 Time Machine", "1968 Ford Mustang Fastback", "1977 Pontiac Firebird Trans AM");
    }

    public static void loop() {
        System.out.println("================== For loop Classic ... with index");
        for (int i=0 ; i < famousCars.size() ; i++){
            System.out.println(famousCars.get(i));
        }

        System.out.println("================== For loop Classic ... with Enumeration .. TOO Weird!");

        Iterator<String> iterator = famousCars.iterator();
        for (;iterator.hasNext();){
            System.out.println(iterator.next());
        }

    }
}
