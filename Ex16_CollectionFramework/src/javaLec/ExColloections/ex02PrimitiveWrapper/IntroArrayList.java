package javaLec.ExColloections.ex02PrimitiveWrapper;

import java.util.ArrayList;
/* Array ����
 * 1) ���������� �������� ������ ������
 * 2) �������� ������ �߰��� �������� ��¿����� ���� ���� ����
 * 3) �˻� : �� ���ڸ� ���� �ڿ��� ã�´�.
 * 4) ���� : �߰��� ���� �� �ڿ� �ִ� �����͸� ���� �ڷ� �о�� ��
 * 5) ���� : �߰����� ������ �� �ڿ��ִ� �����͸� ���� ������ ��ܾ� ��
 * 6) Ȯ�� : ���������� ���ӵ� ������ Ȯ������ ���ϸ� ���ο� ������ �Ҵ��ϰ� ���� �����Ѵ�.  
 * 7) �˻� : ������ �˻��� ���������� �˻��ϴٰ� ��Ÿ���� ��ť
 * 			���Ľô� �����˻�/�����˻��� ���� �ٷ� index ����
 * �������� �����̴�.
 */
public class IntroArrayList {
	//Java���� ���������� ��� Ŭ������ ���ڷ� �޴� �޼���� Object�� ��찡 ����.
	public static void printInfo(Object obj) {
		System.out.print(obj.getClass() +":"+obj+"\n");
	}
	public static void main(String[] args) {
		//���� ������ �迭�̴�
		//��, �����Ͱ� �þ�� �˾Ƽ� ���ο� �迭�� �Ҵ��Ѵ�.
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		//�������� ����
		list.add(11); //JDK1.5���ʹ� Primitive -> Integer�� �ڵ���ȯ
		list.add(22);
		list.add(33);
		
		//������ ���
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i).getClass());
		}
		
		//������ ����
		//array�� Ư���� �ش� ������ �迭�� ���� �� ĭ�� ������ ����.
		list.remove(0); //�ε��� 0���� ����
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------------");
		printInfo(new Integer(100)); //JDK 1.5����
		printInfo(100);
		Integer i = 100;
		printInfo(i);
	}
}

/*
 * Array : �������� ����
 *  ->��ü ����, ��ü ��� 
 * LinkedList : ������ ����
 * ->�߰��� ���÷� ������ ���� 
 */