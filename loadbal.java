import java.net.*;
import java.io.*;

public class loadbal
		   {
		    public static void main(String [] args) throws IOException{
		    ServerSocket loadbal=new ServerSocket(1234);

		    while(true)
		    {
			Socket LBSocket = loadbal.accept();
			BufferedReader clientstatus = new BufferedReader(new      	InputStreamReader(LBSocket.getInputStream()));
			String currentstatus = clientstatus.readLine();

			if(currentstatus.contains("single"))
			{
			     Socket server1 = new Socket("192.168.13.128", 2345);
			     DataOutputStream toserver1 = new DataOutputStream(server1.getOutputStream());
			     toserver1.writeBytes(currentstatus+"\n");
			     server1.close();
			}

			else if(currentstatus.contains("married"))
		        {
                             Socket server2=new Socket("192.168.13.131", 2346);
                             DataOutputStream toserver2=new DataOutputStream(server2.getOutputStream());
                             toserver2.writeBytes(currentstatus+"\n");
                             server2.close();
                        }

                   }
                 }
}

