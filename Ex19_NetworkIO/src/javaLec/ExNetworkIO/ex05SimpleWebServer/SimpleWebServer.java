package javaLec.ExNetworkIO.ex05SimpleWebServer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class HttpThread extends Thread{
	Socket sock = null;
	BufferedReader br = null;
	PrintWriter pw = null;
	public HttpThread(Socket sock) {
		this.sock = sock;
		try {
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void run() {
		BufferedReader fbr = null;
		try {
			String line = br.readLine();
			int start = line.indexOf(" ") + 2;
			int end = line.lastIndexOf("HTTP") - 1;
			String filename = line.substring(start, end);
			if(filename.contentEquals(""))
				filename = "index.html";
			System.out.println("����ڰ� "+ filename +"�� ��û�߽��ϴ�.");
			fbr = new BufferedReader(new FileReader(filename));
			String fline = null;
			while((fline = fbr.readLine()) != null) {
				pw.println(fline);
				pw.flush();
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				if(fbr != null)
					fbr.close();
				if(br != null)
					br.close();
				if(pw != null)
					pw.close();
				if(sock != null)
					sock.close();
			}catch(Exception ex) {
				System.out.println(ex);
			}
		}
	}
}

public class SimpleWebServer {
	public static void main(String[] args) {
		try {
			//Http������ default port => 80
			//�����ڿ��� jvm���κ��� ���ϸ޸𸮸� �Ҵ�ް�
			//ip�� port�� bind�ϴ� ������ ��ģ��.
			ServerSocket ss = new ServerSocket(80);
			while(true) {
				System.out.println("<����> ������ ����մϴ�..");
				//����ϰ� �ֵ��� �����ϸ� ������ ��ȯ�Ѵ�.
				//���Ͽ��� ����� in/out ��Ʈ�� ������ �����Ѵ�
				Socket sock = ss.accept();
				System.out.println("<����>���ο� �����带 �����մϴ�");
				HttpThread ht = new HttpThread(sock); //��� ���ο� socket ���(�մ� �� ��� �˹� �� ��)
				ht.start();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
