package javaLec.ExCollections.ex01ArrayList;

import java.util.ArrayList;
/* Array ����
 * 1) ���������� �������� ������ ������
 * 2) �������� ������ �߰��� �������� ��¿����� ���� ���� ����
 * 3) �˻� : �� ���ڸ� ���� �ڿ��� ã�´�.
 * 4) ���� : �߰��� ���� �� �ڿ� �ִ� �����͸� ���� �ڷ� �о�� ��
 * 5) ���� : �߰����� ������ �� �ڿ��ִ� �����͸� ���� ������ ��ܾ� ��
 * 6) Ȯ�� : ���������� ���ӵ� ������ Ȯ������ ���ϸ� ���ο� ������ �Ҵ��ϰ� ���� �����Ѵ�.  
 * 
 * �������� �����̴�.
 */
public class IntroArrayList {
	public static void main(String[] args) {
		//���� ������ �迭�̴�
		//��, �����Ͱ� �þ�� �˾Ƽ� ���ο� �迭�� �Ҵ��Ѵ�.
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		//�������� ����
		list.add(new Integer(11));
		list.add(new Integer(22));
		list.add(new Integer(33));
		
		//������ ���
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//������ ����
		//array�� Ư���� �ش� ������ �迭�� ���� �� ĭ�� ������ ����.
		list.remove(0); //�ε��� 0���� ����
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}

/*
 * Array : �������� ����
 *  ->��ü ����, ��ü ��� 
 * LinkedList : ������ ����
 * ->�߰��� ���÷� ������ ���� 
 */