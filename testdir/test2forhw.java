import java.util.Arrays;
import java.util.Scanner;

public class ReadVowels {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input = userInput.nextLine();

        String sortedVowels = sortVowels(input);
        System.out.println("Sorted Vowels: " + sortedVowels);
    }

    public static String sortVowels(String input) {
        // Convert the string to a character array
        char[] chars = input.toCharArray();

        // Create an array to store the vowels
        char[] vowels = new char[chars.length];
        int index = 0;

        // Extract the vowels from the string
        for (char c : chars) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowels[index++] = c;
            }
        }

        // Resize the vowels array to the actual number of vowels
        vowels = Arrays.copyOf(vowels, index);

        // Sort the array of vowels
        Arrays.sort(vowels);

        // Convert the sorted array back to a string
        return new String(vowels);
    }
}
