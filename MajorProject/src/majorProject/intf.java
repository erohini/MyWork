package majorProject;

import java.rmi.*;
import java.io.*;
import java.rmi.server.*;
import java.util.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.imageio.stream.*;
public interface intf extends Remote
{
public char Alert(String msg) throws RemoteException;
public void shutdown() throws RemoteException;
public void restart() throws RemoteException;
public void logoff() throws RemoteException;
public LinkedList checkService() throws RemoteException;
public LinkedList search(String type, String drive) throws RemoteException;
public void taskkill(String pid) throws RemoteException;
public LinkedList systeminfo() throws RemoteException;
public StringBuffer downloadfile(String s) throws RemoteException;
public StringBuffer readfile(String s) throws RemoteException;
public String storeData(String filename, StringBuffer data)throws RemoteException;
public void setperm(String perm) throws RemoteException;
	public File downloadimage(String s) throws RemoteException;
public Object getperm(String type, String drive) throws RemoteException;
	public byte[] downloadbyte(String s) throws RemoteException;
	public String storeByte(String filename, File data)throws RemoteException;
	public String storeImage(String filename, File data)throws RemoteException;
public void deploy(int keys[][],String soft) throws RemoteException;
}
