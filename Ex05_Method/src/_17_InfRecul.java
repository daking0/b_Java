
public class _17_InfRecul {
	public static void main(String[] args) {
		//showHi(3);
		showHi1(3);
	}
	
	//1�� �˻��ϱ� ���� �ٽ� ȣ���ϹǷ� ��� �ݺ��Ѵ�.
//	public static void showHi(int cnt) {
//		System.out.println("Hi~");
//		showHi(cnt--); //1�� ���͵� ���⼭ 0�� �ǹ����ϱ�
//		if(cnt == 1) //���⿡ �ɸ��� �ʰ� ��� ���Ƽ� ���ÿ����÷ο� ���� �߻�
//			return;
//	}
	
	public static void showHi1(int cnt) {
		System.out.println("Hi~");
		if(cnt == 1) 
			return;
		showHi1(--cnt);
	}

}
