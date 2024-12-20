package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Engine engine = new Engine();
        Engine.greet();

        System.out.println("What is the result of the expression?");
        int correctAnswers = 0;

        while (correctAnswers < 3) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            char operator = randomOperator();

            System.out.println("Question: " + number1 + operator + number2 + " ?");
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            int correctAnswer = calculate(number1, number2, operator);

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

    public static char randomOperator() {
        char[] operators = {'+', '-', '*'};
        Random random = new Random();
        return operators[random.nextInt(operators.length)];
    }

    public static int calculate(int number1, int number2, char operator) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                return 0;
        }
    }
}
