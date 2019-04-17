package javaLec.ExNetworkIO.ex02EchoClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/* Client ���α׷�
 * ������ �ּ�(ip address, port)�� ������ 
 * ������ ���� 
 * ���� �Ŀ� ��� ����
 * 
 */
public class EchoClient {
	public static void main(String[] args) {
		try {
			//127.0.0.1 : loop�ּ�, ���� �ڱ��ڽ� Host
			//�����ڿ��� �ش� �ּҷ� ����
			Socket sock = new Socket("127.0.0.1", 10001); //Host Pc(127.0.0.1)���� ã�ư��� 10001��Ʈ ã��
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;
			while((line = keyboard.readLine()) != null) {
				if(line.equals("quit")) {
					System.out.println("Ŭ���̾�Ʈ ����");
					break;
				}
				pw.println(line);
				pw.flush();
				String echo = br.readLine();
				System.out.println("�����κ��� ���޹��� ���ڿ�: "+ echo);
			}
			pw.close();
			br.close();
			sock.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}