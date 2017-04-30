package gui1;

import java.awt.*;
import java.awt.event.*;

public class Gui1 {

	Frame f;
	Label l;
	TextField t;
	BorderLayout bl;
	Button b;
	//Panel p;
	int count=0;
	public Gui1() {
		//f.setLayout(new FlowLayout());
		Frame f=new Frame();
		f.setSize(250, 100);
		f.setTitle("Sample");
		//p=new Panel();
		//p.setLayout(new BorderLayout());
		
		t=new TextField("0");
		//t.setPreferredSize(new Dimension(10,5));
		
		t.setEditable(false);
		f.add(t,BorderLayout.CENTER);
		
		
		l=new Label("Counter");
		f.add(l,BorderLayout.WEST);
		
		b=new Button("Count");
		///b.setPreferredSize(new Dimension(20,10));
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				count++;
				t.setText(count+ " ");
			}
		});
		f.add(b, BorderLayout.EAST);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Gui1 g=new Gui1();
	}

}
