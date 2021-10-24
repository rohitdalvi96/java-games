package mainProject;
import java.util.Scanner;

class RockPaperScissor{
	private static Player p; 
	public static Player main(Player args) {
    	p = args;
    	RockPaperScissor game = new RockPaperScissor();
        game.startGame();
        return p;
    }
	private void startGame()  {
    
		//Initialize the Scanner and print a welcome message
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);		
        System.out.println("Welcome to Rock, Paper, Scissors!");

		// create score variables
		int wins = 0;
		int losses = 0;
		int points = 0;
		//Use a while(true) loop and only break the loop if the user wants to quit
		while(true) {
		
			//Get the user's move through user input
			System.out.println("What is your move? To make a move, enter rock, paper, or scissors. To quit the game, enter -1. ");
			String myMove = input.nextLine();
			
			//Check if the user wants to quit the game
			if(myMove.equals("-1")) {
				break;
			}

			//Check if the user's move is valid (rock, paper, or scissors)
			if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {

				System.out.println("Your move isn't valid!");
			
			} else {

				//Get a random number in between 0 and 3 and convert it to an integer so that the possibilities are 0, 1, or 2
				int rand = (int)(Math.random()*3);
				
				//Convert the random number to a string using conditionals and print the opponent's move
				String opponentMove = "";
				if(rand == 0) {
					opponentMove = "rock";
				} else if(rand == 1) {
					opponentMove = "paper";
				} else {
					opponentMove = "scissors";
				}
				System.out.println("Opponent move: " + opponentMove);
					
				//Print the results of the game: tie, lose, win
				if(myMove.equals(opponentMove)) {
					System.out.println("It's a tie!");
				} else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
					
					System.out.println("You won!");
					wins++;
				} else {
					System.out.println("You lost!");
					losses--;
				}

			}
			points = (wins+losses);
			System.out.println("Total Points: " + points) ;
		}
		p.setPoints(p.getPoints() + points);

		//Print a final message for the user
		System.out.println("Thanks for playing Rock, Paper & Scissor! :) ");
  }
}