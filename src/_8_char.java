
//char ���� �ڷ���(1����) : 2byte
//Unicode�� ����
public class _8_char {
	public static void main(String[] args) {
		char a = 'A';
		char b = '��';
		System.out.println(a);
		System.out.println(b);
		
		//���������� ����
		int ia = a; 
		int ib = b;
		System.out.println(ia);//65
		System.out.println(ib);//44032
		
		//4byte�� 2byte�� �ٲٴϱ� ������ �����ؾ���
		char c = (char)ia;
		char d = (char)ib;
		System.out.println(c);
		System.out.println(d);
	}
}
