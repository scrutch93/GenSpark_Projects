import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\stevc\\OneDrive\\Documents\\hangman.txt"));

        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
            words.add(scanner.nextLine());
        }
        Random ran = new Random();

        String word = words.get(ran.nextInt(words.size()));

        System.out.println(word);

        List<Character> guesses = new ArrayList<>();

        printWrd(word, guesses);
    }

    private static void printWrd(String word, List<Character> guesses) {
        for (int i = 0; i < word.length(); i++) {
            try {
                if (guesses.contains(word.charAt(i))) {
                } else {
                    System.out.print("-");
                }
            } catch () {
                System.out.println();
            }


        }
    }
}