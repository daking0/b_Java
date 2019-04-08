package javaLec.ExNetworkIO.ex01EchoServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* ������ ���񽺸� �����ϴ� ���α׷��� ���´´�.
 * ������ �ּҸ� ������ ���� ��û�ϴ� Ŭ���̾�Ʈ ���α׷��� ��Ʈ���� �����Ѵ�.
 * ��Ʈ���� �����Ǹ� �������� �ۼ����� �����ϴ�
 * �۾��� �Ϸ�Ǹ� close�� ���� ��Ʈ���� �����Ѵ�
 */
public class EchoServer {
	public static void main(String[] args){
		try {
			//port: Host(pc)�� �ִ� ���� ���� �������α׷� �߿� ��Ʈ��ȣ�� ���ϴ� ������ ã�´�.
			//�ּ�: ip address :��������, Host���� ã�� �� �ִ�.
			//     		port  :��ī���, Host���� Ư�� ���α׷�(����)
			//ip�ּҴ� ���� �������� �ʾƵ� ���� Host�� �ּҸ� ���
			//ipconfig
			ServerSocket server = new ServerSocket(10001);
			System.out.println("������ ��ٸ��ϴ�..");
			
			//Ŭ���̾�Ʈ�� �����ϱ⸦ ����ϰ�, ����Ǹ� ���� ������ ��ȯ
			//�� ����������� ����� �� �ִ�.
			//accept�� ���� ������ �Լ��� ��ȯ���� �ʰ�, ����Ǿ�� ��ȯ�ȴ�.
			Socket sock = server.accept(); 
			InetAddress inetaddr = sock.getInetAddress(); //������ ���� ��
			System.out.println(inetaddr.getHostAddress()+"�κ��� ����");
			
			//��� ���� ��ü ����
			OutputStream out = sock.getOutputStream(); // ����
			InputStream in = sock.getInputStream(); //����
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));//print�ϴ� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(in)); //�̰� ������ ����
			
			//��� ����
			String line;
			//null�� �ƴ� ���� ���ڿ� ����
			//null�� ���� ���� ����
			while((line = br.readLine()) != null) {
				System.out.println("Ŭ���̾�Ʈ�κ��� ����: " + line); 
				pw.println(line); //Ŭ���̾�Ʈ���� echo �۽� (���� �� �״�� �����ش�)
				pw.flush(); //�ﰢ �����ض�
			}
			System.out.println("Ŭ���̾�Ʈ-���� ����");
			
			//���� ������ ����
			pw.close();
			br.close();
			sock.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

