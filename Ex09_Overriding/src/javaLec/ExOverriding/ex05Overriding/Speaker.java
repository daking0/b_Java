package javaLec.ExOverriding.ex05Overriding;

public class Speaker {
	   private int volumeRate;
	   void showCurrentState() {
	      System.out.println("º¼·ý Å©±â : "+volumeRate);
	   }
	   void setvolume(int vol) {
	      volumeRate=vol;
	   }
}
