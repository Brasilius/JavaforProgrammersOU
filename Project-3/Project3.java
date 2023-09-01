import java.util.Scanner;

public class Project3{
public static void main(String[] args){
    int userInput = 0;
    int storageSentinel = 3;
    int totalPositiveChanges = 0;
    int totalNegativeChanges = 0;
    int totalNoChanges = 0;
    int timesOneWasChosen = 0;
    int timesTwoWasChosen = 0;
    int timesThreeWasChosen = 0;
    int timesFourWasChosen = 0;
    int timesFiveWasChosen = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("Response Dial Simulator");
    System.out.println("-----------------------");
    System.out.println("Initial setting: 3");
    while (userInput != -1){
        System.out.println("Enter the next setting (1-5) or -1 to stop.");
        userInput = input.nextInt();
        if (userInput > storageSentinel){
            System.out.println("Positive change: " + storageSentinel + " to " + userInput);
            totalPositiveChanges++;
        }
        else if (userInput < storageSentinel && userInput != -1){
            System.out.println("Negative change: " + storageSentinel + " to " + userInput );
            totalNegativeChanges++;
        }
        else if (userInput == storageSentinel && userInput != -1){
            System.out.println("No change: " + userInput + " to " + userInput);
            totalNoChanges++;
        }
        if (userInput == 1){
            System.out.println("Current setting: 1");
            timesOneWasChosen++;
        }
        else if (userInput == 2){
            System.out.println("Current setting: 2");
            timesTwoWasChosen++;
        }
        else if (userInput == 3){
            System.out.println("Current setting: 3");
            timesThreeWasChosen++;
        }
        else if (userInput == 4){
            System.out.println("Current setting: 4");
            timesFourWasChosen++;
        }
        else if (userInput == 5){
            System.out.println("Current setting: 5");
            timesFiveWasChosen++;
        }
        storageSentinel = userInput;
    }
    input.close();
    System.out.println("");
    System.out.println("Response Summary");
    System.out.println("----------------");
    System.out.println("1 was chosen " + timesOneWasChosen + " time(s).");
    System.out.println("2 was chosen " + timesTwoWasChosen + " time(s).");
    System.out.println("3 was chosen " + timesThreeWasChosen+ " time(s).");
    System.out.println("4 was chosen " + timesFourWasChosen + " time(s).");
    System.out.println("5 was chosen " + timesFiveWasChosen + " time(s).");
    System.out.println("");
    System.out.println("Positive changes: " + totalPositiveChanges);
    System.out.println("Negative changes: " + totalNegativeChanges);
    System.out.println("No changes: " + totalNoChanges);

    }
}