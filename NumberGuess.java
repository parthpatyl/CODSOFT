import java.util.Scanner;
public class NumberGuess {
public static void play() {
    Scanner sc = new Scanner(System.in);
    int secretNumber = 1 + (int) (Math.random() * 10);
    int maxGuess = 3;
    int attempts;
    int guess;
    System.out.println("Welcome to Number Guessing Game");
    System.out.println("You have to guess numbers between 1 and 10 in 3 attempts");
    for (attempts = 0; attempts < maxGuess; attempts++) {
        System.out.println("Attempt " + (attempts + 1) + " Enter your guess:");
        guess = sc.nextInt();

        if (secretNumber == guess) {
            System.out.println("Congratulations! You guessed correctly!");
            break;
        } else if (secretNumber > guess && attempts != maxGuess - 1) {
            System.out.println("The secret number is greater than your guess.");
        } else if (secretNumber < guess && attempts != maxGuess - 1) {
            System.out.println("The secret number is less than your guess.");
        }
    }
    if (attempts == maxGuess) {
        System.out.println("You have exhausted all " + maxGuess + " attempts.");
        System.out.println("The secret number was " + secretNumber);
    }
    sc.close();
}
public static void main() {
    play();
}
}