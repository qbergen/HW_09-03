/**
 * Created by queenabergen on 9/3/16.
 */
import java.util.Scanner;
public class BeginningSequence {
    public static void beginningSequence(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Were coming up to a stop sign. Quick, pick a direction. LEFT RIGHT or STRAIGHT");
        String userInput=scanner.nextLine();
        switch (userInput.toUpperCase()) {
            case "LEFT": System.out.println("NOOOO, left turns make the bolts on the car tires loose, you need to go out there and fix it !");
                break;
            case "RIGHT": System.out.println("Great, you just had to ");
                break;
            case "STRAIGHT": System.out.println("...");
                break;
            default: System.out.println("Either pick a direction or get out the car.");
                String userDecision=scanner.nextLine();
                //loop through the switch statement
                break;
        }

    }
}
