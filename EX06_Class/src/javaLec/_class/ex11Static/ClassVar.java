package javaLec._class.ex11Static;
/*static ������ ��ü���� ������ �޸𸮿� �ö󰡰� 
 *��� ��ü���� ������ �� �ִ� 
 *�ν��Ͻ� ������ ��ü�� ������ �� �Բ� �����Ǹ� ��ü���� �����̴�.
 */
class InstCnt{
	//static int instNum = 0;
	int instNum = 0;
	public InstCnt() {
		instNum++; 
		System.out.println("�ν���Ʈ ����: "+instNum);
	}
}
public class ClassVar {
	public static void main(String[] args) {
		InstCnt ic1 = new InstCnt();
		InstCnt ic2 = new InstCnt();
		InstCnt ic3 = new InstCnt();
	}
}
