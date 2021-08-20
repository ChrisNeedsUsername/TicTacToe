import java.awt.Color;

public class Player {

	static String PlayerSymbol;
	static boolean PlayerBegins;
	static Color PlayerColor;
	
	
	public static void play() {
	
	if(TicTacToe.beginner == 0){
		
		System.out.println("Player begins");	
		PlayerBegins = true;
	}
	else {
		
		System.out.println("Bot begins");
		PlayerBegins = false;
	}
}
	public static void whichSymbol() {
		
		if(TicTacToe.symbol == 0){
			
			System.out.println("Player: O");	
			PlayerSymbol = "O";
			Bot.BotSymbol = "X";
		}
		else {
			System.out.println("Player: X");
			PlayerSymbol = "X";
			Bot.BotSymbol = "O";
		}

	}	
}
