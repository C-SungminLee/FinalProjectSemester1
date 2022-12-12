public class rock {
    private final String rockName;

    /**
     * rock constructor sets the rockName & life variables in rock.java
     * @param rockName the pet ROC's name
     */
    public rock(String rockName){
        this.rockName = rockName;
    }
    /**
     * rockPaperScissors method receives the user's choice in rock paper scissors and returns the result
     * @param userInput the User's choice in rock paper scissors
     * @return if the user wins and how much damage the ROC receives
     */
    public int rockPaperScissors(String userInput){
        //if the user chooses rock
        if (userInput.equals("r")){
            System.out.println("You tied with " + rockName + "!");
            //rock takes 0 damage
            return 0;
        //if the user chooses paper
        }else if (userInput.equals("p")){
            System.out.println("You won against " + rockName + "!");
            //rock takes 10 damage
            // return (-10);
        //if the user chooses scissors
        }else if(userInput.equals("s")){
            System.out.println("You lost against " + rockName + "!");
            //rock heals 5 damage
            return (5);
        //if the user doesn't choose a valid option
        }else{
            System.out.println("Not a valid input. You throw the rock across your room.");
            //rock takes 2 damage
            return (-2);
        }

        return 0;
    }
}

