import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Prompt the user to enter the name of the yarn specified by the pattern
        System.out.println("Enter the name of the yarn specified by your pattern.");
        String patternYarnName = keyboard.nextLine();
        
        // Prompt the user to enter the number of balls required for the pattern yarn
        System.out.println("Enter the number of balls of " + patternYarnName + " that are required.");
        int patternYarnBalls = keyboard.nextInt();
        
        // Prompt the user to enter the number of yards per ball for the pattern yarn
        System.out.println("Enter the number of yards per ball of " + patternYarnName + ".");
        int patternYarnYards = keyboard.nextInt();
        
        // Clear the newline character left in the input buffer
        keyboard.nextLine();
        
        // Prompt the user to enter the name of the substitute yarn
        System.out.println("Enter the name of the substitute yarn.");
        String substituteYarnName = keyboard.nextLine();
        
        // Prompt the user to enter the number of yards per ball for the substitute yarn
        System.out.println("Enter the number of yards per ball of " + substituteYarnName + ".");
        int substituteYarnYards = keyboard.nextInt();
        
        // Calculate the total yards needed for the pattern
        int totalPatternYards = patternYarnBalls * patternYarnYards;
        
        // Calculate the exact number of substitute yarn balls needed (as a double)
        double exactSubstituteYarnBalls = (double) totalPatternYards / substituteYarnYards;
        
        // Round up to the nearest full ball using Math.ceil() and cast the result to an int
        int roundedSubstituteYarnBalls = (int) Math.ceil(exactSubstituteYarnBalls);
        
        // Print the number of substitute yarn balls needed
        System.out.println("You should purchase " + roundedSubstituteYarnBalls + " balls of " + substituteYarnName + " instead of " + patternYarnBalls + " balls of " + patternYarnName + ".");
    }
}
