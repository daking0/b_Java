package javaLec.ExOverriding.ex12AbstaractClass;

public class FriendMain {
	public static void main(String[] args) {
		HighFriend hf = new HighFriend();
		UnivFriend uf = new UnivFriend(); 
		//Friend f = new Friend(); �߻�Ŭ������ ��ü ���� �ȵ�
		Friend[] fArray = new Friend[] {hf,uf};
		for(Friend f : fArray) {
			f.showBasicInfo();
		}
		System.out.println("���� ��");
	}
}
