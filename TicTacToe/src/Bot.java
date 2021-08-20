import java.awt.Color;

public class Bot extends MyButton{

	static String BotSymbol;
	static Color BotColor = RandomColor.randomColor();
	static boolean click = false;
	
	
	public static void botSee() {
		
		if(BotSymbol == "X") {
			
			//System.out.println(MyButton.winner+"Am ENde von if else X");
			
			if(Reihe1 == 20) {	
				System.out.println("20 Kann gewinnen!!");
				botPlayR1();
				click = true;
			}	
			else if(Reihe1 == 2) {
				System.out.println("2 ACHTUNG!!");
				botPlayR1();
				click = true;
			}
			
		}
		else{
			
			//System.out.println(MyButton.winner+"Am ENde von if else O");
			
			if(Reihe1 == 2) {
				System.out.println("2 Kann gewinnen!!");
				botPlayR1();
				click = true;
			}	
			else if(Reihe1 == 20) {
				System.out.println("20 ACHTUNG!!");
				botPlayR1();
				click = true;
			}
			
		}
		
	}
	
	
	
	public static void botPlayR1() {
		
		System.out.println("platziere in Reihe 1 auf freiem Feld");

		if(MyButton.b1 == true)
		{
			//System.out.println("platziere 1");
			
		}
		
	}
}
