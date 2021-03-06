package javaLec.ExFileIO.ex01ByteFileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//open - write - read - close
//public class ByteFileCopy {
//	public static void main(String[] args) throws IOException {
//		InputStream in = new FileInputStream("dog.jpg"); //객체 생성이 open
//		OutputStream out = new FileOutputStream("개.jpg");
//		int copyByte = 0;
//		int bData;
//		while(true) {
//			bData = in.read(); //1byre씩 읽는다.
//			if(bData == -1) { //더 이상 읽을 것이 없다.
//				break;
//			}
//			out.write(bData);
//			copyByte++;
//		}
//		in.close();
//		out.close();
//		System.out.println("복사된 바이트 크기: "+copyByte );
//	}
//}


public class ByteFileCopy {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("putty.exe"); //객체 생성이 open
		OutputStream out = new FileOutputStream("퓨티.exe");
		int copyByte = 0;
		int bData;
		long stime = System.currentTimeMillis();
		while(true) {
			bData = in.read(); //1byre씩 읽는다.
			if(bData == -1) { //더 이상 읽을 것이 없다.
				break;
			}
			out.write(bData);
			copyByte++;
		}
		
		long etime = System.currentTimeMillis();
		System.out.println("복사 시간: "+ (etime - stime));
		
		in.close();
		out.close();
		System.out.println("복사된 바이트 크기: "+copyByte );
	}
}