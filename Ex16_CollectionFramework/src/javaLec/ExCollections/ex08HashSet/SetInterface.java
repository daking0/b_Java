package javaLec.ExCollections.ex08HashSet;
/* HashSet
 * 1) hash�˰���(�����ͺ��̽������� ���)�� ����Ѵ�.
 * 2) �ߺ� �Ұ���
 * 3) ������ �˻��� ���� ���� ����
 * 4) ���� �����͵� ū �����͵� ������ ũ��� �˰��� ���� ��ȯ
 *   ->�ڱ� ��ġ�� ����
 * 5) hash�θ� ��ȯ�Ǹ� �ٷ� ������ ��ġ�� ã�ư���
 * 6) �ϰ�����غ��� hash ������� ����ȴ�
 * �˻��� ���� ������ ����
 */
import java.util.HashSet;
import java.util.Iterator;

public class SetInterface {
	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("First");
		hSet.add("Second");
		hSet.add("Third");
		hSet.add("First");
		System.out.println("����� ������ ��: "+hSet.size());
		Iterator<String> itr = hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
