package majorProject;

 	import java .awt.*;
        import javax.swing.*;
         import java.awt.event.*;
         import javax.swing.event.*;import java.util.*;
import java.io.IOException;
import java.net.*;
import java.rmi.*;
       public class df extends JFrame implements ActionListener,ItemListener
 {
	   JTextField jt,jt1,jt2;
	JLabel w1,l3,l4,l5,l6,l7,l8,l9,w2,l41;
   JButton b,b1,b2,b3,b4,x1,b14,b21;
   java.awt.List l1,l2,lq3,v,dl;
   Container c;JPanel p;

  public df()
{
   
   super("REMOTE DEPLOYMENT");c=getContentPane();
  
 Box j=Box.createVerticalBox();
 p=new JPanel();

   l3=new JLabel("                SOFTWARE DEPLOYMENT");p.add(l3);j.add(p);

 p=new JPanel();
  w1=new JLabel("enter the ip address to add to IP List"); p.add(w1); j.add(p);
 jt=new JTextField(25);p.add(jt);
  jt2=new JTextField("2000",25);p.add(jt2);

  j.add(p); p=new JPanel();
  b=new JButton("ADD");b.addActionListener(this);p.add(b);b1=new JButton("DEL");b1.addActionListener(this);p.add(b1);j.add(p);l1=new java.awt.List();
    p.add(l1);l1.addItemListener(this);l1.setBackground(Color.white);l1.setForeground(Color.blue);j.add(p);

p=new JPanel();l5=new JLabel(" ");l6=new JLabel("");p.add(l5);p.add(l6);j.add(p); 
p=new JPanel();
w2=new JLabel("enter the softwares to deploy to remote hosts");p.add(w2);j.add(p);
  jt1=new JTextField(25);p.add(jt1);j.add(p); 
   l4=new JLabel(""); 

  p.add(l4);


   x1=new JButton("BROWSE");

  p.add(x1);j.add(p);x1.addActionListener(new OpenL());


 b3=new JButton("ADD");b3.addActionListener(this);p.add(b3);b4=new JButton("DEL");b4.addActionListener(this);p.add(b4);j.add(p);
 p=new JPanel();
  l41=new JLabel("select the key strokes for the software"); p.add(l41);j.add(p);

p=new JPanel(); JLabel l3=new JLabel("");p.add(l3);j.add(p);
    p=new JPanel();
l2=new java.awt.List();
    

   p.add(l2);l2.addItemListener(this);l2.setBackground(Color.white);l2.setForeground(Color.blue);//j.add(p);
 
 lq3=new java.awt.List();lq3.addItem("ENTER");lq3.addItem("SHIFT");lq3.addItem("TAB");
   
  lq3.addItem("A");lq3.addItem("B");lq3.addItem("C");lq3.addItem("D");
lq3.addItem("E");lq3.addItem("F");lq3.addItem("G");lq3.addItem("H");
lq3.addItem("I");lq3.addItem("J");lq3.addItem("K");lq3.addItem("L");
lq3.addItem("M");lq3.addItem("N");lq3.addItem("O");lq3.addItem("P");
lq3.addItem("Q");lq3.addItem("R");lq3.addItem("S");lq3.addItem("T");
lq3.addItem("U");lq3.addItem("V");lq3.addItem("W");lq3.addItem("X");
lq3.addItem("Y");lq3.addItem("Z"); 

   p.add(lq3);lq3.addItemListener(this);lq3.setBackground(Color.white);lq3.setForeground(Color.blue);//j.add(p);

dl=new java.awt.List();
p.add(dl);
 


v=new java.awt.List();
    

   p.add(v);v.addItemListener(this);v.setBackground(Color.white);v.setForeground(Color.blue);j.add(p);c.add(j);
 

 b14=new JButton("DEL");b14.addActionListener(this);p.add(b14); j.add(p);

  

b2=new JButton("deploy");b2.addActionListener(this);p.add(b2);j.add(p);
 p=new JPanel(); JLabel l9=new JLabel("");p.add(l9);j.add(p);  
 

   b21=new JButton("HOME");b21.addActionListener(this);p.add(b21);
setSize(800,600);setVisible(true);
}
  public void actionPerformed(ActionEvent e)
{    if(e.getSource()==b14)
         {

  
        try
          {

          v.remove(v.getSelectedIndex());
  //JOptionPane.showMessageDialog(null,v.countItems());for(int u=0;u<=v.countItems()-1 ;u++){JOptionPane.showMessageDialog(null,v.getItem(u));}
          }
    catch(Exception tb)
{  JOptionPane.showMessageDialog(null,"Ip address list is empty or you have not selected List to delete");
 
}
}

if(e.getSource()==b3)
{
 l2.addItem(jt1.getText());jt1.setText(""); 
}
 if(e.getSource()==b4)
{

try
{

    

  l2.remove(l2.getSelectedIndex());
  //JOptionPane.showMessageDialog(null,l2.countItems());for(int u=0;u<=l2.countItems()-1 ;u++){JOptionPane.showMessageDialog(null,l2.getItem(u));}
}catch(Exception tw)
{  JOptionPane.showMessageDialog(null,"Ip address list is empty or you have not selected List to delete");
 
}

}
if(e.getSource()==b2)
{  	

	int keyinput[][]=new int[v.countItems()][2];
	
	for(int i=0;i<v.countItems();i++)
	{
		int val=0;
		
		if(v.getItem(i).equals("ENTER"))
		val=10;
		else if(v.getItem(i).equals("ALT"))
		val=18;
		else if(v.getItem(i).equals("TAB"))
		val=9;
		else if(v.getItem(i).equals("SHIFT"))
		val=0;
		else
		val=(int)v.getItem(i).charAt(0);				

		keyinput[i][0]=val;
		keyinput[i][1]=Integer.parseInt(dl.getItem(i));


	}	
		try
		{
			System.out.println(jt1.getText());

			String url = "//localhost:1099/RObjectServer";
			intf intf1 = (intf)Naming.lookup(url);
			intf1.deploy(keyinput,jt1.getText());
			System.out.println(jt1.getText());

		}
		catch(Exception e2)
		{
		System.out.println(e2);
		}
} 
   if(e.getSource()==b21)
 {
setVisible(false); //new r();
}

if(e.getSource()==b)
   
{
l1.addItem(jt.getText());jt.setText("");}

if(e.getSource()==b1)
{
    try
{

    

  l1.remove(l1.getSelectedIndex());
  //JOptionPane.showMessageDialog(null,l1.countItems());for(int u=0;u<=l1.countItems()-1 ;u++){JOptionPane.showMessageDialog(null,l1.getItem(u));}
}catch(Exception t)
{  JOptionPane.showMessageDialog(null,"Ip address list is empty or you have not selected List to delete");
 
}}}

 public void itemStateChanged(ItemEvent ex)
{ 
   if(ex.getSource()==lq3)
{   

    v.addItem(lq3.getSelectedItem());
     dl.addItem(jt2.getText());	
}



} 
 class dx 
{
  
 public dx() 
{ 

  try{


    
 
    }

catch(Exception ew)
{
}

}
}


class OpenL implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JFileChooser c = new JFileChooser();
            int rVal = c.showOpenDialog(df.this);
      if(rVal == JFileChooser.APPROVE_OPTION) {
        jt1.setText(c.getSelectedFile().toString());
        
      }
      
    }
  }
public static void main(String args[])
{
  df d1=new df();
}
}
