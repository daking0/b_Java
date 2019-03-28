package javaLec.ExInterface.ex01_APersonalNumberStorage;

public class PerosnalMain {
	public static void main(String[] args) {
		PersonalNumberStroageImpl storage = new PersonalNumberStroageImpl(100);
		APersonalNumberStorage sto = storage;
		storage.addPersonalInfo("È«±æµ¿", "112211-332255");
		storage.addPersonalInfo("ÀÓ²©Á¤", "332211-775555");
		
		System.out.println(storage.searchName("112211-332255"));
		System.out.println(storage.searchName("332211-775555"));
	}
}
