package javaLec.ExException.ex06_ThrowJVM;

import java.util.Scanner;

//�츮�� �����ϴ� Exception Ŭ����
//����� ���� ����ó�� Ŭ����
class AgeInputException extends Exception {
	AgeInputException(String ex) {
		super(ex);
	}
}

public class ProgrammerDefineException {
	/* readAge() ������ AgeInputException�� �߻��ϸ� ���� ȣ���� ������ �����ڴ�. */
	public static int readAge() throws AgeInputException { // �� �ڵ忡���� �������� ����
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if (age < 0) {
			AgeInputException excpt = new AgeInputException("��ȿ���� ���� ���� �ԷµǾ����ϴ�.");
			throw excpt; // ���ܸ� (������) �߻�
		}
		return age;
	}

	public static void main(String[] args) throws AgeInputException {
		System.out.println("���̸� �Է��ϼ���: ");
		int age = readAge();
		System.out.println("�����" + age + "�� �Դϴ�.");

	}
}
