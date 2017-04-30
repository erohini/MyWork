package majorProject;


import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.imageio.stream.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
 
public class Serverimpl extends UnicastRemoteObject implements intf, java.io.Serializable 
{
	

	public Serverimpl() throws RemoteException
	{
	
	}

	public char Alert(String msg) throws RemoteException
	{
		dialog d=new dialog("Admin  : This is a msg from admin");
		d.setSize(400, 200);
		d.setVisible(true);
		System.out.println("i1");
		System.out.println("i1");
		try
		{
			Thread.sleep(60000);
		}
		catch (Exception e)
		{
		}
		d.setVisible(false);
		System.out.println(d.ch);
		return d.ch;
	}


	public void shutdown() throws RemoteException
	{
		try
		{
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec("shutdown -l");
		}
		catch (Throwable t)
		{
			t.printStackTrace();
		}
	}
	public void restart() throws RemoteException
	{
		try
		{
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec("shutdown -l");
		}
		catch (Throwable t)
		{
			t.printStackTrace();
		}
	}
	public void logoff() throws RemoteException
	{
		try
		{
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec("shutdown -l");
		}
		catch (Throwable t)
		{
			t.printStackTrace();
		}
	}
	public LinkedList search(String type, String drive) throws RemoteException
	{
		System.out.println("Searching..");
		MyTableModel t = new MyTableModel(drive, type);

		LinkedList l = t.exec();

		return l;



	}

	public LinkedList checkService() throws RemoteException
	{

		String s = "";
		LinkedList l = new LinkedList();
		Iterator it = l.iterator();
		try
		{
			Runtime Rt = Runtime.getRuntime();
			// Get available Process 
			InputStream ip = Rt.exec("tasklist").getInputStream();

			BufferedReader in = new BufferedReader(new InputStreamReader(ip));
			while ((s = in.readLine()) != null)
			{
				l.add(s);
				//str=str+s+"\n";

			}
		}
		catch (IOException e)
		{


		}

		return l;
	}

	public void taskkill(String pid) throws RemoteException
	{
		try
		{
			Runtime rt = Runtime.getRuntime();
			String str = "taskkill /pid " + pid;
			Process proc = rt.exec(str);
		}
		catch (Throwable t)
		{
			t.printStackTrace();
		}
	}
	public LinkedList systeminfo() throws RemoteException
	{

		String s = "";
		LinkedList l = new LinkedList();
		Iterator it = l.iterator();
		try
		{
			Runtime Rt = Runtime.getRuntime();
			InputStream ip = Rt.exec("systeminfo").getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(ip));
			while ((s = in.readLine()) != null)
			{
				l.add(s);

			}
		}
		catch (IOException e)
		{


		}

		return l;
	}

	public StringBuffer downloadfile(String s) throws RemoteException
	{
		String x = "";
		StringBuffer str = new StringBuffer("");
		System.out.println("IN DF" + s);
		try
		{
			FileInputStream in = new FileInputStream(s);
			DataInputStream din = new DataInputStream(in);
			while ((x = din.readLine()) != null)
			{
				System.out.println(x);
				str.append(x +"\n");
			}
			System.out.println(str.toString().getBytes());
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

		return str;
	}

	public File downloadimage(String s) throws RemoteException
	{
		File inputFile = null; 
		System.out.println("in buff" + s);
		try
		{

			inputFile = new File(s);
		}
		catch (Exception e)
		{
			System.out.println("hello" + e);
		}

		return inputFile ;
	}
	public byte[] downloadbyte(String s) throws RemoteException
	{
		File inputFile = null;
		
		System.out.println("in byte.." + s);
		try
		{
			inputFile = new File(s);
			byte[] bytes= getBytesFromFile(inputFile);
			return bytes;
		}
		catch (Exception e)
		{
			System.out.println("hff" + e);
		}

		return null;
	}

	public static byte[] getBytesFromFile(File file) throws IOException
	{
		InputStream is = new FileInputStream(file);

		// Get the size of the file
		long length = file.length();

		// You cannot create an array using a long type.
		// It needs to be an int type.
		// Before converting to an int type, check
		// to ensure that file is not larger than Integer.MAX_VALUE.
		if (length > Integer.MAX_VALUE)
		{
			// File is too large
		}

		// Create the byte array to hold the data
		byte[] bytes = new byte[(int)length];

		// Read in the bytes
		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length
			   && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0)
		{
			offset += numRead;
		}

		// Ensure all the bytes have been read in
		if (offset < bytes.length)
		{
			throw new IOException("Could not completely read file " + file.getName());
		}

		// Close the input stream and return bytes
		is.close();
		return bytes;
	}



	public StringBuffer readfile(String s) throws RemoteException
	{
		String x = "";
		StringBuffer sb = new StringBuffer("");
		try
		{
			FileInputStream in = new FileInputStream(s);
			DataInputStream din = new DataInputStream(in);
			while ((x = din.readLine()) != null)
			{
				sb.append(x);
			}
		}
		catch (Exception e)
		{

		}

		return sb;
	}
	public String storeData(String filename, StringBuffer data)throws RemoteException
	{

		try
		{
			FileOutputStream infile = new FileOutputStream(filename);
			infile.write(data.toString().getBytes());
			infile.close();
			return "File Saved Successfully..";
		}
		catch (Exception e)
		{
		}
		return "Exception Occur..";

	}
	public String storeImage(String filename, File data)throws RemoteException
	{
		try
		{
			BufferedImage input = ImageIO.read(data);
			System.out.println("2");
			File outputFile = new File(filename);
			System.out.println("3");
			ImageIO.write(input, "PNG", outputFile);
			System.out.println("4");

			return "File Saved Successfully..";
		}
		catch (Exception e)
		{
		}
		return "Exception Occur..";

	}
	public String storeByte(String filename, File data)throws RemoteException
	{
		try
		{
			byte[] b= getBytesFromFile(data);
			FileOutputStream outfile = new FileOutputStream(filename);
			outfile.write(b);
			outfile.close();
			return "File Saved Successfully..";
		}
		catch (Exception e)
		{
		}
		return "Exception Occur..";

	}


	public Object getperm(String type, String drive) throws RemoteException
	{

		filepermission f = new filepermission(drive, type);
		Object l = f.exec();
		return l;
	}

	public void setperm(String perm) throws RemoteException
	{


		try
		{
			Runtime Rt = Runtime.getRuntime();
			Process ip = Rt.exec(perm);

		}
		catch (IOException e)
		{


		}


	} 	
	public void deploy(int keys[][],String soft) throws RemoteException
	{

		
		try
		{
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec(soft);

                        System.out.println(soft + " " + keys.length);

			Robot robot = new Robot();			
 
			for (int i = 0;i < keys.length; i++)
			{
			      robot.keyPress(keys[i][0]);
                              System.out.println(keys[i][1]);
			      robot.delay(keys[i][1]);    
			}
			
		}
		catch (Exception e)
		{
                        System.out.println(e);
		}		
	} 	

}
