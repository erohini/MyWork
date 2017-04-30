package majorProject;

import java.rmi.*;
import java.rmi.server.*;
import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.TableColumn;
import java.util.*;
public class searchframe2 extends JFrame implements ActionListener,ListSelectionListener,MouseListener,MouseMotionListener
{
	String[] columnNames = {"Name","Path","type","Size"};
	String found[]=new String[10];
	public String path,name;
	int fcount=0;
	LinkedList l;
	Iterator it;
	ImageIcon bannericon=new ImageIcon("/icons/banner3.gif");
	ImageIcon ok_default = new ImageIcon("/icons/search_button.gif");
	ImageIcon ok_mouseover = new ImageIcon("/icons/search_button1.gif");
	JPanel inputpanel=new JPanel();
	JPanel mainpanel=new JPanel();
	JPanel buttonpanel=new JPanel();
	JPanel leftpanel=new JPanel();
	JPanel textpanel=new JPanel();
	JPanel textpanel1=new JPanel();
	JPanel resultpanel=new JPanel();
	JPanel textpanel3 = new JPanel();
	JPanel ip = new JPanel();
	JPanel labelpanel=new JPanel();
	JButton searchnow;
	JTextField tsearch,tdrive,tip;
	JTable t1;
	DefaultTableModel myModel;
	JSplitPane splitPane,splitPane1;
	int vert=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
	int hor=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
	JScrollPane scrollPane;
	openframe f; 
	searchframe2()
	{
	super("SEARCH");
	 getContentPane().setLayout(new BorderLayout());
	inputpanel.setLayout(new GridLayout(9,1));
	labelpanel.setLayout(new GridLayout(2,1));
	JLabel j1=new JLabel(bannericon);
    getContentPane().add(j1,BorderLayout.NORTH);
	myModel = new DefaultTableModel(columnNames,30);
	t1 = new JTable(myModel);
    t1.setPreferredScrollableViewportSize(new Dimension(500, 70));
	t1.setCellSelectionEnabled(true);
	t1.setRowHeight(25);
	t1.setColumnSelectionAllowed(false);
	t1.setGridColor(Color.blue);
	t1.setShowVerticalLines(false);
    t1.setShowHorizontalLines(false); 
	t1.setSelectionForeground(Color.blue);
	TableCellRenderer headerRenderer = t1.getTableHeader().
    getDefaultRenderer();
	ListSelectionModel listMod =  t1.getSelectionModel();
   listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   listMod.addListSelectionListener(this);
    scrollPane = new JScrollPane(t1);
	inputpanel.add(new JLabel("        enter the ip address"));
	tip = new JTextField(12);
	textpanel3.add(tip);
	inputpanel.add(textpanel3);
	inputpanel.add(new JLabel("        Search for files or Folders named"));
	tsearch=new JTextField(12);
	textpanel.add(tsearch);
	tdrive=new 	JTextField(12);
	textpanel1.add(tdrive);
	inputpanel.add(textpanel);
    inputpanel.add(new JLabel("         look in"));
	inputpanel.add(textpanel1);
	searchnow=new JButton(ok_default);
	searchnow.setRolloverIcon(ok_mouseover);
	Color col = new Color(185, 255, 220);
	searchnow.setBackground(col);
	searchnow.setBorder(null);
	buttonpanel.add(searchnow);
	inputpanel.add(buttonpanel);
	Color c=new Color(83,83,255);
	leftpanel.add(inputpanel);
	resultpanel.setMinimumSize(new Dimension(70, 70));
	f= new openframe();
	splitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,f,scrollPane);
	splitPane1.setDividerSize(7);
    splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                                   leftpanel,splitPane1);
    splitPane.setDividerSize(7);
    splitPane.setOneTouchExpandable(true);
    splitPane.setContinuousLayout(true);
    getContentPane().add(splitPane, BorderLayout.CENTER);
	setcolor();
	setSize(720,600);
	System.out.println("Welcome");
	searchnow.addActionListener(this);
	setVisible(true);
	
	} 
	


		void setcolor()
	 {
		Color c1=new Color(224,226,228);
  	 	getContentPane().setBackground(Color.white);  
		inputpanel.setBackground(Color.white);  
		leftpanel.setBackground(Color.white);
		mainpanel.setBackground(Color.white);  
		textpanel.setBackground(Color.white);  
		textpanel1.setBackground(Color.white);
		textpanel3.setBackground(Color.white); 
		buttonpanel.setBackground(Color.white);  
		splitPane.setBackground(Color.white);
		resultpanel.setBackground(Color.white);
		labelpanel.setBackground(Color.white);
		tsearch.setBackground(c1);
		tdrive.setBackground(c1);
		tip.setBackground(c1);
		createAndShowGUI();
	}
  
