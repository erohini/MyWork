package majorProject;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.rmi.*;
import java.rmi.server.*;
public class changepermission
{
	JFrame frame = new JFrame();
	private boolean DEBUG = true;
	String s1;
	String sfile;
	
	public changepermission(String path,String ip) throws Exception
	{
		s1 = path;
		permissionModel myModel = new permissionModel(s1,ip);
		JTable table = new JTable(myModel);
		table.setRowHeight(25);
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		Color c = new Color(174, 255, 174);
		table.setSelectionBackground(c);
		table.setGridColor(c);
		ListSelectionModel listMod = table.getSelectionModel();
		listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		JScrollPane scrollPane = new JScrollPane(table);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		frame.setSize(400, 400);
		frame.setVisible(true);


	}
	public static void main(String[] args)
	{
		try
		{
		changepermission frame = new changepermission("c:\\tc","localhost");
	    }
		catch(Exception e)
		{
		}


	}
}


	class permissionModel extends AbstractTableModel
	{
		Object found[][];
		final String[] columnNames = {"Name", 
                                      "Path",
						  "Read Permission",
						   "Hidden","sharing",};
		int i = 0;
		String sfile = "";
		String addr;
		permissionModel(String s1,String ip) throws Exception
		{
			
				addr=ip;
				String url = "//"+ip+":1099/RObjectServer";
				intf intf1 = (intf)Naming.lookup(url);
				found = (Object[][])intf1.getperm(sfile, s1);
				for (i = 0; found[i][0] != null; i++) ;
			
		}
		public int getColumnCount()
		{
			return columnNames.length;
		}

		public int getRowCount()
		{
			return i;//found.length;
		}

		public String getColumnName(int col)
		{
			return columnNames[col];
		}

		public Object getValueAt(int row, int col)
		{
			return found[row][col];
		}


		public Class getColumnClass(int c)
		{
			return getValueAt(0, c).getClass();
		}


		public boolean isCellEditable(int row, int col)
		{

			if (col < 2)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		 public void setValueAt(Object value, int row, int col) {
            
				System.out.println("sdfsFile Name is" + "attrib  +r " + found[row][1] + "\\" + found[row][0]);

                System.out.println("Setting value at " + row + "," + col
                                   + " to " + value
                                   + " (an instance of " 
                                   + value.getClass() + ")");

			 JOptionPane jp = new JOptionPane();
			 int res = jp.showConfirmDialog(null, "Are you sure you want change the permission", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			 if (res == JOptionPane.YES_OPTION)
			 {
				 try
				 {
					 String url = "//"+addr+":1099/RObjectServer";
					 System.out.println(url);
					 intf intf1 = (intf)Naming.lookup(url);
					 if (col == 2)
					 {
						 System.out.println(value);
						 if (value.toString().equals("true"))
						 {
							
							 intf1.setperm("attrib -r " + found[row][1] + "\\" + found[row][0]);
							 System.out.println("333sdfsFile Name is" +" attrib +r " + found[row][1] + "\\" + found[row][0]);
						 }
						 else
						 {
							 intf1.setperm("attrib +r " + found[row][1] + "\\" + found[row][0]);
							 //System.out.println("sdfsFile Name is" + "attrib -r " + found[row][1] + "\\" + found[row][0]);
						 }
					 }
					 else if (col == 3)
					 {
						 if (value.toString().equals("true"))
							 intf1.setperm("attrib +h " + found[row][1] + "\\" + found[row][0]);
						 else
							 intf1.setperm("attrib -h " + found[row][1] + "\\" + found[row][0]);
					 }
					 else if (col == 4)
					 {
						 if (value.toString().equals("true"))
							intf1.setperm("net share "+ found[row][0]+"=" + found[row][1] + "\\" + found[row][0]);
						 else
							 intf1.setperm("net share "+ found[row][1] + "\\" + found[row][0]+" /delete");
					 }
				 }
				 catch (Exception e)
				 {
					 System.out.println(e.toString());
				 }


                      
				 found[row][col] = value;
				 fireTableCellUpdated(row, col);
			 }
			 
           
        }


		
	}
