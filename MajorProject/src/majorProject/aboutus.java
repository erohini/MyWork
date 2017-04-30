package majorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
public class aboutus extends JFrame
{
	ImageIcon image=new ImageIcon("icons/aboutusdata.gif");
	JLabel data=new JLabel(image);
	Color c=new Color(185,255,220);
	aboutus()
	{	
	 getContentPane().add(data);	
		setBackground(c);
		setSize(308,249);
		setVisible(true);
		
	}
	public static void main(String arg[]) throws Exception
{
new aboutus();
}
}
