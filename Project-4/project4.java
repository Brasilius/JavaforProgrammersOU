import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

public class Project4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file name:");
        String filename = input.nextLine();

        // Read the file and store lines in an array
        String[] movieArray = readFile(filename);

        // Convert all movie titles to lowercase
        lowercase(movieArray);

        // Find the most frequent movie title
        String mostPopularMovie = findMostFrequent(movieArray);

        // Output the result
        System.out.println("Most popular movie: " + mostPopularMovie);
    }

    public static String[] readFile(String filename) {
        String[] lines = null;
        try {
            Scanner file = new Scanner(new File(filename));
            int lineCount = 0;

            // Count the number of lines in the file
            while(file.hasNextLine()) {
                file.nextLine();
                lineCount++;
            }

            // Close the original Scanner and reconstruct to read the file again
            file.close();
            file = new Scanner(new File(filename));

            lines = new String[lineCount];
            int index = 0;

            // Read each line and store it in the array
            while(file.hasNextLine()) {
                lines[index] = file.nextLine();
                index++;
            }

            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        return lines;
    }

    public static void lowercase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toLowerCase();
        }
    }

    public static String findMostFrequent(String[] array) {
        Arrays.sort(array);

        String mostFrequent = "";
        String current = array[0];
        int maxCount = 1;
        int count = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(current)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    mostFrequent = current;
                }
                current = array[i];
                count = 1;
            }
        }

        // Check for the last element
        if (count > maxCount) {
            mostFrequent = current;
        }

        return mostFrequent;
    }
}
