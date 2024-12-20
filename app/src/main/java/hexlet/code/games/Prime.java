package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Engine engine = new Engine();
        Engine.greet();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int correctAnswers = 0;
        final var countOfGamesToWin = 3;
        final var maxValueOfNumber = 100;
        while (correctAnswers < countOfGamesToWin) {
            int number = random.nextInt(maxValueOfNumber);

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            boolean correctAnswer = isPrime(number);

            if ((isPrime(number) && userAnswer.equals("yes")) || (!isPrime(number) && userAnswer.equals("no"))) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "'" + "is wrong answer ;(.");
                System.out.println("Correct answer was '" + (correctAnswer ? "yes" : "no") + "'.");

                System.out.println("Let's try again, " + engine.getName() + "!");
                break;
            }
        }
        if (correctAnswers == countOfGamesToWin) {
            System.out.println("Congratulations, " + engine.getName() + "!");
        }

    }
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int k = 2; k <= Math.sqrt(number); k++) {
            if (number % k == 0) {
                return false;
            }
        }
        return true;
    }
}
