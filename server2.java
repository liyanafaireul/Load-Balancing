import java.io.*;
import java.net.*;

public class server2
{
  public static void main(String args[]) throws IOException
  {
      ServerSocket server2 = new ServerSocket(2346);

      while(true) {
	Socket connectionsocket = server2.accept();

        BufferedReader fromlb = new BufferedReader(new InputStreamReader(connectionsocket.getInputStream()));

	String status=fromlb.readLine();
	System.out.println("Marital status: " + status);
        }
  }
}
