package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(8888);
	
			System.out.println("listening port: 8888");
			Socket s = ss.accept();
			System.out.println("connection occurred" + s);
			new SendThread(s).start();
			new RecieveThread(s).start();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
