package day5;

import java.io.Console;

public class console {

    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("Console unavailable");
        }
        String name = console.readLine("What is ur name:");
        char[] pass = console.readPassword("Enter password");

        console.printf("you name is %s", name);
        console.printf("you password is %s", pass);
    }
}
