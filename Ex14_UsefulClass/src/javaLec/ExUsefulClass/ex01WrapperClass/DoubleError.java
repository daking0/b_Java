package javaLec.ExUsefulClass.ex01WrapperClass;

import java.math.BigDecimal;

public class DoubleError {
	public static void main(String[] args) {
		double e1 = 1.6;
		double e2 = 0.1;
		System.out.println("�� �Ǽ��� ����: "+(e1 + e2));
		System.out.println("�� �Ǽ��� ����: "+(e1 * e2));
		
		//�Ű������� ���޵� �� �̹� Error�� �߻�
		BigDecimal b1 = new BigDecimal(1.6);
		BigDecimal b2 = new BigDecimal(0.1);
		
		System.out.println("�� �Ǽ��� ����: "+b1.add(b2));
		System.out.println("�� �Ǽ��� ����: "+b1.multiply(b2));
		
		//�������� �Ǽ� ǥ���� �ϴµ� �ݵ�� ���ڿ��� ���� �����ؾ� �Ѵ�.
		BigDecimal b3 = new BigDecimal("1.6");
		BigDecimal b4 = new BigDecimal("0.1");
		
		System.out.println("�� �Ǽ��� ����: "+b3.add(b4));
		System.out.println("�� �Ǽ��� ����: "+b3.multiply(b4));
	}
}
