package frame;

import java.awt.*;

import javax.swing.*;
public class Grid extends JFrame{

	JFrame frame=new JFrame();
	JTextField text;
	JButton[] buttons;
	JPanel panel;
	
	public Grid() {
		frame.setTitle("Card Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 400);
		//setLayout(new BorderLayout());
		
		
		buttons = new JButton[3];
		String[] str={"Start","Relax","magic"};
		
		panel = new JPanel();
		for (int i = 0; i < 3; i++) {
			buttons[i] = new JButton(str[i]);
			panel.add(buttons[i]);
		}
		frame.add(panel, BorderLayout.SOUTH);
		
		/*text = new JTextField(15);
		text.setFont(new Font("TimesRoman", Font.BOLD, 24));
		text.setHorizontalAlignment(JTextField.CENTER);
		add(text);*/
		
	}
	public JButton[] getButtons() {
		return buttons;
	}
	
	//public JTextField getTextField() {
		//return text;
	//}
	public void Gui()
    {
		buttons=new JButton[16];
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(250, 400);
        //frame.setSize(300,400);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel( new GridLayout(4, 4) );
        frame.add(panel, BorderLayout.CENTER);

        ImageIcon icon;
        for(int i = 0; i < 16; i++)
        {
            buttons[i] = new JButton(new ImageIcon(getClass().getResource("/images/ganesha.jpg")));
            panel.add(buttons[i]);
        }

        frame.setVisible(true);

    }

}
