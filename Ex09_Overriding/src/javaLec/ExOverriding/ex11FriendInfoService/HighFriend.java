package javaLec.ExOverriding.ex11FriendInfoService;

public class HighFriend extends Friend {
	String work;

	HighFriend(String name, String phone, String addr, String job) {
		super(name, phone, addr);
		this.work = job;
	}
	
	void showData() {
		super.showData(); //name, phone, addr 보여주는 부모 기능
		System.out.println("직업: "+work);
	}
	
	void showBasicInfo() {
		System.out.println("이름: "+name);
		System.out.println("전화: "+phoneNum);
		System.out.println("주소: "+addr);
	}

}
