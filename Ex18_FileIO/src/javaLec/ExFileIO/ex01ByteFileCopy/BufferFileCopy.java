package javaLec.ExFileIO.ex01ByteFileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferFileCopy {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("cat.jpg");
		OutputStream out = new FileOutputStream("�����.jpg");
		int copyByte = 0;
		int readLen = 0;
		byte[] buf = new byte[1024]; 
		while(true) {
			//readLen�� ���� ���� ũ��
			readLen = in.read(buf); 
			if(readLen == -1) {
				break;
			}
			out.write(buf, 0, readLen); //�о�����ŭ�� ����
			copyByte += readLen;
		}
		in.close();
		out.close();
		System.out.println("����� ����Ʈ ũ��: "+copyByte);
	}
}
