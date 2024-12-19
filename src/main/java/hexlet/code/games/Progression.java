package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Engine engine = new Engine();
        Engine.greet();

        System.out.println("What number is missing in the progression?");
        int correctAnswers = 0;

        while (correctAnswers < 3) {
            int firstNumber = random.nextInt(0, 20);
            int step = random.nextInt(1, 5);
            int countOfNumbers = random.nextInt(3, 10);
            int[] progression = getProgression(firstNumber, step, countOfNumbers);
            int indexOfHiddenNumber = random.nextInt(progression.length);
            int hiddenNum = progression[indexOfHiddenNumber];

            System.out.print("Question: ");
            for (int i = 0; i < countOfNumbers; i++) {
                if (i == indexOfHiddenNumber) {
                    System.out.print(".. ");
                } else {
                    System.out.print(progression[i] + " ");
                }
            } System.out.print("");
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == hiddenNum) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "'" + "is wrong answer ;(. Correct answer was '" + hiddenNum + "'.");
                System.out.println("Let's try again, " + engine.getName() + "!");
                break;
            }
        }
        if (correctAnswers == 3) {
            System.out.println("Congratulations, " + engine.getName() + "!");
        }
    }

    public static int[] getProgression(int firstNumber, int step, int countOfNumbers) {
        int[] progression = new int[countOfNumbers];

        for (int i = 0; i < countOfNumbers; i++) {
            progression[i] = firstNumber + i * step;
        }
        return progression;
    }
}