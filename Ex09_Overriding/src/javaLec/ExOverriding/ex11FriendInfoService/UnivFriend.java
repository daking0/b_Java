package javaLec.ExOverriding.ex11FriendInfoService;

public class UnivFriend extends Friend {
	String major; //�����а�

	UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	
	void showData() {
		super.showData();
		System.out.println("����: "+major);
	}
	
	void showBasicInfo(){
		System.out.println("�̸�: "+name);
		System.out.println("��ȭ: "+phoneNum);
		System.out.println("����: "+major);
	}
}
