import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;


public class RandomColor implements ActionListener{
	
	JButton randomColorButton;
	static boolean off = false;
	
	public void getRandomButton() {
		
		randomColorButton = new JButton();
		randomColorButton.setBounds(150, 20, 320, 60);
		randomColorButton.addActionListener(this);
		randomColorButton.setFocusable(false);
		randomColorButton.setBorder(BorderFactory.createEtchedBorder());
		
		
		//Button unsichtbar machen
		randomColorButton.setOpaque(false);
		randomColorButton.setContentAreaFilled(false);
		randomColorButton.setBorderPainted(false);
		
		GUI.frame.add(randomColorButton);
		

		
}		
	public static Color randomColor() {
		
		Random rand = new Random();
		
		// Java 'Color' class takes 3 floats, from 0 to 1.
		float r = (float) (rand.nextFloat() / 2f + 0.4 - 0.1);
		float g = (float) (rand.nextFloat() / 2f + 0.4 - 0.1);
		float b = (float) (rand.nextFloat() / 2f + 0.4 - 0.1);
		
		Color randomColor = new Color(r, g, b);
		
		return randomColor;
		
		
	}
	public void disableRandomColorButton() {
		randomColorButton.setEnabled(false);	
	}
	public void enableRandomColorButton() {
		randomColorButton.setEnabled(true);	
	}
public static void enableAllRCButtons() {
		
		GUI.RColorButton.enableRandomColorButton();
}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(off == true) {
			
			disableRandomColorButton();
		}
		else {
		
		Player.PlayerColor = randomColor();
		}
	}

	
	
}
