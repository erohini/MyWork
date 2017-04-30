package majorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.util.*;
class process extends JPanel implements ActionListener 
{
	JPanel inputpanel=new JPanel();
	JPanel buttonpanel=new JPanel();
	JPanel mainpanel=new JPanel();
	JPanel textpanel=new JPanel();
	JTextField sysid=new JTextField(15);
	JButton ok;
	ImageIcon ok_default = new ImageIcon("icons/okbutton.gif");
	ImageIcon ok_mouseover = new ImageIcon("icons/okbutton1.gif");
	Color c = new Color(185, 255, 220);
	Color c1=new Color(200,204,200);
	process()
		{
			setLayout(new GridBagLayout());
			GridBagConstraints c1 = new GridBagConstraints();
			mainpanel.setLayout(new GridLayout(2,1));
			inputpanel.setLayout(new GridLayout(1,2));
			JLabel lab=new JLabel("ENTER THE SYSTEM IP ADDRESS");
			inputpanel.add(lab);
			textpanel.add(sysid);
			inputpanel.add(textpanel);
			ok = new JButton(ok_default);
			ok.setRolloverIcon(ok_mouseover);
			ok.setBackground(Color.white);
			ok.setBorder(null);
			buttonpanel.add(ok);
			mainpanel.add(inputpanel);
			mainpanel.add(buttonpanel);
			c1.anchor = GridBagConstraints.CENTER;
			add(mainpanel,c1);
			setcolor();
			ok.addActionListener(this);

		}
	
	public void actionPerformed(ActionEvent e)
	{

		if (e.getSource() ==ok)
		{
			if ((sysid.getText().length() == 0))
				JOptionPane.showMessageDialog(null, "please enter system ipaddress ");
			else
			{
	String str;
	StringTokenizer st;
	int ip=0;
	byte status=0; int x=0;
	int count=0;
	try
	{
		if(!sysid.getText().equals("localhost"))
	{
		str=sysid.getText();
		st=new StringTokenizer(str,".");
		ip=Integer.parseInt(st.nextToken());
	while(st.hasMoreTokens())
	{
		
	count++;
	int tmp=Integer.parseInt(st.nextToken());
	if(tmp<256)
	status=1;
	else
	{
	status=0;
	x++;	
	}
	}
	}


	if(((status==1)&&(x==0)&&(count==3))||(sysid.getText().equals("localhost")))
	{
	
	if((ip>=0&&ip<=127)||(ip>=128&&ip<=191)||(ip>=192&&ip<=223)||(ip>=224&&ip<=239)||(ip>=240&&ip<=255)||(sysid.getText().equals("localhost")))
	{
		TableDemo frame = new TableDemo(sysid.getText());
	}
	else 
JOptionPane.showMessageDialog(null,"Invalid IpAddress");
}
else
JOptionPane.showMessageDialog(null,"Invalid IpAddress");
}

catch(Exception exc)
{
	exc.printStackTrace();
JOptionPane.showMessageDialog(null,"Destination  "+sysid.getText()+" Unreachable");
}
				
				
			}
		}

		
		
	}
void setcolor()
	{

		setBackground(c);
		inputpanel.setBackground(c);
		buttonpanel.setBackground(c);
		mainpanel.setBackground(c);
		textpanel.setBackground(c);
		sysid.setBackground(c1);
	}


	public static void main(String[] args) 
	{
	process p=new process();
	p.setSize(400,400);
	p.setVisible(true);
	
	}
}
