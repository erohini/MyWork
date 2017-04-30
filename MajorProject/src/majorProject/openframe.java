package majorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.rmi.*;
import java.rmi.server.*;
import javax.swing.JFileChooser.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.imageio.stream.*;
class openframe extends JPanel implements ActionListener,java.io.Serializable 

{
JPanel mainpanel=new JPanel();
JRadioButton download;
ButtonGroup bg=new ButtonGroup();
JButton b1;
ImageIcon ok_default = new ImageIcon("icons/ok_button.gif");
ImageIcon ok_mouseover = new ImageIcon("icons/ok_button1.gif");
String addr;
	String filename = "";
String source = "";
	File dest;
	
 openframe()
  {
	 //String ip,String src 
	  
	  addr = "localhost";
	setLayout(new FlowLayout());
	mainpanel.setLayout(new GridLayout(3,1,10,10));
	download=new JRadioButton("DOWNLOAD",true);
	bg.add(download);
	b1 = new JButton(ok_default);
	b1.setRolloverIcon(ok_mouseover);
	b1.setBackground(Color.white);
	b1.setBorder(null);
	mainpanel.add(download);
	mainpanel.add(b1);
	add(mainpanel);
	setcolor();
	
	b1.addActionListener(this);
  	
}
	void setcolor()
	{
		setBackground(Color.white);
		mainpanel.setBackground(Color.white);
		download.setBackground(Color.white);
		


	}
public void setSource(String path,String name)
	{
		this.source = path + "\\" + name;
		filename=name;
		System.out.println("setsource   :"+ source);
	}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
	System.out.println("ACTION PERFORMED "+source);
	if (download.isSelected())
	{
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Save");
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
		  {
			//source.lastIndexOf('\\')
			  
			
			dest= new File(chooser.getSelectedFile()+"/"+filename);
			System.out.println("dest  :" + dest);
			System.out.println("source  :" + source);
		
		try
		{
		String url = "//"+addr+":1099/RObjectServer";
		intf intf1 = (intf)Naming.lookup(url);
		StringBuffer sb=new StringBuffer(source);

		String ext = sb.substring(sb.toString().length() - 3);

		System.out.println("--" + ext + "--))" + source);
			if(ext.equals("jpg") || ext.equals("gif"))
			{
					System.out.println("1");
					 File infile=intf1.downloadimage(source);
					 BufferedImage input = ImageIO.read(infile);
					System.out.println("2");
   					File outputFile = new File(dest.toString());
					System.out.println("3");
   					ImageIO.write(input, "PNG", outputFile);
					System.out.println("4");
			}
			else if (ext.equals("txt") || ext.equals("java"))
			{
				StringBuffer str = intf1.downloadfile(source);
				System.out.println(str);
				FileOutputStream outfile = new FileOutputStream(dest);
				outfile.write(str.toString().getBytes());
				outfile.close();
			}
			else
			{
				System.out.println("1");
				byte b[] = intf1.downloadbyte(source);
				FileOutputStream outfile = new FileOutputStream(dest);
				outfile.write(b);
				outfile.close();

			}

		}
		catch (Exception e1)
		{
			System.out.println(e1);
		}
	}
	}
	
	{
		JFileChooser chooser = new JFileChooser();
		int status = chooser.showOpenDialog(new frame5());
		chooser.setBackground(Color.pink);
		if (status == JFileChooser.APPROVE_OPTION)
		{
			dest = chooser.getSelectedFile();
			System.out.println("dest  :" +dest);
			String src=source.substring(source.length() - 3,source.length());
			
		
		try
		{
			
			System.out.println("fdrtgretretretret");
			String url = "//"+addr+":1099/RObjectServer";
			intf intf1 = (intf)Naming.lookup(url);

			StringBuffer sb=new StringBuffer(dest.toString());
			String ext = sb.substring(sb.toString().length() - 3);

			System.out.println("--" + ext + "--))" );
			System.out.println("src  :" +src);
			if(ext.equals(src))
			{
			if (ext.equals("jpg") || ext.equals("gif"))
			{
				File f = new File(dest.toString());
				intf1.storeImage(source,f);
			}
			else if (ext.equals("txt") || ext.equals("java"))
			{
				sb = new StringBuffer("");
				FileInputStream in = new FileInputStream(dest.toString());
				DataInputStream din = new DataInputStream(in);
				String x = "";
				while ((x = din.readLine()) != null)
				{
					sb.append(x + "\n");
				}
				intf1.storeData(source, sb);
			}
			else
			{
				File f = new File(dest.toString());
				intf1.storeByte(source, f);
			}
		  }
		   else
		      JOptionPane.showMessageDialog(null,"File Mismatch");


		}
		catch (Exception e1)
		{

		}
	}
}

}
}
public static void main(String args[])
{
openframe o=new openframe();
o.setSize(400,400);
o.setVisible(true);
}



}