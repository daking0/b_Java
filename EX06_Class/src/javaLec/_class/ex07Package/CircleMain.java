package javaLec._class.ex07Package; //�� Ŭ���� �Ҽ� ��Ű��

import javaLec._class.ex08Package.Triangle; //�ٸ� ��Ű�� Ŭ���� ���� ����ϰڴ�
//import javaLec._class.ex08Package.Circle;  ->07���� ������ Circle�� �����ϱ� ���Ұ�

/*<��Ű��>
 *1)package�� class���� ���� �з� �����̸�, ���ÿ� ���������̴�
 *2) class ���۽� ������ package���� ���� ������ default package�Ҽ��� �ȴ�.
 *3)�ٸ� package�� Ŭ������ ����ϰ� ������ import�� �Ѵ� - ����Ű�� Ctrl + Shift + o
 *4)import ���� ����� �� �ִ� package�� �ڱ��ڽ��� ���� package�� java.lang�̴�
 *5)java���� ������ ����������(private, protected, publie)�� ���� ������ default ���ٱ����� ������ �ȴ�.
 *default ���� ������ ���� ��Ű���������� ���ٰ����ǹ�
 *
 *public���� �ϸ� ��𼭵� ���� 
 */
/*<��Ű�� ������>
 * 1)ȸ���̸��� �������� ����� ��찡 �����ִ�
 *  ���� ��� www.bitcamp.co.kr�� ���������� ������ ȸ��� ��Ű���� ������ �� kr.co.bitcamp�� ����� ��찡 �����ִ�.
 * 2)�ֻ��� ��Ű���� <ȸ���� ������> -unique(���ϼ�)
 * �߰� ��Ű���� ����̸�/����
 * ���� �Ʒ� ��Ű���� ��Ű�� ���� �ִ� Ŭ������ ����
 */

/*���� ����
 * public(������) : ��𼭳� ������� ���� ȣ�Ⱑ��
 * protected(��ȣ�ϴ�) : ��Ű���� ����, �ٸ� ��Ű���� ����̸� ���� ȣ�Ⱑ��
 * defaulat : ���� ��Ű���� ���� ȣ�Ⱑ��
 * private (��������) : Ŭ���� �������� ���� ȣ�Ⱑ��
 */

public class CircleMain {
	public static void main(String[] args) {
		Circle cc = new Circle(2);
		System.out.println(cc.circleArea());
		Triangle ta = new Triangle(2,3);
		System.out.println(ta.getTriangleArea());
		javaLec._class.ex08Package.Circle circle = new javaLec._class.ex08Package.Circle(3);
		System.out.println(circle.circlePerimeter());
		
	}
}



