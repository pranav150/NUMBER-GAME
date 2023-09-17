import java.util.Random;
import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int maxAttempts = 5;
        boolean playAgain = true;
        int totalAttempts = 0;
        int roundsWon = 0;
        while (playAgain) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.println("Random Number: " + randomNumber);
            int attempts = 0;
            int guess;
            do {
                System.out.print("Guess a number between " + min + " and " + max + ": ");
                guess = scanner.nextInt();
                attempts++;
                if (guess > randomNumber) {
                    System.out.println("Too high.");
                } else if (guess < randomNumber) {
                    System.out.println("Too low.");
                }
            } while (guess != randomNumber && attempts < maxAttempts);
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number.");
                roundsWon++;
            } else {
                System.out.println("Sorry! You have exhausted all your attempts.");
                System.out.println("The correct number was " + randomNumber);
            }
            totalAttempts += attempts;
            System.out.print("Do you want to play again? (y/n): ");
            String playAgainString = scanner.next();
            if (!playAgainString.equalsIgnoreCase("y")) {
                playAgain = false;
            }
        }
        double averageAttemptsPerRound = (double) totalAttempts / roundsWon;
        System.out.println("Your score is " + roundsWon + " rounds won with an average of " + averageAttemptsPerRound + " attempts per round.");
    }
}

