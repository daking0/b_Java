/*���� ����ȯ(����� ����ȯ)
 * ū ������ ���ڸ� ���� ������ ���ڷ� �������� �� ��
 * �׳��� ������ �������� ���ƹ����ϱ� 
 * �ʿ��ϸ� ��������� ��ȯ�ϰڴٰ� ����
 */
public class _11_ForceTransType {

	public static void main(String[] args) {
		//�����Ͱ� �߸��� ���
//		int num =128;
//		byte bNum = (byte)num;
//		System.out.println(bNum);
		//���� 2����Ʈ�� short�� �������� �����Ƿ� 
		//char�� ���ڹ����� ��������� �� �д�
//		char ch = 'A';
//		short s = ch;
//		System.out.println(s);
		
		//���� 4byte������ �Ǽ��� float�� ������ ũ��
		//int�� ����Ǹ� �Ҽ����� �������
//		float f = 13.3F;
//		int num = (int)f;
//		System.out.println(num);
		
		//long 8byte, float 4 byte �ε� �Ǽ��� ������ �� ũ�� 
		//ǥ�������� float > long�̹Ƿ� ���� ����
		long lval = 1234L;
		float fNum = lval;
		System.out.println(fNum);
	};

}
