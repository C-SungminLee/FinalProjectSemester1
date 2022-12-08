import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int rockLife = 100;
        boolean wantRock = true;


            System.out.println("Welcome to the magical Round, Organic, Crystals garden (ROC)!\nToday you'll be choosing your new best friend in life, a pet ROC.\n\nWhat's its name? ");
            String rockName = input.nextLine();

            System.out.println("Is '" + rockName + "' the correct name? (Y or N)");
            String userInput = ((input.nextLine()).toLowerCase());

            while (!(userInput.equals("y"))) {
                System.out.println("What's its name? ");
                rockName = input.nextLine();
                System.out.println("Is '" + rockName + "' the correct name? (Y or N)");
                userInput = ((input.nextLine()).toLowerCase());
            }
        while (rockLife > 0 && wantRock) {
            rock rockClass = new rock(rockName, rockLife);
            rockClass.rockPaperScissors();
        }
        System.out.println("You have killed your pet ROC. Shame on you");


    }
}
