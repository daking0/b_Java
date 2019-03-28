package javaLec.ExInterface.ex02_IPersonalNumberStorage;

//µ•¿Ã≈Õ ∞¥√º
public class PersonalNumInfo {
	private String name;
	private String number;
	
	PersonalNumInfo(String name, String number){
		this.name = name;
		this.number = number;
	}
	
	String getName() {
		return name;
	}
	
	String getNumber() {
		return number;
	}
}
