
public class _08_StringCOmpare {
	public static void main(String[] args) {
		String str1 = "Smart";
		String str2 = "Smart";
		String str3 = new String("Smart");
		String str4 = "Simple";
		
		if(str1 == str2)
			System.out.println("str1�� str2 �ν��Ͻ� ����"); //�̰Ÿ� ��µ�
		if(str1 == str3)
			System.out.println("str1�� str3 �ν��Ͻ� ����");
		if(str1 == str4)
			System.out.println("str1�� str4 �ν��Ͻ� ����");
		
		//���ڿ� ���� ���� ���� �ݵ�� equals�� ���
		if(str1.equals(str2))
			System.out.println("str1�� str2 ���ڿ� ����"); //��µ�
		if(str1.equals(str3))
			System.out.println("str1�� str3 ���ڿ� ����"); //��µ�
		if(str1.equals(str4))
			System.out.println("str1�� str4 ���ڿ� ����");
		//�ٸ� ��
		if(!str1.equals(str4))
			System.out.println("str1�� str4 ���ڿ� �ٸ�"); //��µ�
		if(str1.equals(str4) == false)
			System.out.println("str1�� str4 ���ڿ� �ٸ�"); //��µ�
		
		/* compareTo �� ���� ���ڿ��̸� 0�� ����
		 * ������ ����(���ĺ� ���ļ���) �տ� ��ġ�ϸ� ���� / �ڿ� ��ġ�ϸ� ����� ����
		 */
		if(str1.compareTo(str2) == 0)
			System.out.println("str1�� str2 ���ڿ� ����"); //���
		if(str1.compareTo(str3)==0)
			System.out.println("str1�� str3 ���ڿ� ����"); //���
		
		int nCmp = str1.compareTo(str4);
		if(nCmp ==0)
			System.out.println("str1�� str4 ���ڿ� ����");
		else if(nCmp <0)
			System.out.println("�տ� ��ġ");
		else
			System.out.println("�ڿ� ��ġ"); //���
		
		//�ٸ� ��
		if(str1.compareTo(str3)!=0)
			System.out.println("str1�� str3 ���ڿ� �ٸ�"); 
	}
}
