package javaLec.ExOverriding.ex11FriendInfoService;

public class Friend {
	String name;
	String phoneNum;
	String addr; //private���� �ϸ� �ڽ����� ����� ������, �ڽ��� ������
	
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
	void showBasicInfo() {
		
	}
}
