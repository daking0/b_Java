package javaLec.ExGeneric.ex01OrangeApple;

class CCC{
	public String toString() {
		return "Class CCC";
	}
}

class DDD{
	public String toString() {
		return "Class DDD";
	}
}

class InstanceTypeShower2{
	public <T1, T2> void showInstType2(T1 inst1, T2 inst2) {
		System.out.println(inst1);
		System.out.println(inst2);
	}
}

public class IntroGenericMethod2 {
	public static void main(String[] args) {
		CCC ccc = new CCC();
		DDD ddd = new DDD();
		InstanceTypeShower2 shower = new InstanceTypeShower2();
		shower.<CCC, DDD>showInstType2(ccc,ddd);
	}
}