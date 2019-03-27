package javaLec.ExOverriding.ex11FriendInfoService;

import java.util.Scanner;
class MENU{ //���� �ʵ�
	final static int HIGH_FRIEND = 1;
	final static int UNIV_FRIEND = 2;
	final static int SHOW_ALL = 3;
	final static int SHOW_SIMPLE = 4;
	final static int EXIT_PROGRAM = 5;
	
	//�̷����ϸ� switch���� �ڵ� �бⰡ ����
}
public class FriendInfoView {
	FriendInfoController controller;
	FriendInfoView(){
		int num = getFriendNum();
		controller = new FriendInfoController(num);
	}
	int getFriendNum() {
		System.out.println("ģ�� �� �� �����ϽǷ���?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	void viewMenu() {
		System.out.println("*** �޴� ���� ***");
		System.out.println("1.�� ���� ����");
		System.out.println("2.���� ģ�� ����");
		System.out.println("3.��ü ���� ���");
		System.out.println("4.�⺻ ���� ���");
		System.out.println("5.���α׷� ����");
	}
	
	int getUserSelect() {
		System.out.print("���� >>> ");
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
			System.out.println("���α׷��� �����մϴ�.");
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
