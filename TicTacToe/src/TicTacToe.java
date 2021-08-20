
public class TicTacToe {
	
	static int beginner;
	static int symbol;
	static boolean stopGame = false;
	
	public static void main(String[] args) {
		
		
		whoStarts();
		whoIsWhat();
		setArrayList();
			
		GUI start = new GUI();
		start.myFrame();
		}		

	
	// X oder O als Beginner
	public static void whoStarts() {
		
		beginner = (int)(Math.random() * 2);
		Player.play();
		//System.out.println(beginner);

		}
	
	public static void whoIsWhat() {
		
		symbol = (int)(Math.random() * 2);
		Player.whichSymbol();
		//System.out.println(symbol);
		
		}
	
	// ArrayList befüllen, damit es zu keinen Problemen kommt
	public static void setArrayList() {
		
		for(int i = 0; i < 10; i++) {
			MyButton.winner.add(0);
			}
		}	
	

}
