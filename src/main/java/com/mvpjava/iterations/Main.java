package com.mvpjava.iterations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args)  {
        System.out.println("Version 1.1");
        WhileLoop.loop();
        ForLoopClassic.loop();
        ForEachLoop.loop();
        StreamsForEachLoop.loop();
        IterableForEachLoop.loop();
    }
}
