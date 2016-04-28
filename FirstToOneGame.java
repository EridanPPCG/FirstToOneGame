import java.util.Scanner; //read input

public class FirstToOneGame {
	public static void main(String[] args) {
		
		String player1Name, player2Name; //for names of players
		final int STARTING_POINTS = 50; //always start with this number of points
		
		Scanner keyboard = new Scanner(System.in); //object to read input
		
		System.out.println("Player 1, what is your name?"); //creation of names
		player1Name = keyboard.nextLine();
		System.out.println("Player 2, what is your name?"); //this can be done with enum but I'm really tired, lol
		player2Name = keyboard.nextLine();
		
		Player player1 = new Player(player1Name, STARTING_POINTS); //creation of players
		Player player2 = new Player(player2Name, STARTING_POINTS);
		
		Die player1Die = new Die(6); //creation of dies
		Die player2Die = new Die(6);
		
		while(player1.getPoints() != 1 && player2.getPoints() != 1) { //while the game isn't over
			player1Die.roll(); //roll
			int player1Roll = player1Die.getValue();
			if(player1.getPoints() - player1Roll < 1) { //check if roll makes points negative
				int newPoints1 = player1.getPoints() + player1Roll;
				player1.setPoints(newPoints1); //change value of points
			}
			else {
				int newPoints = player1.getPoints() - player1Roll;
				player1.setPoints(newPoints);
			}
			
			if(player1.getPoints() == 1) { //check if win
				System.out.println(player1.getName() + " wins!");
				break; //end program
			}
			
			player2Die.roll(); //same as player 1
			int player2Roll = player2Die.getValue();
			if(player2.getPoints() - player2Roll < 1) {
				int newPoints = player2.getPoints() + player2Roll;
				player2.setPoints(newPoints);
			}
			else {
				int newPoints2 = player2.getPoints() - player2Roll;
				player2.setPoints(newPoints2);
			}
			
			if(player2.getPoints() == 1) {
				System.out.println(player2.getName() + " wins!");
				break;
			}
		}
	}
}
