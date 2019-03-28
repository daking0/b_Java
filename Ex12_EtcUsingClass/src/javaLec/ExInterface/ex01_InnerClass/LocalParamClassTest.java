package javaLec.ExInterface.ex01_InnerClass;

interface Readable1{
	public void read();
} //�ܺο����� �̰Ÿ� �� �� �ִ�

class OuterClass2{
	private String myName;
	OuterClass2(String name){
		myName = name;
	}
	
	/*Local Class������ OuterClass�� ����� ���� ����
	 * �׸��� method���� �Ű������� ���������� ���� ����
	 * ��, �Ű�����/ ���������� final�� �����ؾ� �Ѵ�.
	 * ���� ���������� �޼����� ȣ���� ������ ���ÿ��� ��������� 
	 * Local Class���ο��� ���Ǹ� ������� �ʰ� ������ ������ �����Ѵ�.
	 * �ٸ� ������ ���� �ٸ��� �Ǹ� ������ �ִٰ� �Ǵ��Ͽ� final�� �ٿ� ������� �ʵ��� �Ѵ�.
	 * 
	 */
	public Readable1 createLocalClassInst(final int instID) {
		//�޼��� �Ʒ��� ���� = Local Class
		class LocalClass implements Readable1{
			public void read() {
				System.out.println("Outer inst name: "+ myName);
				System.out.println("Local inst ID: "+instID);
			}
		}
		return new LocalClass();
	}
}

public class LocalParamClassTest {
	public static void main(String[] args) {
		OuterClass2 out = new OuterClass2("My Outer Class");
		Readable1 localInst1 = out.createLocalClassInst(111);
		localInst1.read();
		
		Readable1 localInst2 = out.createLocalClassInst(222);
		localInst2.read();
	}
}
