package javaLec.ExOverriding.ex05Overriding;

public class BaseSpeaker extends Speaker {

	   private int baseRate;
	   
	   void showCurrentState(){
	      super.showCurrentState();
	      System.out.println("���̽� ũ�� : "+baseRate);
	   }
	   void setBaseSpeaker(int base) {
	      baseRate=base;
	   }
}