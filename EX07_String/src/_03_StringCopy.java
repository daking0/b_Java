
public class _03_StringCopy {
	public static void main(String[] args) {
		String str1 = "Lemon";
		String str2 = "Lemon";
		String str3 = new String(str2); //�̷����ϸ� �ٸ� �ν��Ͻ�
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		if(str1 == str2)
			System.out.println("���� �ν��Ͻ� ����");
		else
			System.out.println("�ٸ� �ν��Ͻ� ����");
		
		if(str1 == str3)
			System.out.println("���� �ν��Ͻ� ����");
		else
			System.out.println("�ٸ� �ν��Ͻ� ����");
	}
}

//���� �ν��Ͻ� ����
//�ٸ� �ν��Ͻ� ����