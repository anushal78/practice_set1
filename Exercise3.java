//File in the editor is not runnable
//we can't able to execute the file and we get above error if we miss the programme structure of java.
// I was missing (String[] args) in public static void main()

/*
Create a class Game, which allows a user to play "Guess the Number" game once.
Game should have the following methods:
Constructor to generate the random number
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
*/
import java.util.Scanner;
import java.util.Random;
class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    //constructor
    Game(){
        Random rand = new Random(); //To generate random number
        this.number = rand.nextInt(100);
    }
    void takeUserInput() {
        System.out.print("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber() {
        noOfGuesses++;
        if(inputNumber == number){
            System.out.println("Yes you guessed it right");
            return true;
        }
        else if(inputNumber<number) {
            System.out.println("low");
        }
        else if(inputNumber>number) {
            System.out.println("High");
        }
        return false;
    }
}
public class Exercise3 {
    public static void main(String[] args){
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b=g.isCorrectNumber();
        }
    }
}

