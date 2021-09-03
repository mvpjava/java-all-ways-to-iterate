package com.mvpjava.iterations;

import java.util.List;

import static java.util.List.of;

// Debut in Java 8
public class StreamsForEachLoop {
    private static final List<String> famousBooks;

    static  {
        famousBooks = of("War and Peace", "Moby Dick", "The Great Gatsby" , "One Hundred Years", "Ulysses", "In Search of Lost Time");
    }

    public static void loop() {
        System.out.println("================== Streams.ForEach Loop ...  Method Reference - filtered and sorted");
        famousBooks.stream().filter( book -> book.length() > 10 ).sorted().forEach(System.out::println);

    }
}
