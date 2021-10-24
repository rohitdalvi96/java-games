package mainProject;
import java.util.ArrayList;
import java.util.Scanner;

public class Games {
	
	static ArrayList<Player> player = new ArrayList<Player>();
	public static void main(String[] args) {
        
		//Initialize the Scanner and print a welcome message
		
		addPlayer();
        
        for(Player pPtr: player) {
        	System.out.println("Player : Points \n" + pPtr.getName() + ": " + pPtr.getPoints());
        }
    }
	
	@SuppressWarnings("resource")
	public static void addPlayer() {
		int num = 1; 
		Scanner input = new Scanner(System.in);	
		while(true) {
//			Ask user if they want to start as New Player or Quit the Game menu.	
			System.out.println ( "Please choose an option: \n1. New Player \n2. Quit" );
	        num = input.nextInt();
	        if (num == 2)
	        	break;
			if(num != 1 && num != 2 && num != -1) {
				System.out.println("Your move isn't valid!");
			}
			else {
	        System.out.println(num);
	        String name;
	        System.out.println( "Please enter a name: " );
	        name = input.next();
	        Player p = new Player(name);
	        player.add(p);
	        startGame();
			}
		}
		
	}
	
    
   @SuppressWarnings("resource")
public static void startGame() {
	   boolean flag = true;
	   Player curPlayer = player.get(player.size() - 1);
	   Scanner input = new Scanner(System.in);	
	   while(flag) {
//			Ask user which game they want to play or Quit the Game.	
		   	System.out.println( "Hello " + curPlayer.getName() +". Please choose a game, or -1 to quit: \n1: Coin Toss \n2: Rock-Paper-Scissor \n");
			// Switch case to enter game the user wants to play.
	        int option = 0;
	        option = input.nextInt();
	    	if(option != 1 && option != 2 && option != -1) {
				System.out.println("Your move isn't valid!");
			}
	    	else {
	        Player tempPlr;
	        switch (option) {
		        case 1:  
		        		 System.out.println( "You are Now Playing Coin Toss " );
		        		 new CoinToss();
		        		 tempPlr = CoinToss.main(curPlayer);
		        		 player.set(player.size() - 1, tempPlr);
		                 break;
		        case 2:  
		        		 System.out.println( "You are Now Playing Rock-Paper-Scissor " );
		        		 new RockPaperScissor();
		        		 tempPlr = RockPaperScissor.main(curPlayer);
		        		 player.set(player.size() - 1, tempPlr);
		        		 break;
		        default :  
		        		 System.out.println( "You chose to quit " );
		        		 flag = false;
		        		 break;
	        }
	   }
	   
   }
}	
   
}   