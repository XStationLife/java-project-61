package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Engine engine = new Engine();
        Engine.greet();

        System.out.println("Find the greatest common divisor of given numbers.");
        int correctAnswers = 0;

        while (correctAnswers < 3) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);

            System.out.println("Question: " + number1 + " " + number2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            int correctAnswer = findGCD(number1, number2);



            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctAnswers++;
            }
            else {
                System.out.println("'" + userAnswer + "'" + "is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + engine.getName() + "!");
                break;
            }
        }
        if (correctAnswers == 3) {
            System.out.println("Congratulations, " + engine.getName() + "!");
        }
    }

    public static int findGCD(int number1, int number2) {
        int gcd = 1;

        if (number1 == 0 || number2 == 0) {
            return gcd;
        }
        for (int i = 1; i <= number1; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
