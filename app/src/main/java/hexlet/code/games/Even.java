package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Engine engine = new Engine();
        Engine.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int correctAnswers = 0;
        final var countOfGamesToWin = 3;
        final var maxValueOfNumber = 99;
        while (correctAnswers < countOfGamesToWin) { //Number of correct answers
            int number = random.nextInt(maxValueOfNumber) + 1;

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if ((number % 2 == 0 && answer.equals("yes")) || (number % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
                correctAnswers++;
            }
            else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (number % 2 == 0 ? "yes" : "no") + "'.");
                System.out.println("Let's try again, " + engine.getName() + "!");
                break;
            }
        }
        if (correctAnswers == countOfGamesToWin) {
            System.out.println("Congratulations, " + engine.getName() + "!");
        }
    }
}
