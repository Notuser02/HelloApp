/**
 * HelloApp.java - A simple Java application that displays greetings.
 * 
 * UC 1: Display "Hello World" - The application displays "Hello World" to the console when executed.
 * UC 2: Display User Name - The application accepts a user's name as a command-line argument 
 * and displays a personalized greeting.
 *
 * Key Java Concepts Used:
 * 1. Class Declaration - Defines a blueprint for objects
 * 2. Main Method - Entry point for program execution
 * 3. Static Keyword - Method belongs to the class, not instances
 * 4. String Argument Array - Command-line arguments parameter
 * 5. System.out.println() - Standard output stream for printing
 * 6. Command-line Arguments: Accessing user input via args[] parameter
 * 7. String Concatenation: Combining strings using the + operator
 * 
 * @author Siddhanth
 * @version 1.0
 */
public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Get the name from command-line argument
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}