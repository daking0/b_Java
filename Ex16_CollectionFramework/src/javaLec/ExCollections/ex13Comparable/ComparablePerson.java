package javaLec.ExCollections.ex13Comparable;

import java.util.Iterator;
import java.util.TreeSet;

/* ������ ������ �츮�� ���Ϸ��� Comparable ����� �޴´�
 * 
 */
class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showData() {
		System.out.printf("%s %d \n", name, age);
	}
	public int compareTo(Person p) {
		if(name.length() > p.name.length()) { 
			return 1;
		}
		else if(name.length() < p.name.length()) { 
			return -1;
		}
		else return 0;
	}
}

public class ComparablePerson {
	public static void main(String[] args) {
		TreeSet<Person> sTree = new TreeSet<Person>();
		sTree.add(new Person("Rasberry", 24));
		sTree.add(new Person("Melon", 29));
		sTree.add(new Person("Strawberry", 21));
		Iterator<Person> itr = sTree.iterator();
		while(itr.hasNext()) {
			itr.next().showData();
		}
	}
}
