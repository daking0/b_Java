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
		
		//2번째 20 저장한 객체와 3번째 20 저장한 객체는 hashcode가 다르다.
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20));
		System.out.println("저장된 데이터 수: "+ hSet.size());
		Iterator<SimpleNumber> itr = hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
