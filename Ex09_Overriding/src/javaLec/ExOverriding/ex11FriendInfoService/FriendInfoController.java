package javaLec.ExOverriding.ex11FriendInfoService;

import java.util.Scanner;

public class FriendInfoController {
	private Friend[] myFriends; //친구 객체 저장 배열
	private int numOfFriends; //저장된 친구수
	
	//생성자
	FriendInfoController(int num){
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	
	//친구 추가 메서드
	void addFriendInfo(Friend fren) {
		myFriends[numOfFriends++] = fren;
	}
	
	//어떤 친구 저장할래
	void addFriend(int choice) {
		String name, phoneNum, addr, job, major;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름: ");
		name = sc.nextLine();
		System.out.println("전화: ");
		phoneNum = sc.nextLine();
		System.out.println("주소: ");
		addr = sc.nextLine();
		
		if(choice ==1) {//고등학교 친구니?
			System.out.println("직업: ");
			job = sc.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		}else if(choice == 2) {//대학교 친구니?
			System.out.println("학과: ");
			major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
		}
		System.out.println("------입력 완료 -------\n");
	}
	
	void showAllData() {
		for(int i =0; i<numOfFriends; i++) {
			myFriends[i].showData();
			System.out.println();
		}
	}
	
	void showAllSimpleDate() {
		for(int i =0; i<numOfFriends; i++) {
			myFriends[i].showBasicInfo();
			System.out.println();
		}
	}
}
