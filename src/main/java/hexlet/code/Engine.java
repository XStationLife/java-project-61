package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static String name;

    public static String greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public String getName() {
        return name;
    }
}

