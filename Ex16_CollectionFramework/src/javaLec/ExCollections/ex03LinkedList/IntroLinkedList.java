package javaLec.ExCollections.ex03LinkedList;

import java.util.LinkedList;
/* ��ũ�� ����Ʈ(���� ����Ʈ)
 * 1) �������� ���ӵ� ����Ʈ
 * 2) �ʿ��� �� ������ �Ҵ��ϸ� �ȴ�.
 * 3) ���� �˻��� Array���� ������
 * 4) �߰� : ��ü�Ҵ�, ���� Element�� ���ο� ��ü ����Ű�� ��
 * 5) ���� : ���� Element�� ���� ����Ű�� ��, ���� ���� Element�� ����Ű�� ��
 * 6) ���� : ���� Element�� ���� Element�� ����Ű�� �� 
 * 7) Ȯ�� : �߰��� ������
 * ����/������ ���� ����� �������� ���濡 ������
 * ���Ľ� ���� ���� ����Ʈ�� ��� Head�� Tail�κ��� ������ ������ �� �ְ�,�ٷ� jump�� �ȵȴ�.(�׳� ��� ���󰡾� �Ѵ�.)
*/
public class IntroLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		//�������� ����
		list.add(11);
		list.add(22);
		list.add(33);
		
		//�������� ���
		System.out.println("----------------");
		for(int i=0; i <list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//�������� ����
		System.out.println("----------------");
		list.remove(0);
		for(int i=0; i <list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}
