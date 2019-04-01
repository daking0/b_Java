package javaLec.ExUsefulClass.ex01WrapperClass;

import java.util.StringTokenizer;

public class TokenizeString2 {
	public static void main(String[] args) {
		String phoneNum = "TEL 82-02-997-2059";
		String javaCode = "num +=1";
		StringTokenizer st1 = new StringTokenizer(phoneNum); //������ ������ default�� ���鹮���̴�.
		while(st1.hasMoreElements())
			System.out.println(st1.nextElement());

		StringTokenizer st2= new StringTokenizer(phoneNum, " -"); //���鹮�ڿ� -�� �Ѵ� token���� ��´�.
		while(st2.hasMoreElements())
			System.out.println(st2.nextElement());
		
		StringTokenizer st3= new StringTokenizer(phoneNum, "-");  //-�� token���� ��´�.
		while(st3.hasMoreElements())
			System.out.println(st3.nextElement());
		
		StringTokenizer st4= new StringTokenizer(javaCode, "+=",true); 
		while(st4.hasMoreElements())
			System.out.println(st4.nextElement()); //num + = 1
		
		StringTokenizer st5= new StringTokenizer(javaCode, "+=", false); //�Ű��� �� ���� ������� ����  
		while(st5.hasMoreElements())
			System.out.println(st5.nextElement());
	}
}
