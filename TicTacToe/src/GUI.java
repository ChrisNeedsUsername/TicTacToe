import java.awt.Color;
import java.awt.Font;
import javax.swing.*;



public class GUI{
		
	//JButton button;
	static JFrame frame;
	
	static MyButton button1 = new MyButton();
	static MyButton button2 = new MyButton();
	static MyButton button3 = new MyButton();
	static MyButton button4 = new MyButton();
	static MyButton button5 = new MyButton();
	static MyButton button6 = new MyButton();
	static MyButton button7 = new MyButton();
	static MyButton button8 = new MyButton();
	static MyButton button9 = new MyButton();
	
	static RestartButton restartButton = new RestartButton();
	
	static RandomColor RColorButton = new RandomColor();
	
	static ColorButtons colorButton1 = new ColorButtons();
	static ColorButtons colorButton2 = new ColorButtons();
	static ColorButtons colorButton3 = new ColorButtons();
	static ColorButtons colorButton4 = new ColorButtons();
	static ColorButtons colorButton5 = new ColorButtons();
	static ColorButtons colorButton6 = new ColorButtons();
	
	// Frame
	public void myFrame(){
		frame = new JFrame();
		
		
		//----------Button------------------
		button1.getButton(1, 0, 100);
		button2.getButton(2, 200, 100);
		button3.getButton(3, 400, 100);
		button4.getButton(4, 0, 300);
		button5.getButton(5, 200, 300);
		button6.getButton(6, 400, 300);
		button7.getButton(7, 0, 500);
		button8.getButton(8, 200, 500);
		button9.getButton(9, 400, 500);
		
				
		restartButton.getRestartButton();
		
		RColorButton.getRandomButton();
		
		colorButton1.getColorButton(1, 1, Color.blue);
		colorButton2.getColorButton(2, 1, Color.green);
		colorButton3.getColorButton(3, 1, Color.red);
		colorButton4.getColorButton(1, 2, Color.cyan);
		colorButton5.getColorButton(2, 2, Color.magenta);
		colorButton6.getColorButton(3, 2, Color.yellow);
		
		//----------LABEL------------------
		//ImageIcon icon = new ImageIcon("src/300.png");
		ImageIcon icon = new ImageIcon("src/icon.png");
		//ImageIcon icon = new ImageIcon("src/vector.eps");
		

		JPanel header = new JPanel();
		
		header.setBackground(new Color(58, 58, 60));
		header.setBounds(0, 0, 600, 100);	

		
		// Text
		JLabel label = new JLabel();
		label.setText("TicTacToe");
		label.setIcon(icon);	
		
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Kalam", Font.CENTER_BASELINE, 50));
		label.setIconTextGap(-1);
		label.setBounds(10, 10, 600, 100);
		
		//label.setVerticalAlignment(JLabel.CENTER);
		//label.setHorizontalAlignment(JLabel.LEFT);	
		
		
		//label.setHorizontalAlignment(JLabel.TRAILING);
		
		label.setHorizontalTextPosition(JLabel.RIGHT);
		label.setVerticalTextPosition(JLabel.CENTER);
		
		header.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 715);
		frame.setResizable(false);
		frame.setLocation(840, 400);
		frame.setTitle("TicTacToe");
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(header);
		
		frame.setIconImage(icon.getImage());
		frame.getContentPane().setBackground(Color.lightGray);

	}

}

/*

		JPanel header = new JPanel();
		
		header.setBackground(new Color(58, 58, 60));
		header.setBounds(0, 0, 600, 100);	

		
		// Text
		JLabel label = new JLabel();
		label.setText("TicTacToe");
		label.setIcon(icon);	
		
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Kalam", Font.CENTER_BASELINE, 50));
		label.setIconTextGap(10);
		
		//label.setVerticalAlignment(JLabel.CENTER);
		//label.setHorizontalAlignment(JLabel.LEFT);	
		
		
		label.setHorizontalAlignment(JLabel.TRAILING);
		
		label.setHorizontalTextPosition(JLabel.RIGHT);
		label.setVerticalTextPosition(JLabel.CENTER);
		
		header.add(label);
		*/

