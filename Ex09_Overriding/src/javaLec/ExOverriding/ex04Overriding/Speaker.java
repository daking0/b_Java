package javaLec.ExOverriding.ex04Overriding;

public class Speaker {
	   private int volumeRate;
	   void showCurrentState() {
	      System.out.println("���� ũ�� : "+volumeRate);
	   }
	   void setvolume(int vol) {
	      volumeRate=vol;
	   }
}
