// Coin-flipping simulator
// takes user input via SimpleIO and flips coin that many times

import jpb.*;
	
public class CoinFlip {
  public static void main(String[] args) {
    // Prompt user to guess heads or tails

    SimpleIO.prompt("How many flips would wou like to play?");
    int runs = SimpleIO.parseInt();
    
    while (runs>0){
    SimpleIO.prompt("Enter heads or tails: ");
    String userInput = SimpleIO.readLine();
    if (!userInput.equalsIgnoreCase("heads") &&
        !userInput.equalsIgnoreCase("tails")) {
      System.out.println("Sorry, you didn't enter heads " +
                         "or tails; please try again.");
      return;
    }      
	
    // Choose a random number
    double randomNumber = Math.random();
	
    // Determine whether user guessed correctly
    if (userInput.equalsIgnoreCase("heads") && 
        randomNumber < 0.5)
      System.out.println("You win!");
    else if (userInput.equalsIgnoreCase("tails") &&
             randomNumber >= 0.5)
      System.out.println("You win!");
    else
      System.out.println("Sorry, you lose.");
    runs--;
    }
    }
}