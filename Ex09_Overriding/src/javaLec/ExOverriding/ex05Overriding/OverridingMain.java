package javaLec.ExOverriding.ex05Overriding;
/* �θ��� ���� ������ �ڽ� ��ü�� ���� �� �ִ�.
 * �θ� �ڽ��� �����Ѵ�.
 * �θ�(Generalization) �ڽ�(Realization)
 * Lion is kind of Mammal
 * 
 * ���� ���� ������ �θ� ������ �͸� ȣ���� �� �ִ�.
 * */
public class OverridingMain {
public static void main(String[] args) {
  
   BaseSpeaker ba=new BaseSpeaker();
   ba.setvolume(10);
   //�θ� ���� ���������� �ڽ� ��ü�� �޼��带 ȣ��Ұ�
   
   //c++������ �θ����������� ���� �θ� ��ü �޼��带 ȣ��ȴ�
   //������ �ڹٿ����� ���Ǽ��� ���󰬴�.
   
   //������ �޼��� overriding�� ��쿡�� ���� ��ü�� �޼��带 ȣ��
   ba.setBaseSpeaker(50);
   ba.showCurrentState();
}
}