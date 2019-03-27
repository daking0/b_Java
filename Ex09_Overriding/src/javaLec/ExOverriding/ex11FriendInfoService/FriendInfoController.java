package javaLec.ExOverriding.ex11FriendInfoService;

import java.util.Scanner;

public class FriendInfoController {
	private Friend[] myFriends; //ģ�� ��ü ���� �迭
	private int numOfFriends; //����� ģ����
	
	//������
	FriendInfoController(int num){
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	
	//ģ�� �߰� �޼���
	void addFriendInfo(Friend fren) {
		myFriends[numOfFriends++] = fren;
	}
	
	//� ģ�� �����ҷ�
	void addFriend(int choice) {
		String name, phoneNum, addr, job, major;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�: ");
		name = sc.nextLine();
		System.out.println("��ȭ: ");
		phoneNum = sc.nextLine();
		System.out.println("�ּ�: ");
		addr = sc.nextLine();
		
		if(choice ==1) {//����б� ģ����?
			System.out.println("����: ");
			job = sc.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		}else if(choice == 2) {//���б� ģ����?
			System.out.println("�а�: ");
			major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
		}
		System.out.println("------�Է� �Ϸ� -------\n");
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
