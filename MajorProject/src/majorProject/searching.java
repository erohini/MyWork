package majorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
 
	
public class searching extends JDialog
{
	
	JLabel label;
	JLabel text;
	ImageIcon searching=new ImageIcon("/icons/searching.gif");
	JPanel p=new JPanel();

	searching()
	{
		setEnabled(false);
		getContentPane().setLayout(new BorderLayout());
		label = new JLabel(searching);
		text = new JLabel("Serching Please Wait....");
		getContentPane().add(label, BorderLayout.CENTER);
		p.add(text);
		getContentPane().add(p, BorderLayout.SOUTH);
		getContentPane().setBackground(Color.white);
		p.setBackground(Color.white);
		setSize(420, 220);
		
	}
	
		
public static void main(String arg[]) throws Exception
{
searching s=new searching();
s.setVisible(true);
}
}
