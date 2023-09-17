import java.util.Random;

public class First {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        Random rand = new Random();
        int randNum = rand.nextInt(range) + min;
        System.out.println("Random Number: " + randNum);
    }

    public static int getRandomNumber(int min, int max) {
        int range = max - min + 1;
        Random rand = new Random();
        int randNum = rand.nextInt(range) + min;
        return randNum;
    }
}

