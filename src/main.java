/**
 * The FinalProjectSemester1 program simulates a pet rock
 * @author  Sungmin Lee
 * @version final
 * @since   2022-12-07
 */

import java.util.Scanner;

public class main {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        int rockLife = 100;
        boolean wantRock = true;


        //Greetings to the user and asks for the name of their pet ROC
        System.out.println("Welcome to the magical Round, Organic, Crystals garden (ROC)!\nToday you'll be choosing your new best friend in life, a pet ROC.\n\nWhat's its name? ");
        String rockName = input.nextLine();

        System.out.println("Is '" + rockName + "' the correct name? (Y or N)");
        String userInput = ((input.nextLine()).toLowerCase());

        //checks if the name the user gave is correct, if not it asks again until it is correct
        while (!(userInput.equals("y"))) {
            System.out.println("What's its name? ");
            rockName = input.nextLine();
            System.out.println("Is '" + rockName + "' the correct name? (Y or N)");
            userInput = ((input.nextLine()).toLowerCase());
        }
        rock rockClass = new rock(rockName);

        System.out.println("Now that you have a pet ROC you need to take care of it! (Y or N)");
        userInput = input.nextLine().toLowerCase();
        //Checks if the userInput is valid, if not it loops until it is
        while ((!userInput.equals("y") && !userInput.equals("n"))) {
            System.out.println("Error. Invalid input.\nNow that you have a pet ROC you need to take care of it! (Y or N)");
            userInput = input.nextLine().toLowerCase();
        }
        if (userInput.equals("n")) {
            //Checks if the user wants a pet ROC
            System.out.println("You don't want a pet ROC? (Y or N)");
            userInput = input.nextLine().toLowerCase();
            //Checks if the userInput is valid, if not it loops until it is
            while ((!userInput.equals("y") && !userInput.equals("n"))) {
                System.out.println("Error. Invalid input.\nYou don't want a pet ROC? (Y or N)");
                userInput = input.nextLine().toLowerCase();
            }
                if (userInput.equals("y")) {
                wantRock = false;
            } else {
                System.out.println("You have 2 options, play a game with it or abandon it. ");
            }
        }

        //runs the program as long as the ROC isn't destroyed or wanted
        while (rockLife > 0 && wantRock) {
            //checks if the user wants to play Rock paper scissors
            System.out.println("Do you want to play Rock Paper Scissors with " + rockName + "? (Y or N)");
            userInput = input.nextLine().toLowerCase();
            //Checks if the userInput is valid, if not it loops until it is
            while ((!userInput.equals("y") && !userInput.equals("n"))) {
                System.out.println("Error. Invalid input.\nDo you want to play Rock Paper Scissors with " + rockName + "? (Y or N)");
                userInput = input.nextLine().toLowerCase();
            }
                if (userInput.equals("y")) {
                    System.out.println("What do you choose? Rock (R) Paper (P) Scissor (S)?");
                    userInput = (input.nextLine().toLowerCase());
                    //changes the ROC's life if it's destroyed with the rockPaperScissors method
                    rockLife -= rockClass.rockPaperScissors(userInput);
                } else {
                    System.out.println("Do you want to abandon " + rockName + "? (Y or N)");
                    userInput = input.nextLine().toLowerCase();
                    //Checks if the userInput is valid, if not it loops until it is
                    while ((!userInput.equals("y") && !userInput.equals("n"))) {
                        System.out.println("Error. Invalid input.\nDo you want to abandon " + rockName + "? (Y or N)");
                        userInput = input.nextLine().toLowerCase();
                    }
                        if (userInput.equals("y")) {
                            wantRock = false;

                    }
                }

        }
        if (rockLife <= 0){
            System.out.println("\n\n\nYou destroyed your ROC. Shame on you.");

        }else{
            System.out.println("\n\n\nYou have abandoned your pet ROC. Shame on you.");
        }

    }
}

