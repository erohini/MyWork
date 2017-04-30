package majorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
 
	
public class Server extends JFrame
{
	
	intf obj;

	Server() throws Exception
	{
		obj = new Serverimpl();
		Registry registry = LocateRegistry.createRegistry(1099); 
		System.out.println("Initialising server.........");
		Naming.rebind("//localhost:1099/RObjectServer",obj);		
		System.out.println("Registered");
			

	}
	
public static void main(String arg[]) throws Exception
{
new Server();

}
}
