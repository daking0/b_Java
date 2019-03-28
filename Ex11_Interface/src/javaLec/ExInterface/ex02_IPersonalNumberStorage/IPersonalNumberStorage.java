package javaLec.ExInterface.ex02_IPersonalNumberStorage;
/* 100% 추상 메서드를 가진 추상 클래스는 Interface와 동일하다. */
//public abstract class IPersonalNumberStorage {
//	public abstract void addPersonalInfo(String name, String perNum);
//	
//	public abstract String searchName(String perNum);
//}


/* interface의 메서드는 자동으로 public abstract가 부여된다.
 *
 */

public interface IPersonalNumberStorage {
	void addPersonalInfo(String name, String perNum);
	String searchName(String perNum);
}