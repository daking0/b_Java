package javaLec.ExOverriding.ex12AbstaractClass;
/* �߻� �޼��尡 1���̻� ������ �߻� Ŭ����
 * ���� �ȵ� �޼��尡 �����Ƿ� ��ü ������ �ȵ�
 * ������ ����� ������ ������� Ŭ����
 * 1)�ڽ� Ŭ������ �߻� �޼��带 ������ �����ؾ� ��ü ������ �ȴ�
 * 2)�߻� Ŭ������ ���������� �����ϰ�, �ڽ� Ŭ������ ��ü�� ��´�
 */
public abstract class Friend {
	String name;
	String phoneNum;
	String addr; //private���� �ϸ� �ڽ����� ����� ������, �ڽ��� ������
	
	Friend(){
		name = "ģ��";
		phoneNum ="000-0000-0000";
		addr = "����";
	}
	
	Friend(String name, String phone, String addr){
		this.name = name;
		this.phoneNum = phoneNum;
		this.addr = addr;
	}
	
	//��ü ������ ���
	void showData() {
		System.out.println("�̸�: "+ name);
		System.out.println("��ȭ��ȣ: "+ phoneNum);
		System.out.println("�ּ�: "+ addr);
	}
	
	//�Ϻ� ������ ���
	abstract void showBasicInfo(); 
}
