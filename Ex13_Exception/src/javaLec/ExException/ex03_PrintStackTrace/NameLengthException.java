package javaLec.ExException.ex03_PrintStackTrace;

public class NameLengthException extends Exception {
	String wrongName;
	public NameLengthException(String name) {
		super("�߸��� �̸��� ���ԵǾ����ϴ�.");
		wrongName = name;
	}
	public void showWrongName() {
		System.out.println("�߸� �Էµ� �̸�: "+wrongName);
	}
}