private static void createAndShowGUI() 
  {
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        

	 
    }

	
public void actionPerformed(ActionEvent ae) 
	{
		if ((tip.getText().length() == 0) || (tdrive.getText().length() == 0))
			JOptionPane.showMessageDialog(null, "please enter system ipaddress and path");
		else
		{
		String str;
	StringTokenizer st;
	int ip=0;
	byte status=0; int x=0;
	int count=0;
		
		 try
	{
	if(!tip.getText().equals("localhost"))
	{
		str=tip.getText();
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
	if(((status==1)&&(x==0)&&(count==3))||(tip.getText().equals("localhost")))
	{
	
	if((ip>=0&&ip<=127)||(ip>=128&&ip<=191)||(ip>=192&&ip<=223)||(ip>=224&&ip<=239)||(ip>=240&&ip<=255)||(tip.getText().equals("localhost")))
	{
	
        	try
			{
				for (int i = 0; i < myModel.getRowCount(); i++)
				{
					System.out.println("Remove");
					myModel.removeRow(0);
				}
				myModel.setRowCount(0);
				getContentPane().remove(splitPane);
				getContentPane().add(splitPane, BorderLayout.CENTER);
				System.out.println("fdrtgretretretret");
				String url = "//" + tip.getText() + ":1099/RObjectServer";
				intf intf1 = (intf)Naming.lookup(url);
                l = intf1.search(tsearch.getText(), tdrive.getText());
                it = l.iterator();
				while (it.hasNext())
				{
					String s[] = (String[])it.next();
					myModel.addRow(s);
					System.out.println("");
				}
				
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(null,"Destination  "+tip.getText()+" Unreachable");
			}

}
else 
JOptionPane.showMessageDialog(null,"InValid IPAddress");
}
else
JOptionPane.showMessageDialog(null,"InValid IPAddress");
}

catch(Exception e)
{
JOptionPane.showMessageDialog(null,"Destination  "+tip.getText()+" Unreachable");
}

		
		}
	}

	
public void valueChanged(ListSelectionEvent e) 
	{
	ListSelectionModel lsm = (ListSelectionModel)e.getSource();   
       int row=lsm.getMinSelectionIndex();
	  
	path = (String)myModel.getValueAt(row,1);
	name=(String)myModel.getValueAt(row,0);
	System.out.println(path+"\\"+name);
	f.setSource(path,name);
	}

public void mouseClicked(MouseEvent me)
	{
		
		/*path="explorer.exe  "+path+"\\"+name;
		open file=new open(path); 
		System.out.println("dfdgdf");*/


	}
	
	public void mouseEntered(MouseEvent me)
	{
	}
public void mouseExited(MouseEvent me)
	{
	}
	public void mousePressed(MouseEvent me)
	{
	}
	public void mouseReleased(MouseEvent me)
	{
	}
	public void mouseMoved(MouseEvent me)
	{
	//selectedpath.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseDragged(MouseEvent me)
	{
	}
	 public static void main(String[] args) 
	 {
		 searchframe2 frame=new searchframe2();
		 frame.setVisible(true);
	 }
	
}
