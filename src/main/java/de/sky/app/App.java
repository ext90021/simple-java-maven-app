package de.sky.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello DataHub!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
