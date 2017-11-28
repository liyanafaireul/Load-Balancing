import java.io.*;
import java.net.*;

public class server1
{
  public static void main(String args[]) throws IOException
  {
      ServerSocket server1 = new ServerSocket(2345);

      while(true)
	 {
           Socket connectionsocket = server1.accept();

           BufferedReader fromlb = new BufferedReader(new InputStreamReader(connectionsocket.getInputStream()));

	   String status=fromlb.readLine();

	   System.out.println("Marital status: " + status);
        }
  }
}
