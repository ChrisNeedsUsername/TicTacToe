import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class RestartButton implements ActionListener {

	JButton restartButton;
	
	public void getRestartButton() {
		
		restartButton = new JButton("Restart");
		restartButton.setBounds(480, 20, 80, 60);
		restartButton.addActionListener(this);
		restartButton.setFocusable(false);
		restartButton.setBackground(new Color(54, 54, 56));
		restartButton.setBorder(BorderFactory.createEtchedBorder());
		restartButton.setForeground(Color.LIGHT_GRAY);
		restartButton.setFont(new Font("Kalam", Font.CENTER_BASELINE, 20));
		
		GUI.frame.add(restartButton);
		

		
	}
	
	
	// ArrayList gesetzte Werte zu Standard zurücksetze
	public static void resetArrayList() {
		
		for(int i = 0; i < 10; i++) {
			MyButton.winner.set(i, 0);
			}
	}
	
	public static void restartGame() {
		
		TicTacToe.whoStarts();
		TicTacToe.whoIsWhat();
		resetArrayList();
		
		MyButton.enableAllButtons();
		MyButton.setAllButtonColors();
		MyButton.setAllButtonTextDefault();
		
		ColorButtons.enableAllColorButtons();
		
		RandomColor.enableAllRCButtons();
		
		RandomColor.off = false;
		Bot.BotColor = RandomColor.randomColor();
		
			
		//GUI start = new GUI();
		//start.myFrame();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		restartGame();
		
		}		
		
	}
