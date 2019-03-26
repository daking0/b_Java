package javaLec._class.ex11Static;

class AccessWay{
	static int num =0;
	AccessWay(){
		incrCnt();
	}
	
	/*static ������ static�޼��峪 instance�޼��� ������� 
	 *Ŭ���� ���ο��� �����Ӱ� ���� �����ϴ�
	 */ 
	public void incrCnt() {
		num++;
	}
}
/*static����� ����
 *1)Ŭ���� ���ο��� �����Ӱ� ���� ����
 *2)Ŭ���� �̸����� ����
 *3)��ü �̸����� ����
 *Ŭ���� �̸����� ������ ��ü�̸� ���ٺ��� �� ��ȣ�ϴ� ����̴�
 *->static�� ��ü���� �����Ǵ� ������ �ƴϰ�
 *Ŭ������ �����ϰ� ������ �� �ִ� �����̹Ƿ� Ŭ���� �Ҽ����� ȣ���ϴ� ���� �� ��Ȯ
 *static�� �����ϴµ� ������ �ִ�.
 *
 */
public class ClassVarAccess {
	public static void main(String[] args) {
		AccessWay access = new AccessWay();
		AccessWay.num++; //Ŭ���������� ����
		access.num++; //��ü�� ����
		
		//�ΰ��� ��� �ҷ��� ���� �� ���ϴ°�
		System.out.println("num= "+AccessWay.num );
	}
}
