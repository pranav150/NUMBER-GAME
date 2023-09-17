import java.util.Random;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int maxAttempts = 5;
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println("Random Number: " + randomNumber);
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;
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
        } else {
            System.out.println("Sorry! You have exhausted all your attempts.");
            System.out.println("The correct number was " + randomNumber);
        }
    }
}

