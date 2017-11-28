import java.io.*;
import java.net.*;

public class client
{
     public static void main(String[] args) throws IOException
     {
	Socket client= new Socket("192.168.50.133", 1234);
	DataOutputStream toloadbal= new DataOutputStream(client.getOutputStream());
	System.out.print("Enter marital status: ");
	BufferedReader userinput= new BufferedReader(new InputStreamReader(System.in));
	String status=userinput.readLine();
	toloadbal.writeBytes(status);
	client.close();
     }
}
