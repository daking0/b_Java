/*Method(Java���� �Լ��� ����Ű�� ���)
 * Function
 * 
 * ���� = ��� + ���� = �־� + ����
 * ���α׷��� = ���� + �޼���
 *
 *<����� ����>
 * 1) �ڵ尡 ������� �Ǹ� �������� ���Ͽ� ���� ������ �з�
 *  k5 - ��ǰ ���ȭ, 1������ �̻��� ����� �� �κи� ����
 *  (���� ����� ����ȴ�)
 * 2) �ߺ� �ڵ带 �̸����θ� ȣ���ϱ� ����
 * 3)������ ���� �ϱ� ����
 * <�޼����� ����>
 * ����                     �����                ��, ��
 * returnValue �޼���� (arguementValue){
 * }
 * ���ϰ�(returnValue)�� int, double, int[], Ŭ���� ��
 * return �ش� retrun��;�� �ʹ� �Ѵ�.
 * ���ϰ�(returnValue)�� void�̸� �ƹ� ���� ��ȯ���� �ʴ� �ٴ� �ǹ��̹Ƿ�
 * return�� �����ϰų� �׳� return�� ���ָ� �ȴ�.
 * return�� �ǹ̴� �� �Լ��� ȣ���� ������ ���ư���
 * 
 * y=2x+1 ���� y�� return��/ 2x+1�� �Լ���/x�� �Ű�����
 * static �޼���
 * ->
 * Ŭ������ ���� �� ��ü�� ������ �ʾƵ� �ٷ� �޸𸮿� �ε� 
 */
public class _01_MethodDefAdd {
	public static void main(String[] args) {
		System.out.println("���α׷��� ����");
		//_01_MethodDefAdd.hiEveryOne(12);  �̷��� ������, ���� class�� ���� ����
		hiEveryOne(12); //�ٸ� Ŭ�����϶��� �־��ֱ�.
		hiEveryOne(13);
		System.out.println("���α׷��� ��");
	}
	
	public static void hiEveryOne(int age) { 
		System.out.println("���� ��ħ�Դϴ�.");
		System.out.println("�� ���̴�" + age + "�Դϴ�.");
			return; //�ƹ� ������� ���� ���ư���. �߰��� ���� break�� ��ɵ� ����
		//void���� return; ����
	}
}


/* class ������ �����ϴ� ���
public class _01_MethodDefAdd {
	public static void main(String[] args) {
		System.out.println("���α׷��� ����");
		Hi.hiEveryOne(12); //�ٸ� Ŭ�����϶��� �־��ֱ�
		Hi.hiEveryOne(13);
		System.out.println("���α׷��� ��");
	}
	


class Hi{
	public static void hiEveryOne(int age) { 
		System.out.println("���� ��ħ�Դϴ�.");
		System.out.println("�� ���̴�" + age + "�Դϴ�.");
	}
}
 */
