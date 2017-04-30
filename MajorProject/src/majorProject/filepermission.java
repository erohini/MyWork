package majorProject;

import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.TableColumn;
import java.util.*;
public class filepermission
	{

	Object found[][] = new Object[1000][5];
	String path,name;
	   int fcount=0;
	    String s1;
		String sfile;

	filepermission(String drive, String filename)
	{
	
	s1=drive;
	sfile=filename;
	
	}
public Object exec()
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
	return found;

	}


	public void recurseInDirFrom(String dirItem, String sfile) throws Exception
	{
		File file;
		String tfile, ufile, search, usearch, startwith;
		String list[];
		int ext = sfile.indexOf(".");
		String strfile = sfile;
		file = new File(dirItem);
		if (file.isDirectory())
		{

			if (dirItem.equals(sfile))
			{
				found[fcount][0] = sfile;
				found[fcount][1] = dirItem;
				File f = new File(dirItem);
				found[fcount][2] = new Boolean(f.canRead());
				found[fcount][3] = new Boolean(f.isHidden());
				found[fcount][4] = new Boolean(false);
				fcount++;

			}
			list = file.list();
			for (int i = 0; i < list.length; i++)
			{
				String type;
				if (list[i].endsWith("System Volume Information"))
					continue;
				recurseInDirFrom
			   (dirItem + File.separatorChar + list[i], sfile);
				if (list[i].indexOf('.') > 0)
					type = list[i].substring(list[i].indexOf(".") + 1, list[i].length()) + " File";
				else
					type = "File Folder";
				if (ext < 0)
				{
					if (sfile.indexOf("*") >= 0)
					{
						strfile = sfile.substring(0, sfile.indexOf("*"));
						if ((list[i].toLowerCase().startsWith(strfile.toLowerCase())))
						{
							found[fcount][0] = list[i];
							found[fcount][1] = dirItem;
							found[fcount][5] = new Button("ok");
							fcount++;
						}
					}
					else if ((list[i].toLowerCase().lastIndexOf(strfile.toLowerCase())) >= 0)
					{
						found[fcount][0] = list[i];
						found[fcount][1] = dirItem;
						File f = new File(dirItem + "\\" + list[i]);
						System.out.println(dirItem + "\\" + list[i]);
						found[fcount][2] = new Boolean(f.canRead());
						found[fcount][3] = new Boolean(f.isHidden());
						found[fcount][4] = new Boolean(false);
						fcount++;
					}
				}
				else
				{
					if (strfile.indexOf('*') >= 0)
					{
						startwith = strfile.substring(0, strfile.indexOf("*"));
						startwith = startwith.toLowerCase();
						search = list[i].substring(list[i].indexOf(".") + 1, list[i].length());
						search = search.toLowerCase();
						usearch = strfile.substring(strfile.indexOf(".") + 1, strfile.length());

						if (list[i].toLowerCase().startsWith(startwith))
						{
							if (usearch.equalsIgnoreCase(search))
							{
								found[fcount][0] = list[i];
								found[fcount][1] = dirItem;

								File f = new File(dirItem + "\\" + list[i]);
								System.out.println(dirItem + "\\" + list[i]);
								found[fcount][2] = new Boolean(f.canRead());
								found[fcount][3] = new Boolean(f.isHidden());
								found[fcount][4] = new Boolean(false);
								fcount++;
							}
						}

					}
					else if (strfile.equalsIgnoreCase(list[i]))
					{
						found[fcount][0] = list[i];
						found[fcount][1] = dirItem;
						File f = new File(dirItem + "\\" + list[i]);
						System.out.println(dirItem + "\\" + list[i]);
						found[fcount][2] = new Boolean(f.canRead());
						found[fcount][3] = new Boolean(f.isHidden());
						found[fcount][4] = new Boolean(false);
						found[fcount][5] = new Button("ok");
						fcount++;

					}

				}



			}
		}

	}
        
}