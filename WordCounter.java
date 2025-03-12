import java.util.Scanner;

public class WordCounter {

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine(); // Read input
        return sentence.trim(); // Remove leading/trailing spaces
    }

    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        if (sentence.isEmpty()) {
            return 0;
        }
        // Split sentence based on spaces
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    // Main method to control program flow
    public static void main(String[] args) {
        String sentence = getSentenceInput(); // Get sentence input
        int wordCount = countWords(sentence); // Count words
        System.out.println("The sentence has " + wordCount + " words.");
    }
}
