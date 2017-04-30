package majorProject;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
public class permission
{
JFrame frame=new JFrame(); 
private boolean DEBUG = true;
	Object found[][];

int fcount=0;
String s1;
String sfile;


public permission()
{
      s1="c:\\a";
			sfile="";
	File f = new File(s1);

		File fx[] = f.listFiles();
		System.out.println(fx.length);
	    found=new Object[fx.length][6];

        MyTableModel myModel = new MyTableModel();
        JTable table = new JTable(myModel);

		

	  table.setRowHeight(25);
        table.setShowVerticalLines(false);
    table.setShowHorizontalLines(false); 
Color c=new Color(174,255,174);
table.setSelectionBackground(c);
	table.setGridColor(c);

	ListSelectionModel listMod =  table.getSelectionModel();
   listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   table.setPreferredScrollableViewportSize(new Dimension(500, 70));

        JScrollPane scrollPane = new JScrollPane(table);
		
       frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
 frame.setSize(400,400);
 frame.setVisible(true);


  } 




class MyTableModel extends AbstractTableModel
{
        final String[] columnNames = {"Name", 
                                      "Path",
						  "Write Permission",
						   "Hidden","sharing",};
        
		
              MyTableModel()
              {
try{
	    if (s1.length() > 0)
	      {
            
			System.out.println("recursive Dir from " + s1);

            recurseInDirFrom(s1,sfile);

            System.out.println("end");
          
		  }
		
	   }
	   catch(Exception e)
	 {
  System.out.println(e);
          
	 }
		}
        public int getColumnCount() {
            return columnNames.length;
        }
        
        public int getRowCount() 
		{
            return found.length;
        }

        public String getColumnName(int col) {
            return columnNames[col];
        }

        public Object getValueAt(int row, int col) {
            return found[row][col];
        }

       
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

        
        public boolean isCellEditable(int row, int col) {
            
            if (col <2)
				{ 
                return false;
				} 
			else {
                return true;
            }
        }

       
    
		 public void setValueAt(Object value, int row, int col) {
            if (DEBUG) 
			{

				System.out.println("sdfsFile Name is" + "attrib  +r " + found[row][1] + "\\" + found[row][0]);

                System.out.println("Setting value at " + row + "," + col
                                   + " to " + value
                                   + " (an instance of " 
                                   + value.getClass() + ")");

				try
				{
					Runtime rt = Runtime.getRuntime();
					Process p = null;
					if (col == 2)
					{
						if(value.toString().equals("true"))
							p = rt.exec("attrib +r " + found[row][1] + "\\" + found[row][0]);
						else
							p = rt.exec("attrib -r " + found[row][1] + "\\" + found[row][0]);
					}
					else if (col == 3)
					{
						if (value.toString().equals("true"))
							p = rt.exec("attrib +h " + found[row][1] + "\\" + found[row][0]);
						else
							p = rt.exec("attrib -h " + found[row][1] + "\\" + found[row][0]);
					}
				}
				catch (Exception e)
				{
					System.out.println(e.toString());
				}


            }

           
                found[row][col] = value;
                fireTableCellUpdated(row, col);
           
        }


	}

	
        
public void recurseInDirFrom(String dirItem,String sfile) throws Exception {    
  File file;
  String tfile,ufile,search,usearch,startwith;
  String list[];
  int ext=sfile.indexOf(".");
  String strfile=sfile;
   file = new File(dirItem);
    if (file.isDirectory()) 
	  {

	   if(dirItem.equals(sfile))
           {
	   found[fcount][0]=sfile;
	   found[fcount][1]=dirItem;
	   File f = new File(dirItem);
	   found[fcount][2] = new Boolean(f.canWrite());
	   found[fcount][3] = new Boolean(f.isHidden());
           found[fcount][4]=new Boolean(false);
		    fcount++;
	 		
	   }
	list = file.list();
    for (int i = 0; i < list.length; i++)
	  {
		String type;
		if(list[i].endsWith("System Volume Information"))
		continue;
		recurseInDirFrom
       (dirItem + File.separatorChar + list[i],sfile);
		if(list[i].indexOf('.')>0)
		type=list[i].substring(list[i].indexOf(".")+1,list[i].length())+" File";
	     else
			 type="File Folder";
	   if(ext<0)
		  {
	      if(sfile.indexOf("*")>=0)
			  {
				strfile=sfile.substring(0,sfile.indexOf("*"));
			  if((list[i].toLowerCase().startsWith(strfile.toLowerCase())))
				  {
				 found[fcount][0]=list[i];
	             found[fcount][1]=dirItem;
				   found[fcount][5] = new Button("ok");
				 fcount++;
				  }
			  }
			else if((list[i].toLowerCase().lastIndexOf(strfile.toLowerCase()))>=0)
			  {
	          found[fcount][0]=list[i];
	          found[fcount][1]=dirItem;
			  File f = new File(dirItem + "\\" + list[i]);
			  System.out.println(dirItem + "\\" + list[i]);
			  found[fcount][2] = new Boolean(f.canWrite());
			  found[fcount][3] = new Boolean(f.isHidden());
			 found[fcount][4]=new Boolean(false);
				  fcount++;
					  }
		  }
		  else 
		  {
			 if(strfile.indexOf('*')>=0)
			  {
		   startwith=strfile.substring(0,strfile.indexOf("*"));             
		   startwith=startwith.toLowerCase();
		   search=list[i].substring(list[i].indexOf(".")+1,list[i].length());     
			search=search.toLowerCase();
			usearch=strfile.substring(strfile.indexOf(".")+1,strfile.length());     
			 
			  if(list[i].toLowerCase().startsWith(startwith))
				  {
					if(usearch.equalsIgnoreCase(search))
					  {
				 found[fcount][0]=list[i];
	             found[fcount][1]=dirItem;

						File f=new File(dirItem + "\\" + list[i]);
						System.out.println(dirItem + "\\" + list[i]);					
           found[fcount][2]=new Boolean(f.canWrite());
           found[fcount][3]=new Boolean(f.isHidden());
           found[fcount][4]=new Boolean(false);
				 fcount++;
					 }
			      }
				
			 }
			 else if(strfile.equalsIgnoreCase(list[i]))
			  {
           found[fcount][0]=list[i];
	   found[fcount][1]=dirItem;
	   File f = new File(dirItem + "\\" + list[i]);
	   System.out.println(dirItem + "\\" + list[i]);
	   found[fcount][2] = new Boolean(f.canWrite());
	   found[fcount][3] = new Boolean(f.isHidden());
           found[fcount][4]=new Boolean(false);
		   found[fcount][5] = new Button("ok");
				 fcount++;
				
			  }
			  
		  }

	  
	 
        }
     }
	  	
 }
 
    public static void main(String[] args) {
        permission frame = new permission();
      
      
    }

}
