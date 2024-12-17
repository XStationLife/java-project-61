package hexlet.code;
import java.util.Random;
import java.util.Scanner;


public class Even {
    public static void even(Scanner scanner) {
        Cli cli = new Cli(scanner);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        int correctAnswers = 0;
        scanner.nextLine();

        while (correctAnswers < 3) { //Number of correct answers
            int number = random.nextInt(99) + 1;
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if ((number % 2 == 0 && answer.equals("yes")) || (number % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
                correctAnswers++;
            }
            else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (number % 2 == 0 ? "yes" : "no") + "'.");
                System.out.println("Let's try again, " + cli.getName());
            }
        }
        System.out.println("Congratulations, " + cli.getName() + "!");
        scanner.close();
    }
}
