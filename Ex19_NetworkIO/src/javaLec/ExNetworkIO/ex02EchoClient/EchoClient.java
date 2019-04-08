package javaLec.ExNetworkIO.ex02EchoClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/* Client 프로그램
 * 서버의 주소(ip address, port)를 가지고 
 * 서버에 접속 
 * 접속 후에 통신 가능
 * 
 */
public class EchoClient {
	public static void main(String[] args) {
		try {
			//127.0.0.1 : loop주소, 현재 자기자신 Host
			//생성자에서 해당 주소로 접속
			Socket sock = new Socket("127.0.0.1", 10001); //Host Pc(127.0.0.1)까지 찾아가서 10001포트 찾음
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;
			while((line = keyboard.readLine()) != null) {
				if(line.equals("quit")) {
					System.out.println("클라이언트 종료");
					break;
				}
				pw.println(line);
				pw.flush();
				String echo = br.readLine();
				System.out.println("서버로부터 전달받은 문자열: "+ echo);
			}
			pw.close();
			br.close();
			sock.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
