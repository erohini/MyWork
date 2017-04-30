package image;

import javax.swing.*;

public class ShowIconButtons {

	public static void main(String[] args) {
		IconButtonFrame frame = new IconButtonFrame("Butons with icons");
		
		JButton[] buttons = frame.getButtons();
		
		ButtonClickHandler handler = new ButtonClickHandler(frame);
		
		for (JButton b : buttons)
			b.addActionListener(handler);
		
		frame.setVisible(true);
	}
}

