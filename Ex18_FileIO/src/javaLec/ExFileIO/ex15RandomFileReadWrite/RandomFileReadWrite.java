package javaLec.ExFileIO.ex15RandomFileReadWrite;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFileReadWrite {
	public static void main(String[] args) throws IOException {
		long lpos = 0L;
		RandomAccessFile raf = new RandomAccessFile("rdata.bin", "rw"); //read write ���ÿ� ���� (�ϳ��� ���� ���� �ϳ��� ����)
		System.out.println("write....");
		System.out.printf("���� ����� ��ġ: %d byte\n", raf.getFilePointer());
		raf.writeInt(200);
		raf.writeInt(500);
		System.out.printf("���� ����� ��ġ: %d byte\n", raf.getFilePointer());
		lpos = raf.getFilePointer();
		raf.writeDouble(3.14);
		raf.writeDouble(58.98);
		System.out.printf("���� ����� ��ġ: %d byte\n", raf.getFilePointer());
		
		System.out.println("Read............");
		raf.seek(0); //�Ǿ�����
		System.out.printf("���� ����� ��ġ: %d byte\n", raf.getFilePointer());
		System.out.println(raf.readInt());
		System.out.println(raf.readInt());
		System.out.printf("���� ����� ��ġ: %d byte\n", raf.getFilePointer());
		System.out.println(raf.readDouble());
		System.out.println(raf.readDouble());
		System.out.printf("���� ����� ��ġ: %d byte\n", raf.getFilePointer());
		
		//3.14�� �̵� �� 10.14�� �ٲٱ�
		raf.seek(lpos);
		raf.writeDouble(10.14);
		System.out.println("Read............");
		
		raf.seek(0); 
		System.out.printf("���� ����� ��ġ: %d byte\n", raf.getFilePointer());
		System.out.println(raf.readInt());
		System.out.println(raf.readInt());
		System.out.printf("���� ����� ��ġ: %d byte\n", raf.getFilePointer());
		System.out.println(raf.readDouble());
		System.out.println(raf.readDouble());
		System.out.printf("���� ����� ��ġ: %d byte\n", raf.getFilePointer());
		
		raf.close();
	}
}
