package javaLec.ExFileIO.ex01ByteFileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//open - write - read - close
public class ByteFileCopy {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("dog.jpg"); //��ü ������ open
		OutputStream out = new FileOutputStream("��.jpg");
		int copyByte = 0;
		int bData;
		while(true) {
			bData = in.read(); //1byre�� �д´�.
			if(bData == -1) { //�� �̻� ���� ���� ����.
				break;
			}
			out.write(bData);
			copyByte++;
		}
		in.close();
		out.close();
		System.out.println("����� ����Ʈ ũ��: "+copyByte );
	}
}
