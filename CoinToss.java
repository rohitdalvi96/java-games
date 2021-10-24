package mainProject;
import java.util.Random;
import java.util.Scanner;
 
// Coin toss/flip game in Java
public class CoinToss {
	private static Player p; 
    private enum Coin {
        Head, Tail
    };
 
    public static Player main(Player args) {
    	p = args;
        CoinToss game = new CoinToss();
        game.startGame();
        return p;
    }
 
    // Starts a coin flip game till user decides to quit.
    private void startGame() {
 
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        Coin guess;

    // create score variables
		int wins = 0;
		int losses = 0;
		int points = 0;
 
        while (true) {
            System.out.print("Enter you guess (h for heads, t for tails, -1 to quit): \n");
            String choice = scanner.next();
            
            if (choice.equalsIgnoreCase("-1")) {          
                break;
            } else if (choice.equalsIgnoreCase("h")) {
                guess = Coin.Head;
            } else if (choice.equalsIgnoreCase("t")) {
                guess = Coin.Tail;
            } else {
                System.out.println("Wrong choice! Try again!");
                continue;
            }
 
            Coin toss = tossCoin();
            if (guess == toss) {
                System.out.println("Congratulations! You won the toss :) ");
					wins++;
            } else {
                System.out.println("Sorry! You lost the toss. :( ");
					losses--;
            }
                points = (wins+losses);
                
                System.out.println("Total Points: " + points) ;
        }
        p.setPoints(p.getPoints() + points);
        System.out.println("Thanks for playing Coin Toss Game! ") ;

 
    }
 
    // Flip a coin and return result
    private Coin tossCoin() {
        Random r = new Random();
        int i = r.nextInt(2);
        if (i == 0) {
            return Coin.Head;
        } else {
            return Coin.Tail;
        }
    }
 
}