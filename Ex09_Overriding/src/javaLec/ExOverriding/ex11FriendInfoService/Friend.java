package javaLec.ExOverriding.ex11FriendInfoService;

public class Friend {
	String name;
	String phoneNum;
	String addr; //private으로 하면 자식한테 상속은 되지만, 자식이 사용못함
	
	Friend(String name, String phone, String addr){
		this.name = name;
		this.phoneNum = phoneNum;
		this.addr = addr;
	}
	
	//전체 데이터 출력
	void showData() {
		System.out.println("이름: "+ name);
		System.out.println("전화번호: "+ phoneNum);
		System.out.println("주소: "+ addr);
	}
	
	//일부 데이터 출력
	void showBasicInfo() {
		
	}
}
