import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MyButton implements ActionListener{
 
	
	static ArrayList<Integer> winner = new ArrayList<Integer>();	
	
	JButton button;
	int name = 0;
	
	
	static int Reihe1;
	static int Reihe2;
	static int Reihe3;
	static int Spalte1;
	static int Spalte2;
	static int Spalte3;
	static int Diagonal1;
	static int Diagonal2;
	
	static boolean b1 = true;
	static boolean b2 = true;
	static boolean b3 = true;
	static boolean b4 = true;
	static boolean b5 = true;
	static boolean b6 = true;
	static boolean b7 = true;
	static boolean b8 = true;
	static boolean b9 = true;
		
	
public void getButton(int n, int x, int y){
	

	
	name = n;
	button = new JButton();
	button.setBounds(x, y, 190, 190);
	button.addActionListener(this);
	button.setFocusable(false);
	button.setBackground(Color.darkGray);
	button.setBorder(BorderFactory.createEtchedBorder());
	button.setBorderPainted(false);
	
	GUI.frame.add(button);
	
}

public void setButtonColor(){
	
	button.setBackground(new Color(71, 160, 7));
	
}
public void setButtonColorDefault(){
	
	button.setBackground(Color.DARK_GRAY);
	
}
public static void setAllButtonColors() {
	
	GUI.button1.setButtonColorDefault();
	GUI.button2.setButtonColorDefault();
	GUI.button3.setButtonColorDefault();
	GUI.button4.setButtonColorDefault();
	GUI.button5.setButtonColorDefault();
	GUI.button6.setButtonColorDefault();
	GUI.button7.setButtonColorDefault();
	GUI.button8.setButtonColorDefault();
	GUI.button9.setButtonColorDefault();

}

public void setButtonTextDefault() {
	
	button.setText("");
	
}

public static void setAllButtonTextDefault() {
	
	GUI.button1.setButtonTextDefault();
	GUI.button2.setButtonTextDefault();
	GUI.button3.setButtonTextDefault();
	GUI.button4.setButtonTextDefault();
	GUI.button5.setButtonTextDefault();
	GUI.button6.setButtonTextDefault();
	GUI.button7.setButtonTextDefault();
	GUI.button8.setButtonTextDefault();
	GUI.button9.setButtonTextDefault();

}
	public void disableButton(){
		button.setEnabled(false);
	}
	
	public void enableButton() {
		button.setEnabled(true);
	}

	public void setSymbolColor(){
		
		UIManager.getDefaults().put("Button.disabledText",Color.darkGray);
	}

	
	public static void disableAllButtons() {
		
		GUI.button1.disableButton();
		GUI.button2.disableButton();
		GUI.button3.disableButton();
		GUI.button4.disableButton();
		GUI.button5.disableButton();
		GUI.button6.disableButton();
		GUI.button7.disableButton();
		GUI.button8.disableButton();
		GUI.button9.disableButton();
	
		b1 = false;
		b2 = false;
		b3 = false;
		b4 = false;
		b5 = false;
		b6 = false;
		b7 = false;
		b8 = false;
		b9 = false;
	}
	
	public static void enableAllButtons() {
		
		GUI.button1.enableButton();
		GUI.button2.enableButton();
		GUI.button3.enableButton();
		GUI.button4.enableButton();
		GUI.button5.enableButton();
		GUI.button6.enableButton();
		GUI.button7.enableButton();
		GUI.button8.enableButton();
		GUI.button9.enableButton();
	
		b1 = true;
		b2 = true;
		b3 = true;
		b4 = true;
		b5 = true;
		b6 = true;
		b7 = true;
		b8 = true;
		b9 = true;
	}
	
	public void disableOneButton() {
		
		int a = name; 
		//System.out.println(a);
		if(a == 1) {
			b1 = false;
		}
		else if(a == 2) {
			b2 = false;
		}
		else if(a == 3) {
			b3 = false;
		}
		else if(a == 4) {
			b4 = false;
		}
		else if(a == 5) {
			b5 = false;
		}
		else if(a == 6) {
			b6 = false;
		}
		else if(a == 7) {
			b7 = false;
		}
		else if(a == 8) {
			b8 = false;
		}
		else if(a == 9) {
			b9 = false;
		}
	}

	
	public void botClick() {
		
		button.setText(Bot.BotSymbol);
		UIManager.getDefaults().put("Button.disabledText",Bot.BotColor);	
		

		if(Player.PlayerSymbol == "X") {
			winner.set(name, 1);

		}
		else {
			winner.set(name, 10);
		}
			

		Player.PlayerBegins = true;
		
	}
	
	
	
@Override

public void actionPerformed(ActionEvent e) {

	if(e.getSource()==GUI.button1) {
		System.out.println("OKOKOKOKOK");
	}
		
	if(e.getSource()==button || Bot.click == true) {
		//System.out.println("click");
		button.setEnabled(false);
		ColorButtons.disableAllColorButtons();
		RandomColor.off = true;
		
		//disableOneButton();

		
		if(Player.PlayerBegins == true) {
			
			button.setText(Player.PlayerSymbol);
			
			UIManager.getDefaults().put("Button.disabledText",Player.PlayerColor);
			
	
			if(Player.PlayerSymbol == "O") {
				winner.set(name, 1);

			}
			else {
				winner.set(name, 10);
			}
							
			
			Player.PlayerBegins = false;
			
		}
		else {
			//System.out.println(Reihe1);
			//Bot.botSee();
			botClick();
			/*
			button.setText(Bot.BotSymbol);
			UIManager.getDefaults().put("Button.disabledText",Bot.BotColor);	
			

			if(Player.PlayerSymbol == "X") {
				winner.set(name, 1);

			}
			else {
				winner.set(name, 10);
			}
				

			Player.PlayerBegins = true;
			*/
			}
		
		button.setFont(new Font("Kalam", Font.CENTER_BASELINE, 100));
		
		}
	
	Bot.botSee();
	
	win();
	disableOneButton();
	
	Bot.click = false;
	
	/*
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	System.out.println(b4);
	System.out.println(b5);
	System.out.println(b6);
	System.out.println(b7);
	System.out.println(b8);
	System.out.println(b9);
	System.out.println("  ");
	*/
	
	if(TicTacToe.stopGame == true) {
		endGame();
	}
	}




public static void win() {
		
		
		Reihe1 = winner.get(1) + winner.get(2) + winner.get(3);
		Reihe2 = winner.get(4) + winner.get(5) + winner.get(6);
		Reihe3 = winner.get(7) + winner.get(8) + winner.get(9);
		
		Spalte1 = winner.get(1) + winner.get(4) + winner.get(7);
		Spalte2 = winner.get(2) + winner.get(5) + winner.get(8);
		Spalte3 = winner.get(3) + winner.get(6) + winner.get(9);
		
		Diagonal1 = winner.get(1) + winner.get(5) + winner.get(9);
		Diagonal2 = winner.get(3) + winner.get(5) + winner.get(7);
		
		int Alle = Reihe1 + Reihe2 + Reihe3;
		
		if(Reihe1 == 3 || Reihe2 == 3 || Reihe3 == 3 || Spalte1 == 3 || Spalte2 == 3 || Spalte3 == 3 || Diagonal1 == 3 || Diagonal2 == 3) {	
			System.out.println("Winner is: O");
			disableAllButtons();
			greenEnd();
			TicTacToe.stopGame = true;
		}
		else if(Reihe1 == 30 || Reihe2 == 30 || Reihe3 == 30 || Spalte1 == 30 || Spalte2 == 30 || Spalte3 == 30 || Diagonal1 == 30 || Diagonal2 == 30) {
			System.out.println("Winner is: X");
			disableAllButtons();
			greenEnd();
			TicTacToe.stopGame = true;
		}
		else if(Alle == 45 || Alle == 54) {
			
			System.out.println("Draw");
			TicTacToe.stopGame = true;
		}
		
		//System.out.println(Alle);
		
	}


public void endGame() {
	
	
		button.setEnabled(false);
		TicTacToe.stopGame = false;
		
		
		
		//Auto restart:
		//RestartButton.restartGame();

}

public static void greenEnd() {
	
	if(Reihe1 == 3 || Reihe1 == 30) {
		 GUI.button1.setButtonColor();
		 GUI.button2.setButtonColor();
		 GUI.button3.setButtonColor();
		 
		 GUI.button1.setSymbolColor();
		 GUI.button2.setSymbolColor();
		 GUI.button3.setSymbolColor();
	 }
	 if(Reihe2 == 3 || Reihe2 == 30) {
		 GUI.button4.setButtonColor();
		 GUI.button5.setButtonColor();
		 GUI.button6.setButtonColor(); 
		 
		 GUI.button4.setSymbolColor();
		 GUI.button5.setSymbolColor();
		 GUI.button6.setSymbolColor(); 
	 }
	 if(Reihe3 == 3 || Reihe3 == 30) {
		 GUI.button7.setButtonColor();
		 GUI.button8.setButtonColor();
		 GUI.button9.setButtonColor(); 
		 
		 GUI.button7.setSymbolColor();
		 GUI.button8.setSymbolColor();
		 GUI.button9.setSymbolColor(); 
	 }
	 if(Spalte1 == 3 || Spalte1 == 30) {
		 GUI.button1.setButtonColor();
		 GUI.button4.setButtonColor();
		 GUI.button7.setButtonColor(); 
		 
		 GUI.button1.setSymbolColor();
		 GUI.button4.setSymbolColor();
		 GUI.button7.setSymbolColor(); 
	 }
	 if(Spalte2 == 3 || Spalte2 == 30) {
		 GUI.button2.setButtonColor();
		 GUI.button5.setButtonColor();
		 GUI.button8.setButtonColor(); 
		 
		 GUI.button2.setSymbolColor();
		 GUI.button5.setSymbolColor();
		 GUI.button8.setSymbolColor(); 
	 }
	 if(Spalte3 == 3 || Spalte3 == 30) {
		 GUI.button3.setButtonColor();
		 GUI.button6.setButtonColor();
		 GUI.button9.setButtonColor(); 
		 
		 GUI.button3.setSymbolColor();
		 GUI.button6.setSymbolColor();
		 GUI.button9.setSymbolColor(); 
	 }
	 if(Diagonal1 == 3 || Diagonal1 == 30) {
		 GUI.button1.setButtonColor();
		 GUI.button5.setButtonColor();
		 GUI.button9.setButtonColor(); 
		 
		 GUI.button1.setSymbolColor();
		 GUI.button5.setSymbolColor();
		 GUI.button9.setSymbolColor();
	 }
	 if(Diagonal2 == 3 || Diagonal2 == 30) {
		 GUI.button3.setButtonColor();
		 GUI.button5.setButtonColor();
		 GUI.button7.setButtonColor(); 
		 
		 GUI.button3.setSymbolColor();
		 GUI.button5.setSymbolColor();
		 GUI.button7.setSymbolColor(); 
	 }
}


}

 
/*


	if(e.getSource()==button) {
		//System.out.println("click");
		button.setEnabled(false);
		ColorButtons.disableAllColorButtons();
		
		if(TicTacToe.beginner % 2 == 0 ) {
			button.setText("O");
			
			UIManager.getDefaults().put("Button.disabledText",ColorButtons.PlayerColor);
			winner.set(name, 1);
			
		}
		else {
			button.setText("X");
			UIManager.getDefaults().put("Button.disabledText",Color.BLUE);
			
			winner.set(name, 10);
			}
		
		button.setFont(new Font("Kalam", Font.CENTER_BASELINE, 100));
		TicTacToe.beginner++;
		}












JButton button;

MyButton(){


	button = new JButton();
	button.setBounds(100, 100, 250, 100);
	button.addActionListener(this);

	UIManager.getDefaults().put("Button.disabledText",Color.RED);
	
	button.setFocusable(false);
	button.setHorizontalTextPosition(JButton.CENTER);
	button.setVerticalTextPosition(JButton.BOTTOM);
	button.setFont(new Font("Comic Sans",Font.BOLD,25));
	button.setForeground(Color.cyan);
	button.setBackground(Color.lightGray);
	button.setBorder(BorderFactory.createEtchedBorder());

	/*
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(null);
	this.setSize(500,500);
	this.setVisible(true);
	this.add(button);
	
}

@Override

public void actionPerformed(ActionEvent e) {

	if(e.getSource()==button) {
		System.out.println("poo");
		button.setEnabled(false);
		button.setText("O");
		button.setFont(new Font("Kalam", Font.CENTER_BASELINE, 50));
	}	

}
*/