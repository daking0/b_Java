/*��������(Local Variable)�� {}�߰�ȣ ������ �����ϴ� ����
 *�޼��尡 ȣ��Ǹ� ���� �޸𸮿� �ε��ȴ�
 *{}�� ������ ���ÿ��� �������
 *�ش� ���������� ����� �� �ְ�, ���� �ٸ� ���� ���� �ѱ���� return ����ؾ��Ѵ�
 */
public class _13_LocalVariable {
	public static void main(String[] args) {
		boolean scope = true;
		if(scope) {
			int num =1; //if�� ����
			num++;
			System.out.println(num);
		}else {
			int num = 5; //else�� ����
			System.out.println(num);
		}
		simple();
	}
	
	public static void simple() {
		int num =3; //simple�� ����
		System.out.println(num);
	}
}

//���� num �̿��� ������ ������ �� �ٸ� �����̴�.