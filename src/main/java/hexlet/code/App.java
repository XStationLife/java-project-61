package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);

        switch (choice) {
            case "1":
                Cli cli = new Cli(scanner);
                break;
            case "2":
                Even.even(scanner);
                break;
            case "3":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
