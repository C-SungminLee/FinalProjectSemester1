import java.util.Scanner;
public class rock {
    private String rockName;
    private int life;

    public rock(String rockName, int life){
        this.rockName = rockName;
        this.life = life;
    }

    public void rockPaperScissors(){
        Scanner input = new Scanner(System.in);
        System.out.println("What do you choose? Rock (R) Paper (P) Scissor (S)?");
        if ((input.nextLine().toLowerCase()).equals("r")){
            System.out.println("You tied with " + rockName + "!");
        }else if ((input.nextLine().toLowerCase()).equals("p")){
            System.out.println("You won against " + rockName + "!");
            life -=1000;

        }else if((input.nextLine().toLowerCase()).equals("s")){
            System.out.println("You lost against " + rockName + "!");
            life +=5;
        }else{
            System.out.println("Not a valid input. You throw the rock across your room.");
            life -=2;
        }


    }
}

