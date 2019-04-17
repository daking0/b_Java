package javaLec.ExFileIO.ex18RelativePath;

import java.io.File;

/* ���� ���: D:\\destination\\putty.exe
 * 		    C:\\Program Files\\AhnLab\\V3Lite40
 * ��� ���: ���� ���� ����(eclipsse������ ���� ������Ʈ ����)
 * 			File subDir = new File("source");
 * 			//���� ���� ���� �Ʒ��� source ���� �Ʒ� src ����
 * 		    File subDir = new File("source\\src");
 * 			//���� ���� ���� ���� ������ �ִ� putty.exe ����
 * 			File upDir = new File("..\\putty.exe");
 * 			//���� ���� ���� ���� ������ �ִ� temp ���� ���� putty ����
 * 			File upDir = new File("..\\temp\\putty.exe")
 * 			//���� ���ذ��
 * 			File thisDir = new File(".\\temp\\putty.exe");
 */
public class RelativePath {
	public static void main(String[] args) {
		File curDir = new File(""); //���� ����
		System.out.println(curDir.getAbsolutePath()); //���� ���
		File subDir = new File("src" + File.separator+"aaa");
		subDir.mkdir();
		System.out.println(subDir.getAbsolutePath()); //������
		File upperDir = new File(".."+File.separator+"bbb");
		upperDir.mkdir();
		String path = upperDir.getAbsolutePath();
		System.out.println(path);
		File uDir = new File(path+File.separator +"BURT's BEES");
		uDir.mkdir();
	}

}