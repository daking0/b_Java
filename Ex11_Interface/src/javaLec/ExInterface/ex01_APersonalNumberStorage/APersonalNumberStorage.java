package javaLec.ExInterface.ex01_APersonalNumberStorage;
/* 100% 추상 메서드를 가진 추상 클래스는 Interface와 동일하다. */
public abstract class APersonalNumberStorage {
	public abstract void addPersonalInfo(String name, String perNum);
	
	public abstract String searchName(String perNum);
}
