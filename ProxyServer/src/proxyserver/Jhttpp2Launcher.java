package proxyserver;


public class Jhttpp2Launcher {

  static Jhttpp2Server server;

  public static void main(String[] args)
  {
		server = new Jhttpp2Server(true);
    	if (server.fatalError) {
    		System.out.println("Error: " +  server.getErrorMessage());
		}
    	else {
    		new Thread(server).start();
    	   	System.out.println("Running on port " + server.port);
    	}
  }
}