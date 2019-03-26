package javaLec.ExOverriding.ex03HasA;

public class Police {
	String hat;
	String cloth;
	Police(String hat, String cloth){
		this.hat = hat;
		this.cloth = cloth;
	}
	
	void putOnCloth() {
		System.out.println(this.hat + "과"+ cloth +"를 착용한다");
	}
}
