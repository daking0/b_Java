package javaLec.ExUsefulClass.ex01WrapperClass;

import java.math.BigInteger;

public class SoBigInteger {
	public static void main(String[] args) {
		System.out.println("�ִ� ����: "+Long.MAX_VALUE);
		System.out.println("�ִ� ����: "+Long.MIN_VALUE);
		
		//int�� long�� �Ѿ�� ������ ������ �ؾ��ϹǷ� ���ڿ��� ǥ�� �� �� �ۿ� ����
		BigInteger bigValue1 = new BigInteger("100000000000000000");
		BigInteger bigValue2 = new BigInteger("999999999999999999");
		
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);
		
		System.out.println("ū ���� ����: "+addResult);
		System.out.println("ū ���� ����: "+mulResult);
	}
}
