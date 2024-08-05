import java.util.Scanner;


public class Hangman {
    public static void main(String[] args) {
        String word = "JAVA";
        StringBuilder guessedWord = new StringBuilder("____");
        Scanner scanner = new Scanner(System.in);
        int attempts = 6;

        while (attempts > 0 && guessedWord.indexOf("_") != -1) {
            System.out.println("Word: " + guessedWord);
            System.out.println("Attempts left: " + attempts);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);

            boolean correct = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedWord.setCharAt(i, guess);
                    correct = true;
                }
            }

            if (!correct) {
                attempts--;
            }
        }

        if (guessedWord.indexOf("_") == -1) {
            System.out.println("Congratulations! You've guessed the word: " + word);
        } else {
            System.out.println("Game over! The word was: " + word);
        }
    }
}
