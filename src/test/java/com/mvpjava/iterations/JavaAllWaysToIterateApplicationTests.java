package com.mvpjava.iterations;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JavaAllWaysToIterateApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testForEachLoop() {
        //  capture the output that is printed to System.out (the console) by method (ForEachLoop.loop()),
        //  redirecting it to a ByteArrayOutputStream instead of the console, so it can be read as a string
        // and compared to expected output in test.

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the loop method
        ForEachLoop.loop();

        // Reset System.out to its original state (the console)
        //After this line, any calls to System.out.print or System.out.println will once again print to the console.
        System.setOut(System.out);

        // Get the captured output
        String output = outputStream.toString().trim();

        // Define the expected output
        String expectedOutput = "================== ForEach Loop ...\n" +
                "Tiramisu\n" +
                "Gulab Jamun\n" +
                "Smores\n" +
                "Churros\n" +
                "Lamingtons\n" +
                "Pasteis de Nata\n" +
                "================== ForEach Loop ...  with Iterable Interface /Lambda Consumer - Method Reference\n" +
                "Tiramisu\n" +
                "Gulab Jamun\n" +
                "Smores\n" +
                "Churros\n" +
                "Lamingtons\n" +
                "Pasteis de Nata";

        // Assert that the output matches the expected output
        assertEquals(expectedOutput, output);
    }
}
