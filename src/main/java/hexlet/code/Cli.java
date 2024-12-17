package hexlet.code;
import java.util.Scanner;

public class Cli {
    private final String name;

    public Cli(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        this.name = scanner.next();
        System.out.println("Hello, " + this.name + "!");
    }

    public String getName() {
        return name;
    }
}