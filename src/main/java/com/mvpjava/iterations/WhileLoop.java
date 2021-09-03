package com.mvpjava.iterations;

import java.util.*;
import java.util.function.Consumer;

import static java.util.List.*;

public class WhileLoop {
    private static final List <String> famousPeople ;

    static  {
        famousPeople = of("Napoleon", "William Shakespeare", "Aristotle", "Alexander the Great", "Charles Darwin");
    }

    public static void loop(){
        System.out.println("================== While loop");
        System.out.println("================== While loop ... Iterator");

        // Abstract iteration details of underlying Collection which could be a Map (via EntrySet), Set or List
        // and not invloved in buggish code with indexes etc ..
        Iterator<String> iterator = famousPeople.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // OR
        System.out.println("================== While loop ... List index counter");
        // have to manage the extra local variable, correct logic operator and local var incrementation
        // which are all potential sources of bugs as well as your aware that you are looping through a list
        // because your executing the .size and .get methods.
        // only useful if you really need the index

        int index = 0;
        while ( index < famousPeople.size()){
            System.out.println(famousPeople.get(index));
            index++;
        }
    }

}
