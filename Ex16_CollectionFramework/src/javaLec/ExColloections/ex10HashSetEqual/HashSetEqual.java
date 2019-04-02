package javaLec.ExColloections.ex10HashSetEqual;

import java.util.HashSet;
import java.util.Iterator;
/* HashSet�� ���������� ���� ������ ���ϴ� 2�ܰ� ������ �ִ�
 * 1) ObjecrŬ�����κ��� ��ӹ��� hasoCode() �޼����� �ؽð��� ��
 * 2) ObjectŬ�����κ��� ��ӹ��� equals() �޼����� ��ȯ���� ��
 *  �츮�� ���� Ŭ������ ����Ϸ��� 2�� �޼��带 �������̵� �ؾ��Ѵ�.
 */
class SimpleNumber{
	int num;
	SimpleNumber(int n){
		num = n;
	}
	public String toString() {
		return String.valueOf(num);
	}
	public int hashCode() {
		return num; 
	}
	public boolean equals(Object obj) {
		SimpleNumber comp = (SimpleNumber)obj;
		if(comp.num == num) {
			return true;
		}else {
			return false;
		}
	}
}

public class HashSetEqual {
	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20));
		System.out.println("����� ������ ��: "+ hSet.size());
		Iterator<SimpleNumber> itr = hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
