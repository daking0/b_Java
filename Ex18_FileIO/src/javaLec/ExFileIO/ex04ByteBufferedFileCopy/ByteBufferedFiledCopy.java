package javaLec.ExFileIO.ex04ByteBufferedFileCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* ���� Ŭ���� �߿� ����(ť ������ �Ǿ��ִ� �ӽ� �����)�� �����ϴ� Ŭ����
 * ex)�ù��簡 ���ռҿ��� ���� �ù���� �ư� �̵��Ѵ�.
 * ���� : ���� �ӵ��� ��������.
 */
public class ByteBufferedFiledCopy {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("putty.exe");
		OutputStream out = new FileOutputStream("ǪƼ.exe");
		BufferedInputStream bin = new BufferedInputStream(in); //����Ʈ�� 2�ް� ��Ƶд�
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		//(����ó��) 1����Ʈ�� �о 1����Ʈ�� �����ϱ�
		//�׷��� �������͸� ����ϱ� ������ �ϴ� ���ۿ� ��� �ͱ����� ���� ä������ �ȴ�(�ӵ� ����� ���� ���־��� ->������ Ŭ���� �ð����� Ŀ����)
		
		int copyByte = 0;
		int bData;
		
		long stime = System.currentTimeMillis();
		
		while(true) {
			bData = bin.read();
			if(bData == -1) {
				break;
			}
			bout.write(bData);
			copyByte++;
		}
		long etime = System.currentTimeMillis();
		System.out.println("���� �ð�: "+ (etime - stime));
		bin.close();
		bout.close();
		System.out.println("����� ����Ʈ ũ��: "+copyByte);
	}
}
