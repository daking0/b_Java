package javaLec.ExNetworkIO.ex03EchoThreadServer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* echo : Ŭ���̾�Ʈ�� ������ �޽����� �״�� ����������
 * thread : ���� Ŭ���̾�Ʈ�� �������� �� Ŭ���̾�Ʈ �� 1�� �����尡 �����Ѵ�
 * 			�׷��� ���ÿ� ���񽺰� �����ϴ� 
 * 
 */
public class EchoThreadServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			System.out.println("������ ��ٸ��ϴ�...");
			while(true) {
				//1. Ŭ���̾�Ʈ�� ����
				Socket sock = server.accept();
				//2. Ŭ���̾�Ʈ ��� ������ �����Ͽ� �����Ŵ
				EchoThread echothread = new EchoThread(sock);
				echothread.start();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

class EchoThread extends Thread{
	Socket sock;
	public EchoThread(Socket sock) {
		this.sock = sock;
	}
	
	public void run(){
		try {
			InetAddress inetaddr = sock.getInetAddress();
			System.out.println(inetaddr.getHostAddress()+ "�κ��� �����߽��ϴ�.");
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(inetaddr.getHostAddress()+"Ŭ���̾�Ʈ�κ��� ����: "+line);
				pw.println(line);
				pw.flush();
			}
			System.out.println("Ŭ���̾�Ʈ ���� ����");
			pw.close();
			br.close();
			sock.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}