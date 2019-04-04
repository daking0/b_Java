package javaLec.ExFileIO.ex01ByteFileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferFileCopy {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("cat.jpg");
		OutputStream out = new FileOutputStream("고양이.jpg");
		int copyByte = 0;
		int readLen = 0;
		byte[] buf = new byte[1024]; 
		while(true) {
			//readLen은 실제 읽은 크기
			readLen = in.read(buf); 
			if(readLen == -1) {
				break;
			}
			out.write(buf, 0, readLen); //읽어진만큼만 저장
			copyByte += readLen;
		}
		in.close();
		out.close();
		System.out.println("복사된 바이트 크기: "+copyByte);
	}
}
