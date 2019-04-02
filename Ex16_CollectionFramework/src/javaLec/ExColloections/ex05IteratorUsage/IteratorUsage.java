package javaLec.ExColloections.ex05IteratorUsage;
/* Iterator�� ���� �ڷᱸ���� �����ϰ� �����ϴ� �������� ������� Ŭ�����̴�.
 * �ڷᱸ���� ������ �ʿ��� �� ���� ��ƾ�� �մ��ʿ� ���� �ش� �ڷᱸ��(�÷���)�� �ٲٸ� �Ǳ� ������
 * �÷����� ��ȯ�� ��������� ����������.
 * Iterator�� ���ۺ��� ������ �����ϴµ� �Ϲ������� ���ȴ�.
 */
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorUsage {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		
		Iterator<String> itr = list.descendingIterator();
		System.out.println("------------------");
		while(itr.hasNext()) {
			String curStr = itr.next();
			System.out.println(curStr);
			if(curStr.compareTo("Third")==0) {
				itr.remove();
			}
			System.out.println("----------------");
			itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}
}
