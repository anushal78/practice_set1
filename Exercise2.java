import java.util.Scanner;
import java.util.Random;

public class Exercise2 {
    public static void main(String[] args){
        // 0 for Rock, 1 for Paper, 2 for scissor
        //Taking input from the user(First user)

        System.out.println("Enter 0 for Rock,Enter 1 for Paper,Enter 2 for Scissor ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        //Taking input from computer(Second user)
        Random random = new Random();
        int computerInput = random.nextInt(3);

        //starting the game
        if(userInput==computerInput){
            System.out.println("No one won the game");
        } else if (userInput==0 && computerInput==2 || userInput==2 && computerInput==1 || userInput==1 && computerInput==0) {
            System.out.println("User won the game");
        }
        else {
            System.out.println("Computer won the game");
        }
    }
}

/*
The winner for this game is decided based on the following:
Rock beats Scissor (Rock smashes Scissor)
Scissors beats Paper (Scissor cuts Paper)
Paper beats Rock (Paper wraps Rock)
If both the players make a similar hand formation than the game will be considered as draw
https://www.stechies.com/rock-paper-scissors-game-java/
*/
