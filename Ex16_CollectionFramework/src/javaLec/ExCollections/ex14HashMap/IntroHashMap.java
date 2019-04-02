package javaLec.ExCollections.ex14HashMap;
/* Hash�� Hash�˰������� ��Ȯ�� ��ġ�� ������ ����/�˻�
 * Set : value���� Hashȭ�ؼ� ����/�˻�
 * Map : key/value�� �ְ� key�� Hashȭ�ؼ� ��ġ�� ���� �� �����ϴ� ���� value�� �����Ѵ�
 *		 key: ���¹�ȣ / value : ��
 * Map == (�����) Dictionary����
 */
import java.util.HashMap;

public class IntroHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>(); //<Integer, String> �տ��� Ű �ڿ��� ����
		hMap.put(new Integer(3), "ȫ�浿");
		hMap.put(5, "�Ӳ���");
		hMap.put(8, "����");
		System.out.println(hMap.get(8));
		System.out.println(hMap.get(5));
		System.out.println(hMap.get(3));
		hMap.remove(5);
		System.out.println(hMap.get(5));
	}
}
