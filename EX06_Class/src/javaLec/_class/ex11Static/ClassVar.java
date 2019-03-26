package javaLec._class.ex11Static;
/*static 변수는 객체생성 이전에 메모리에 올라가고 
 *모든 객체에서 공유할 수 있다 
 *인스턴스 변수는 객체가 생성될 때 함께 생성되며 객체별로 별도이다.
 */
class InstCnt{
	//static int instNum = 0;
	int instNum = 0;
	public InstCnt() {
		instNum++; 
		System.out.println("인스턴트 생성: "+instNum);
	}
}
public class ClassVar {
	public static void main(String[] args) {
		InstCnt ic1 = new InstCnt();
		InstCnt ic2 = new InstCnt();
		InstCnt ic3 = new InstCnt();
	}
}
