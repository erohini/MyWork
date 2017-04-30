package majorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.JTabbedPane.*;
import javax.swing.plaf.ColorUIResource;


public class frame5 extends JFrame implements ActionListener,MouseMotionListener
	{
	  ImageIcon bannericon=new ImageIcon(getClass().getResource("/icons/banner2.gif"));
	  ImageIcon icontroller=new ImageIcon(getClass().getResource("/icons/controller1.gif"));
	  ImageIcon isearch=new ImageIcon(getClass().getResource("/icons/Search1.gif"));
	  ImageIcon ipriviledge=new ImageIcon(getClass().getResource("/icons/Privilege1.gif"));
	  ImageIcon iconfig=new ImageIcon(getClass().getResource("/icons/configuration1.gif"));
	  ImageIcon iprocess=new ImageIcon(getClass().getResource("/icons/process1.gif"));
	  ImageIcon ideploy=new ImageIcon(getClass().getResource("/icons/deploy1.gif"));
	  ImageIcon iaboutus=new ImageIcon(getClass().getResource("/icons/aboutus1.gif"));
	  ImageIcon iexit=new ImageIcon(getClass().getResource("/icons/exit1.gif"));
	  ImageIcon dcontroller=new ImageIcon(getClass().getResource("/icons/controller.gif"));
	  ImageIcon dsearch=new ImageIcon(getClass().getResource("/icons/Search.gif"));
	  ImageIcon dpriviledge=new ImageIcon(getClass().getResource("/icons/Privilege.gif"));
	  ImageIcon dconfig=new ImageIcon(getClass().getResource("/icons/configuration.gif"));
	  ImageIcon dprocess=new ImageIcon(getClass().getResource("/icons/process.gif"));
  	  ImageIcon ddeploy=new ImageIcon(getClass().getResource("/icons/deploy.gif"));
	  ImageIcon daboutus=new ImageIcon(getClass().getResource("/icons/aboutus.gif"));
	  ImageIcon dexit=new ImageIcon(getClass().getResource("/icons/exit.gif"));
	  ImageIcon next=new ImageIcon(getClass().getResource("/icons/Next1.gif"));
	  ImageIcon previous=new ImageIcon(getClass().getResource("/icons/Previous1.gif"));
	  ImageIcon scontroller=new ImageIcon(getClass().getResource("/icons/controller2.gif"));
	  ImageIcon ssearch=new ImageIcon(getClass().getResource("/icons/Search2.gif"));
	  ImageIcon spriviledge=new ImageIcon(getClass().getResource("/icons/Privilege2.gif"));
	  ImageIcon sconfig=new ImageIcon(getClass().getResource("/icons/configuration2.gif"));
	  ImageIcon sprocess=new ImageIcon(getClass().getResource("/icons/process2.gif"));
	  ImageIcon sdeploy=new ImageIcon(getClass().getResource("/icons/deploy2.gif"));
	  ImageIcon saboutus=new ImageIcon(getClass().getResource("/icons/aboutus2.gif"));
	  ImageIcon sexit=new ImageIcon(getClass().getResource("/icons/exit2.gif"));
	  
	  Color c=new Color(185,255,220);
	  Color c1=new Color(200,204,200);
	  Color c2=new Color(255,255,255);
	  JPanel mainpanel=new JPanel();
	  JPanel mainpanel1=new JPanel();
	  JTabbedPane tabbedPane = new JTabbedPane();
	  JPanel bannerpanel= new JPanel();  
	  JPanel panel1=new JPanel();
	  JPanel panel2=new JPanel();
	  JPanel panel3=new JPanel();
	  JPanel footpanel= new JPanel();  
	  JLabel bannerlabel=new JLabel(bannericon);
	  JButton lt,gt;
	 public frame5()
	  {
		  super("System Manager");
		  getContentPane().setLayout(new BorderLayout());
		  mainpanel.setLayout(new BorderLayout());
		  mainpanel.add(bannerlabel,BorderLayout.NORTH);
		  mainpanel1.setLayout(new GridLayout(2,1));
		  tabbedPane.addTab("",scontroller,new controller(),"ShutDown Restart Or Logoff Remote System");
          tabbedPane.setSelectedIndex(0);
		  tabbedPane.addTab("",dsearch,null,"Search for a specified file on remote system");
		  tabbedPane.addTab("",dpriviledge,new perm(),"change the previledge of the file");
		  tabbedPane.addTab("",dconfig,new config(),"get the configuration of the file");
		  tabbedPane.addTab("", dprocess,new process(),"Process Manager can be used to controll the remote process");
		//  tabbedPane.addTab("", ddeploy,null);
		  tabbedPane.addTab("",iaboutus,null);
		  tabbedPane.addTab("",dexit,null);
		  tabbedPane.setBorder(null);
		  mainpanel1.add(tabbedPane);
          lt=new JButton(previous);
		  gt=new JButton(next);
		  lt.setBorder(null);
		  gt.setBorder(null);
		  footpanel.add(lt);
		  footpanel.add(gt);
		  
		 
		  mainpanel1.add(footpanel);
		  setcolor();
		  mainpanel.add(mainpanel1,BorderLayout.CENTER); 
		  getContentPane().add(mainpanel);
		  int vert=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		  int hor=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		  JScrollPane jsp=new JScrollPane(mainpanel,vert,hor);
		  getContentPane().add(jsp,BorderLayout.CENTER);
		  lt.addActionListener(this);
		  gt.addActionListener(this);
		  tabbedPane.addMouseMotionListener(this);
		  tabbedPane.getModel().addChangeListener(
	   new ChangeListener() {
	      public void stateChanged(ChangeEvent e) 
		{
		  int selected=tabbedPane.getSelectedIndex();
        
		tabbedPane.setIconAt(0, dcontroller);
		tabbedPane.setIconAt(1, dsearch);
		tabbedPane.setIconAt(2, dpriviledge);
		tabbedPane.setIconAt(3, dconfig);
		tabbedPane.setIconAt(4, dprocess);
		//tabbedPane.setIconAt(5, ddeploy);
		tabbedPane.setIconAt(5, iaboutus);
		tabbedPane.setBackgroundAt(selected,c);
		if(selected==0)
			tabbedPane.setIconAt(0, scontroller);

		else if (selected == 1)
		{
			tabbedPane.setIconAt(1, ssearch);
			System.out.println("dfgdf");
			hide();
			new searchframe2();			
		}
		else if (selected == 2)
			tabbedPane.setIconAt(2, spriviledge);
		else if (selected == 3)
		{
			tabbedPane.setIconAt(3, sconfig);
			
		}
		else if (selected == 4)
		{
			tabbedPane.setIconAt(4, sprocess);


		}
	/*	else if (selected == 5)
			{
			tabbedPane.setIconAt(5, sdeploy);
			df d1=new df();
			}*/
		else if (selected == 5)
			{
			tabbedPane.setIconAt(5, saboutus);
			new aboutus();
			}
		else
		{
			JOptionPane jp = new JOptionPane();
			int res = jp.showConfirmDialog(null, "Are you sure you want to quit System Manager?", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (res == JOptionPane.YES_OPTION)
				System.exit(0);
			else
				tabbedPane.setSelectedIndex(5);
		}
		
         repaint();

		}

	    }
	);	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	
	}
	public void mouseMoved(MouseEvent me)
	{
	 
	// tabbedPane.setBackgroundAt(int index, Color background)
	if(tabbedPane.getBoundsAt(0).contains(me.getX(),me.getY())) 
		{
		tabbedPane.setIconAt(0, icontroller);
	   	}
		
	else if(tabbedPane.getBoundsAt(1).contains(me.getX(),me.getY())) 
		{
			tabbedPane.setIconAt(0, dcontroller);
			tabbedPane.setIconAt(1, isearch);
			tabbedPane.setIconAt(2, dpriviledge);
			tabbedPane.setIconAt(3, dconfig);
			tabbedPane.setIconAt(4, dprocess);
		//	tabbedPane.setIconAt(5, ddeploy);
	        tabbedPane.setIconAt(5, daboutus);
			tabbedPane.setIconAt(6, dexit);
			
	
		}
	else if(tabbedPane.getBoundsAt(2).contains(me.getX(),me.getY())) 
		{
		  tabbedPane.setIconAt(0, dcontroller);
		  tabbedPane.setIconAt(1, dsearch);
		  tabbedPane.setIconAt(2, ipriviledge);
		  tabbedPane.setIconAt(3, dconfig);
		  tabbedPane.setIconAt(4, dprocess);
	//	  tabbedPane.setIconAt(5, ddeploy);
		  tabbedPane.setIconAt(5, daboutus);
		  tabbedPane.setIconAt(6, dexit);
	   
		}
	else if(tabbedPane.getBoundsAt(3).contains(me.getX(),me.getY())) 
		{
		tabbedPane.setIconAt(0, dcontroller);
		tabbedPane.setIconAt(1, dsearch);
		tabbedPane.setIconAt(2, dpriviledge);
		tabbedPane.setIconAt(3, iconfig);
		tabbedPane.setIconAt(4, dprocess);
	//	tabbedPane.setIconAt(5, ddeploy);
		tabbedPane.setIconAt(5, daboutus);
		tabbedPane.setIconAt(6, dexit);
	
		}
		else if(tabbedPane.getBoundsAt(4).contains(me.getX(),me.getY())) 
		{
		  tabbedPane.setIconAt(0, dcontroller);
   		  tabbedPane.setIconAt(1, dsearch);
		  tabbedPane.setIconAt(2, dpriviledge);
		  tabbedPane.setIconAt(3, dconfig);
		  tabbedPane.setIconAt(4, iprocess);
	//      tabbedPane.setIconAt(5, ddeploy);
		  tabbedPane.setIconAt(5, daboutus);
		  tabbedPane.setIconAt(6, dexit);
		
	
		}
	/*	else if(tabbedPane.getBoundsAt(5).contains(me.getX(),me.getY())) 
		{
		  tabbedPane.setIconAt(0, dcontroller);
   		  tabbedPane.setIconAt(1, dsearch);
		  tabbedPane.setIconAt(2, dpriviledge);
		  tabbedPane.setIconAt(3, dconfig);
		  tabbedPane.setIconAt(4, dprocess);
	//	  tabbedPane.setIconAt(5, ideploy);
		  tabbedPane.setIconAt(5, daboutus);
		  tabbedPane.setIconAt(6, dexit);
		
	
		}*/
		else if(tabbedPane.getBoundsAt(6).contains(me.getX(),me.getY())) 
		{
		  tabbedPane.setIconAt(0, dcontroller);
   		  tabbedPane.setIconAt(1, dsearch);
		  tabbedPane.setIconAt(2, dpriviledge);
		  tabbedPane.setIconAt(3, dconfig);
		  tabbedPane.setIconAt(4, dprocess);
	   //	  tabbedPane.setIconAt(5, ddeploy);
		  tabbedPane.setIconAt(5, iaboutus);
		  tabbedPane.setIconAt(6, dexit);
		
	
		}
		else if(tabbedPane.getBoundsAt(7).contains(me.getX(),me.getY())) 
		{
		  tabbedPane.setIconAt(0, dcontroller);
   		  tabbedPane.setIconAt(1, dsearch);
		  tabbedPane.setIconAt(2, dpriviledge);
		  tabbedPane.setIconAt(3, dconfig);
		  tabbedPane.setIconAt(4, dprocess);
	  // 	  tabbedPane.setIconAt(5, ddeploy);
		  tabbedPane.setIconAt(5, daboutus);
		  tabbedPane.setIconAt(6, iexit);
	   }
	else{
		tabbedPane.setIconAt(0, dcontroller);
		tabbedPane.setIconAt(1, dsearch);
		tabbedPane.setIconAt(2, dpriviledge);
		tabbedPane.setIconAt(3, dconfig);
		tabbedPane.setIconAt(4, dprocess);
	//	tabbedPane.setIconAt(5, ddeploy);
		tabbedPane.setIconAt(5, daboutus);
		tabbedPane.setIconAt(6, dexit);
		}
	int selected=tabbedPane.getSelectedIndex();
       if(selected==0)
		tabbedPane.setIconAt(0, scontroller);
		else if(selected==1)
			 tabbedPane.setIconAt(1, ssearch);
		else if(selected==2)
		tabbedPane.setIconAt(2, spriviledge);
		else if(selected==3)
		  tabbedPane.setIconAt(3, sconfig);
		else if(selected==4)
		 tabbedPane.setIconAt(4, sprocess);
	//	else if(selected==5)
	//	 tabbedPane.setIconAt(5, sdeploy);
		else if(selected==5)
		 tabbedPane.setIconAt(5, saboutus);

			
	}
	public void mouseDragged(MouseEvent me)
	{
	}
void setcolor()
	{

		getContentPane().setBackground(c);
		bannerpanel.setBackground(c);
		footpanel.setBackground(c);
		panel1.setBackground(c);
		panel2.setBackground(c);
		panel3.setBackground(c);
		tabbedPane.setBackground(c);
		tabbedPane.setBackgroundAt(0,c);
		mainpanel1.setBackground(c);
		mainpanel.setBackground(c);
		lt.setBackground(c);
		gt.setBackground(c);
		
	}
	
	
	public void actionPerformed(ActionEvent ae)
		{
		   if(ae.getSource()==lt)
			{
			   int selected=tabbedPane.getSelectedIndex();
			   if(selected>0)
				tabbedPane.setSelectedIndex(selected-1);
			    repaint();
			}
		  if(ae.getSource()==gt)
			{
			   int selected=tabbedPane.getSelectedIndex();
			   if(selected<=5)
				tabbedPane.setSelectedIndex(selected+1);
			   repaint();
			}
			

		}
  public static void createAndShowGUI() {
        
		JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
		
       
        
    }
   public static void main(String[] args)
	   {
		 
	     
		  createAndShowGUI();    
		frame5 frame = new frame5();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
		frame.setSize(800,800);
		frame.setVisible(true);
      }
	
}

 