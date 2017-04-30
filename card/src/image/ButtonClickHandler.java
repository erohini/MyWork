package image;

import javax.swing.*;
import java.awt.event.*;

public class ButtonClickHandler implements ActionListener {

	IconButtonFrame frame;
	
	public ButtonClickHandler(IconButtonFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source instanceof JButton) {
			JButton button = (JButton)source;
			String message = button.getActionCommand();
			JTextField field = frame.getTextField();
			field.setText(message);
		}
	}
}

