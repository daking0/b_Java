/*��Ʈ �� ������
 Java���� ���� �� �Ⱦ��� ( �׳� �ֱ����ϸ� �ȴ�)
 |(or) : ��Ʈ���� �� �߿� 1���� 1�̸� 1
 &(and) : ��Ʈ���� �Ѵ� 1�̾�� 1
 ^(xor) : ��Ʈ���� ������ 0, �ٸ��� 1
*/
public class _4_BitOp {

	public static void main(String[] args) {
		int x = 3; //00000011
		int y = 2; //00000010
		System.out.println(x|y); //3
		x = 16; //00010000
		y = 8;  //00001000
		System.out.println(x|y); //24
		System.out.println(x&y); //0
		System.out.println(x^y); //24

	}

}
