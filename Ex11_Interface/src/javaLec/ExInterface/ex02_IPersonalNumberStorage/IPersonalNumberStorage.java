package javaLec.ExInterface.ex02_IPersonalNumberStorage;
/* 100% �߻� �޼��带 ���� �߻� Ŭ������ Interface�� �����ϴ�. */
//public abstract class IPersonalNumberStorage {
//	public abstract void addPersonalInfo(String name, String perNum);
//	
//	public abstract String searchName(String perNum);
//}


/* interface�� �޼���� �ڵ����� public abstract�� �ο��ȴ�.
 *
 */

public interface IPersonalNumberStorage {
	void addPersonalInfo(String name, String perNum);
	String searchName(String perNum);
}