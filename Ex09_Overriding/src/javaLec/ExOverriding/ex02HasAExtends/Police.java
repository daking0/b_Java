package javaLec.ExOverriding.ex02HasAExtends;

public class Police extends Gun {
	int handcuffs; //���� ����
	
	Police(int bnum, int bcuff) {
		super(bnum);
		this.handcuffs = bcuff;
	}
	
	void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}

}
