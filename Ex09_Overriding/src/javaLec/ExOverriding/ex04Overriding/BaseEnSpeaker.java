package javaLec.ExOverriding.ex04Overriding;

/*�޼��� �������̵�(Method Overriding)
 *�θ� �̹� ������ ���� �޼��带 ����ϰų� �߰�Ȯ���ϴ� ���� ���´´�.
 *��, �ڽ� Ŭ������ �θ�޼���� ������ �޼��带 �����ϴ� ��
 */
/* overloading�� overriding�� ����
 * overlodaing(������) ->���� �Ǿ���. 
 *                   =>�Ű����� �ٸ� ���� �̸� �Լ� ������
 * overriding => over + riding
 * 
 */
public class BaseEnSpeaker extends Speaker {
	   private int baseRate;
	   
	   void showCurrentState(){
	      super.showCurrentState(); //�θ� ��� ���
	      System.out.println("���̽� ũ�� : "+baseRate);
	   }
	//   //�θ����� ����Ѵ�.
	//   void showCurrentState() {
//	      System.out.println("���̽� ũ�� : "+baseRate);
	//   }
	   void setBaseSpeaker(int base) {
	      baseRate=base;
	   }
	
}
