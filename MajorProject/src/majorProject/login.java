package majorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.JTabbedPane.*;
import javax.swing.plaf.ColorUIResource;
public class login extends JFrame implements ActionListener
{
	JTextField tusername;
	JPasswordField tpassword;
	JLabel luser,lpassword;
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	ImageIcon bannericon=new ImageIcon(getClass().getResource("/icons/banner2.gif"));
	JLabel bannerlabel=new JLabel(bannericon);
	ImageIcon ok_default = new ImageIcon(getClass().getResource("/icons/signin.gif"));
	ImageIcon ok_mouseover = new ImageIcon(getClass().getResource("/icons/signin1.gif"));
	ImageIcon clear_default = new ImageIcon(getClass().getResource("/icons/clear.gif"));
	ImageIcon clear_mouseover = new ImageIcon(getClass().getResource("/icons/clear1.gif"));
//	ImageIcon img_rotator=new ImageIcon(getClass().getResource("icons/rotator.gif"));
//	JLabel rotator=new JLabel(img_rotator);
	JButton ok,clear;
	login()
	{    
		getContentPane().setLayout(new FlowLayout());
		p3.setLayout(new GridBagLayout());
		getContentPane().setBackground(Color.WHITE);
		p1.setBackground(Color.WHITE);
		p1.setLayout(new GridBagLayout());
		p3.setLayout(new GridBagLayout());
		p4.setLayout(new GridBagLayout());
		p2.setLayout(new GridLayout(1,2));
		GridBagConstraints c1 = new GridBagConstraints();
		tusername=new JTextField(12);
		tpassword=new JPasswordField(12);
  	    luser=new JLabel("USERNAME :");
		lpassword=new JLabel("PASSWORD :");
		c1.gridy = 0;
		c1.ipady=3;
		c1.insets = new Insets(10,0,0,0); 
		p1.add(luser,c1);
		c1.gridx = 1;
		p1.add(tusername,c1);
		c1.gridy = 1;
		c1.gridx = 0;
		p1.add(lpassword,c1);
		c1.gridx = 1;
		p1.add(tpassword,c1);
		c1.gridy = 2;
		c1.gridx = 0;
		tpassword.setEchoChar('*');
		ok=new JButton(ok_default);
		ok.setRolloverIcon(ok_mouseover);
		
		ok.setBorder(null);
		clear=new JButton(clear_default);
		clear.setRolloverIcon(clear_mouseover);
		
		clear.setBorder(null);
		c1.gridx = 0;
		c1.anchor = GridBagConstraints.EAST;
		p1.add(ok,c1);
		c1.gridx = 1;
		c1.anchor = GridBagConstraints.CENTER;
		p1.add(clear,c1);
		//p2.add(rotator);
		c1.gridy = 0;
		c1.anchor = GridBagConstraints.CENTER;
		p4.add(p1,c1);
		p2.add(p4);
		c1.gridy = 0;
		p3.add(bannerlabel,c1);
		c1.gridy = 1;
		p3.add(p2,c1);
		color();
		EtchedBorder b1=new EtchedBorder(EtchedBorder.RAISED );
		p1.setBorder(b1);
		getContentPane().add(p3);
		ok.addActionListener(this);
		clear.addActionListener(this);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		    
		
	}
void color()
	{
		 Color c=new Color(185,255,220);
		  Color c1=new Color(94,174,255);
getContentPane().setBackground(c);
p1.setBackground(c1);
p2.setBackground(c);
p3.setBackground(c);
p4.setBackground(c);
ok.setBackground(Color.WHITE);
clear.setBackground(Color.WHITE);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==ok)
		{
			if(((tusername.getText()).equals("admin"))&&((tpassword.getText()).equals("admin")))
			{
			
			frame5 f=new frame5();
			f.setSize(800,800);
			f.setVisible(true);
			this.dispose();
			
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Invalid Username/Password \n login denied");
			}
		}
		if(ae.getSource()==clear)
		{
			tusername.setText("");
			tpassword.setText("");
	
		}
	}
		
		
public static void createAndShowGUI() {
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
       
        
    }


   public static void main(String[] args)
	   {
		 
	     
		createAndShowGUI();   
		login frame = new login();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
		frame.setSize(800,800);
		frame.setVisible(true);
		
      }


	}
