package javaLec.ExOverriding.ex02HasAExtends;

public class NursingPolice extends Police {
	int thermometer; //ü�°� ����
	NursingPolice(int bnum, int bcuff, int tnum) {
		super(bnum, bcuff);
		thermometer = tnum;
	}
	
	void calcThermometer() {
		System.out.println("36.5��");
		thermometer--;
	}

}
