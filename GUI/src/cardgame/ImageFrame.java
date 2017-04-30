package cardgame;

import java.awt.*;

import javax.swing.*;

public class ImageFrame extends JFrame {
	
	public ImageFrame(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(600,500);
		setLayout(new BorderLayout());
		
		ImageIcon icon = new ImageIcon(getClass().getResource("/images/ganesha.jpg"));
						
		JLabel label = new JLabel(icon);
		
		add(label, BorderLayout.CENTER);
	}
}

