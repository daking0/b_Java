package javaLec.ExOverriding.ex11FriendInfoService;

import java.util.Scanner;
class MENU{ //정적 필드
	final static int HIGH_FRIEND = 1;
	final static int UNIV_FRIEND = 2;
	final static int SHOW_ALL = 3;
	final static int SHOW_SIMPLE = 4;
	final static int EXIT_PROGRAM = 5;
	
	//이렇게하면 switch에서 코드 읽기가 쉽다
}
public class FriendInfoView {
	FriendInfoController controller;
	FriendInfoView(){
		int num = getFriendNum();
		controller = new FriendInfoController(num);
	}
	int getFriendNum() {
		System.out.println("친구 몇 명 저장하실래요?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	void viewMenu() {
		System.out.println("*** 메뉴 선택 ***");
		System.out.println("1.고교 정보 저장");
		System.out.println("2.대학 친구 저장");
		System.out.println("3.전체 정보 출력");
		System.out.println("4.기본 정보 출력");
		System.out.println("5.프로그램 종료");
	}
	
	int getUserSelect() {
		System.out.print("선택 >>> ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
	}
	
	boolean runChoice(int choice) {
		switch(choice) {
		case MENU.HIGH_FRIEND:
		case MENU.UNIV_FRIEND:
			controller.addFriend(choice);
			break;
		case MENU.SHOW_ALL:
			controller.showAllData();
			break;
		case MENU.SHOW_SIMPLE:
			controller.showAllSimpleDate();
			break;
		case MENU.EXIT_PROGRAM:
			System.out.println("프로그램을 종료합니다.");
			return false;
		}
		return true;
	}
	
	void menuLoop() {
		while(true) {
			viewMenu();
			int choice = getUserSelect();
			boolean isRun = runChoice(choice);
			if(isRun == false)
				break;
		}
	}
}
