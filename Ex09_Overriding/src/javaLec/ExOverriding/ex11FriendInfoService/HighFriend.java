package javaLec.ExOverriding.ex11FriendInfoService;

public class HighFriend extends Friend {
	String work;

	HighFriend(String name, String phone, String addr, String job) {
		super(name, phone, addr);
		this.work = job;
	}
	
	void showData() {
		super.showData(); //name, phone, addr �����ִ� �θ� ���
		System.out.println("����: "+work);
	}
	
	void showBasicInfo() {
		System.out.println("�̸�: "+name);
		System.out.println("��ȭ: "+phoneNum);
		System.out.println("�ּ�: "+addr);
	}

}
