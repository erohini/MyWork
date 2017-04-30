package image;

import java.awt.*;

import javax.swing.*;

public class IconButtonFrame extends JFrame {
	
	JButton[] buttons;
	JTextField text;
	
	public IconButtonFrame(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,400);
        
		setLayout(new BorderLayout());
		
		String[] stateNames = {"Jack of Clubs", "Queen of Diamonds",
				               "King of Hearts", "Ace of Spades"};
		String[] imageNames = {"jack_of_clubs.png", "queen_of_diamonds.png",
				               "king_of_hearts.png", "ace_of_spades.png"};
		String imageFolder = "images/cards/";
		String[] locations = {BorderLayout.EAST, BorderLayout.SOUTH,
							  BorderLayout.WEST, BorderLayout.NORTH};
		
		buttons = new JButton[stateNames.length];
		for (int i = 0; i <buttons.length; i++) {
			ImageIcon icon = new ImageIcon(imageFolder+imageNames[i]);
			Image img = icon.getImage();
			img = img.getScaledInstance(20, 50, Image.SCALE_SMOOTH);
			buttons[i] = new JButton(new ImageIcon(img));
			buttons[i].setActionCommand(stateNames[i]);
			add(buttons[i], locations[i]);
		}
		
		text = new JTextField(20);
		text.setHorizontalAlignment(JTextField.CENTER);
		text.setFont(new Font("Arial", Font.BOLD, 32));
		
		text.setForeground(Color.blue);
		add(text, BorderLayout.CENTER);
	}
	
	public JButton[] getButtons() {
		return buttons;
	}
	
	public JTextField getTextField() {
		return text;
	}
}

