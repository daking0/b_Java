package javaLec.ExAbstract.ex03equals;
/* Object Ŭ�����κ��� ��ӹ��� �޼��� �߿� ���� ���� Overriding�Ǵ� method�� equals�� toString�̴�.
 * 1)toString�� ��ü�� ������ ��Ÿ���� �޼���
 *  -��ü�� null�� ���� null�� ��ȯ�Ѵ�
 *  -�⺻������ [��Ű�� + Ŭ�����̸� +@+16����]�� ������ hashcode�� ��ȯ�Ѵ�
 *  -System.out.println(��ü); �� �� �������� ����, ���� ���ϴ� ������ �������� �ϴµ� ���� ���ȴ�.
 *  �׷��� String ���� ���� overriding�Ǿ ��ü������ �ƴ϶� ���ڿ� �������� ���ϰ� �ȴ�.
 *  
 *  2)equals�� ==�� �뵵�� �����ϴ�
 *   -�� ��ü�� ������(hashcode)�� ���� �� �ٸ� ���� �Ǵ��Ͽ� boolean���� ��ȯ�Ѵ�.
 *   �׷��� String ���� ���� overriding�Ǿ �������� �ƴ϶� ���ڿ� �������� ���ϰ� �ȴ�.
 *   String�� ==�� ���ϸ� ���������� ���ϰ� �ȴ�.
 *   �Ϲ����� Ŭ������ equals�� overriding�ؼ� String Ŭ����ó�� ���� ������ �����ڰ� ���� �� �ִ�.
 */
public class Ball {
	private double radius;
	
	public Ball(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "�� ���� ��������" + radius;
	}
	
	public boolean equals(Object obj) {
		return this.radius == ((Ball)obj).radius;
	}
	
	public static void main(String[] args) {
		Ball ball1 = new Ball(30);
		Ball ball2 = new Ball(30);
		System.out.println(ball1);
		System.out.println(ball2);
		System.out.println(ball1 == ball2); //hash�� ���ؼ� false
		System.out.println(ball1.equals(ball2)); //������ �񱳷� ���������ϱ� true
	}
}

