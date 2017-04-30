package majorProject;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

class xyz extends JPanel implements ActionListener
{
	ImageIcon image=new ImageIcon("icons/1.gif");
	JLabel data=new JLabel(image);
	Color c=new Color(185,255,220);
	JLabel l1,l2;
	JTextField t1;
	JButton b1,b2;
	xyz()
	{
			
		setBackground(c);
		setSize(800,600);
		JPanel j1=new JPanel();
		j1.setBackground(c);
		j1.setLayout(new FlowLayout());
		l1=new JLabel("select the file");
		t1=new JTextField(20);
		b1=new JButton("Browse");
		b1.addActionListener(this);
	
		j1.add(l1);j1.add(t1);j1.add(b1);
		JPanel j2=new JPanel();
		j2.setBackground(c);
		l2=new JLabel();
		j2.add(l2);
		JPanel j3=new JPanel();
		j3.setBackground(c);
		b2=new JButton("Submit");
		b2.addActionListener(this);
		j3.add(b2);
		JPanel j4=new JPanel();
		j4.setBackground(c);
		j4.setLayout(new GridLayout(4,0));
		j4.add(j2);j4.add(j1);j4.add(j3);
		add(j4);	
			
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			open();
		}
		else if(e.getSource()==b2)
		{

		try
		{
			Runtime Rt = Runtime.getRuntime();		
			Process p= Rt.exec("net share y="  + t1.getText());
			

			System.out.println("s" + "net share x="  + t1.getText());
		}
		catch (IOException e2)
		{
			System.out.println("e");


		}

		}	
	}
	public void open()
	{
		try
		{
			JFileChooser c1=new JFileChooser();
			c1.setCurrentDirectory(new File("."));
			
			c1.setFileFilter(new javax.swing.filechooser.FileFilter()
			{
				public boolean accept(File f)
				{
					return f.getName().toLowerCase().endsWith(".txt")||f.isDirectory();
				}
				public String getDescription()
				{
					return "TXT FILES";
				}
			});
			int r=c1.showOpenDialog(null);
			if(r==JFileChooser.APPROVE_OPTION)
			{
				String fileName=c1.getSelectedFile().getPath();
				t1.setText(fileName);
			}
		}
		catch(Exception e)
		{
		}
	}
	public static void main(String args[])
	{
		xyz x1=new xyz();
		x1.setSize(400,400);
		x1.setVisible(true);
	}
}