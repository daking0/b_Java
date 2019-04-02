package javaLec.ExCollections.ex09HashSetEqual;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber{
	int num;
	SimpleNumber(int n){
		num = n;
	}
	public String toString() {
		return String.valueOf(num);
		//return num+"";
	}
}

public class HashSetEqual {
	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		
		//2��° 20 ������ ��ü�� 3��° 20 ������ ��ü�� hashcode�� �ٸ���.
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
