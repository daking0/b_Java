package javaLec.ExExtends.ex02Extends;
/* �ʵ�� �޼��� ��� ��ӵȴ�.
 * ����̶�� ������ ���� ������ ��� FrameWork ���� ������ �� �־���.
 * Framework�� ��ӹ������� ���� ��� ����� �����ް� �Ϻ� ��ɸ� Customizing�����ν� ���� ���α׷��� ��������
 */
public class ExtendsMain {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.handsome();
		ch.wealth();
		ch.play();
		System.out.println("�߻��� ����: "+ ch.handsomeScore);
		
		System.out.println("��: "+ ch.money + "$");
		System.out.println("��� ��: "+ch.day +"��");
	}

}
