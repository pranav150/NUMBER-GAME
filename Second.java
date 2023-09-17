import java.util.Random;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        Random rand = new Random();
        int randNum = rand.nextInt(range) + min;
        System.out.println("Random Number: " + randNum);

        Scanner input = new Scanner(System.in);
        System.out.print("Guess the number between " + min + " and " + max + ": ");
        int guess = input.nextInt();

        if (guess == randNum) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else {
            System.out.println("Sorry, the correct number was " + randNum + ".");
        }
    }

    public static int getRandomNumber(int min, int max) {
        int range = max - min + 1;
        Random rand = new Random();
        int randNum = rand.nextInt(range) + min;
        return randNum;
    }
}

