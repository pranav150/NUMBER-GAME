import java.util.Random;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println("Random Number: " + randomNumber);
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess a number between " + min + " and " + max + ": ");
            guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            }
        } while (guess != randomNumber);
        System.out.println("Congratulations! You guessed the number.");
    }
}
