package frame;

import javax.swing.JButton;

public class Main {

	public static void main(String[] args) {
		Grid frame=new Grid();
		//ButtonClickHandler bch=new ButtonClickHandler(frame);
		
		/*JButton[] buttons = frame.getButtons();
		for (int i = 0; i < buttons.length; i++)
			buttons[i].addActionListener(bch);*/
		
		frame.Gui();
		
		frame.setVisible(true);
	}

}
