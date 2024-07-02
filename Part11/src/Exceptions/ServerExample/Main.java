package Exceptions.ServerExample;

public class Main {
    public static void main(String[] args) {
        FileServer server = new TextServer();

        try {
            server.save("file1.txt", "Hello, world!");
            server.save("file2.txt", "Java programming is fun.");

            // Load and print files
            System.out.println(server.load("file1.txt")); // Output: Hello, world!
            System.out.println(server.load("file2.txt")); // Output: Java programming is fun.

            // Attempt to load a non-existent file
            System.out.println(server.load("file3.txt")); // Output: null
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
