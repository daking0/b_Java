/* StringŬ������ ���� ������ ��ȭ���� ��� ���� ��ü(�ν��Ͻ�)�� �����ϰ� �ȴ�.
 * = String�� �ٸ� ���ڰ� �߰��Ǹ� �� �ν��Ͻ��� ���� �����Ѵ�.
 * �̷� �۾��� ��������� ���� ������ ������ �ȴ�.
 * �׷��� �ڹ�Ʃ�׿����� ù��°�� StringŬ������ ����� �м��ؼ� �����Ѵ�.
 * �����ϴ� ���
 * 1)StringBuilder
 * 2)StringBuffer : Thread-safe(��Ƽ Thread�� �� ���� ���)
 */
public class _04_StringAdd {
	public static void main(String[] args) {
		String str1 = "Lemon";
		String str2 = str1 + 'a'; //str1.concat('a')  ->concat�� ()�� ���ڸ� �߰��Ѵٴ� ��
		String str3 = str2 + 'b';
		String str4 = str3 + "cd";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
