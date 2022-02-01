import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args)  {
        System.out.println("Welcome to HANGMAN!");
        System.out.println("+--+");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println(" ===");
        Scanner scanner = null;

        //The below line utilizes a try/catch to handle the program accepting the text file.
        try {
            scanner = new Scanner(new File("C:\\Users\\stevc\\OneDrive\\Documents\\hangman.txt"));
        }
        catch(FileNotFoundException e) {
            System.out.println("The requested file was not found");//throwing the error to the user
            System.exit(0);//assigning a generic error status code for your reference.
        }
        Scanner keyboard = new Scanner(System.in);

        List<String> words = new ArrayList<>();


            while (scanner.hasNext()) {

                words.add(scanner.nextLine());
            }
             System.out.println(words);
            Random ran = new Random();

            String word = words.get(ran.nextInt(words.size()));

            System.out.println(word);

            List<Character> guesses = new ArrayList<>();

        getGuesses(keyboard, word, guesses);


    }

    private static void getGuesses(Scanner keyboard, String word, List<Character> guesses) {
        printWordState(word, guesses);
        System.out.println("Guess a letter.");
        String letterInput = keyboard.nextLine();
        guesses.add(letterInput.charAt(0));

        printWordState(word, guesses);
    }

    private static void printWordState(String word, List<Character> guesses) {
        for (int i = 0; i < word.length(); i++) {
            if (guesses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
            } else {
                System.out.print("-");
            }

        }
        System.out.println();
    }
}

