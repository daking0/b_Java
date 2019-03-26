package javaLec.ExOverriding.ex02HasAExtends;

public class Police extends Gun {
	int handcuffs; //¼ö°© °³¼ö
	
	Police(int bnum, int bcuff) {
		super(bnum);
		this.handcuffs = bcuff;
	}
	
	void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}

}
