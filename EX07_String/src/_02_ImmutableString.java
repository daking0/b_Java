/*
 * == �� ���� ��ü�� ����Ų��(�ؽ��ڵ尡 ���� true)
 * equals �� ���� ��������(���ڿ��� ������ true)
 *
 * String Ŭ������ ���ڿ��� ������ ���� �� ���� ��ü�� ������ �ʰ� ���� ���ڿ��� ����Ű�� �Ѵ�.
 * ������ ���ڿ��� �ټ� �ݺ��Ǵ� ��찡 �����Ƿ� ó������ �޸𸮸� �Ƴ����� �̷��� �����ߴ�.
 */
public class _02_ImmutableString {
	public static void main(String[] args) {
		String str1 = "My String";
		String str2 = "My String";
		String str3 = "My String";
		String str4 = "Your String";
		
		if(str1 == str2)
			System.out.println("���� �ν��Ͻ� ����"); 
		else
			System.out.println("�ٸ� �ν��Ͻ� ����");
		
		if(str1 == str3)
			System.out.println("���� �ν��Ͻ� ����");
		else
			System.out.println("�ٸ� �ν��Ͻ� ����");
		
		if(str1 == str4)
			System.out.println("���� �ν��Ͻ� ����");
		else
			System.out.println("�ٸ� �ν��Ͻ� ����");
	}
}

//���� �ν��Ͻ� ����
//���� �ν��Ͻ� ����
//�ٸ� �ν��Ͻ� ����