package javaLec.ExCollections.ex07IteratorUsage;
import java.util.HashSet;
/* Iterator�� ���� �ڷᱸ���� �����ϰ� �����ϴ� �������� ������� Ŭ�����̴�.
 * �ڷᱸ���� ������ �ʿ��� �� ���� ��ƾ�� �մ��ʿ� ���� �ش� �ڷᱸ��(�÷���)�� �ٲٸ� �Ǳ� ������
 * �÷����� ��ȯ�� ��������� ����������.
 * Iterator�� ���ۺ��� ������ �����ϴµ� �Ϲ������� ���ȴ�.
 */
import java.util.Iterator;

public class IteratorUsage {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		
		Iterator<String> itr = set.iterator();
		System.out.println("------------------");
		while(itr.hasNext()) {
			String curStr = itr.next();
			System.out.println(curStr);
			if(curStr.compareTo("Third")==0) {
				itr.remove();
			}
			System.out.println("----------------");
			itr = set.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}
}
