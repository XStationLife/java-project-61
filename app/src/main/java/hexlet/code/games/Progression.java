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
        final var maxOfNumber = 20;
        final var maxStep = 5;
        final var maxCountOfNumbers = 10;
        final var minCountOfNumbers = 3;

        System.out.println("What number is missing in the progression?");
        int correctAnswers = 0;
        final var countOfGamesToWin = 3;
        while (correctAnswers < countOfGamesToWin) {
            int firstNumber = random.nextInt(0, maxOfNumber);
            int step = random.nextInt(1, maxStep);
            int countOfNumbers = random.nextInt(minCountOfNumbers, maxCountOfNumbers);
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
        if (correctAnswers == countOfGamesToWin) {
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