/*�ڵ�����ȯ
 ���� ���� ���ڸ� ū ������ ���ڿ� ���� �� �߻�
 */
public class _9_AutoTransType {
	public static void main(String[] args) {
		/*�ڵ�����ȯ�� �Ͼ��
		10�� default int�ε� ���� byte�� ���Ƿ� byte�� ��ȯ�ȴ�.
		b�� byte�ε� 1byte�̹Ƿ� 4byte�� int�� ������Ƿ� �ڵ����� int�� �ٲ������.
		*/
		
		byte b =10;
		int i = b;
		System.out.println(i);
		
		
		/*
		�ڵ�����ȯ�� �Ͼ
		char�� ���������� ������ ����ǰ� 2byte�̹Ƿ� int�� 4byte�� ����.
		�׷��Ƿ� �ڵ�����ȯ�� �Ͼ
		*/
		
		char ch = 'A';
		int j = ch;
		System.out.println(j);
		
		
	}
}
