import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ColorButtons implements ActionListener {

	JButton ColorButton;
	
	
	
	
	public void getColorButton(int x, int y, Color z) {
		
		ColorButton = new JButton();
		ColorButton.setBounds((x*40)-20, (y*40)-25, 30, 30);
		ColorButton.addActionListener(this);
		ColorButton.setFocusable(false);
		ColorButton.setBackground(z);
		ColorButton.setBorder(BorderFactory.createEtchedBorder());
		ColorButton.setBorderPainted(false);
		
		GUI.frame.add(ColorButton);
		
	}
	
	public void disableColorButton() {
			ColorButton.setEnabled(false);
	}
	public void enableColorButton() {

			ColorButton.setEnabled(true);
	}
	public static void enableAllColorButtons() {
		
		GUI.colorButton1.enableColorButton();
		GUI.colorButton2.enableColorButton();
		GUI.colorButton3.enableColorButton();
		GUI.colorButton4.enableColorButton();
		GUI.colorButton5.enableColorButton();
		GUI.colorButton6.enableColorButton();

	}

	
	public static void disableAllColorButtons() {
		
		GUI.colorButton1.disableColorButton();
		GUI.colorButton2.disableColorButton();
		GUI.colorButton3.disableColorButton();
		GUI.colorButton4.disableColorButton();
		GUI.colorButton5.disableColorButton();
		GUI.colorButton6.disableColorButton();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Player.PlayerColor = ColorButton.getBackground();
		
	}

}
