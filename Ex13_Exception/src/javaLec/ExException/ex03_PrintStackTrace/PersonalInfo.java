package javaLec.ExException.ex03_PrintStackTrace;

public class PersonalInfo {
	String name;
	int age;
	public PersonalInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPersonalInfo() {
		System.out.println("�̸�: "+ name);
		System.out.println("����: "+ age);
	}
}
