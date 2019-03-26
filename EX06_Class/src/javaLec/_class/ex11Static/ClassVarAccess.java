package javaLec._class.ex11Static;

class AccessWay{
	static int num =0;
	AccessWay(){
		incrCnt();
	}
	
	/*static 변수는 static메서드나 instance메서드 관계없이 
	 *클래스 내부에서 자유롭게 접근 가능하다
	 */ 
	public void incrCnt() {
		num++;
	}
}
/*static멤버의 접근
 *1)클래스 내부에서 자유롭게 접근 가능
 *2)클래스 이름으로 접근
 *3)객체 이름으로 접근
 *클래스 이름으로 접근이 객체이름 접근보다 더 선호하는 방식이다
 *->static은 객체별로 생성되는 변수가 아니고
 *클래스에 유일하게 공유할 수 있는 변수이므로 클래스 소속으로 호출하는 것이 더 명확
 *static은 공유하는데 목적이 있다.
 *
 */
public class ClassVarAccess {
	public static void main(String[] args) {
		AccessWay access = new AccessWay();
		AccessWay.num++; //클래스명으로 접근
		access.num++; //객체로 접근
		
		//두개를 어떻게 불러도 같은 걸 말하는거
		System.out.println("num= "+AccessWay.num );
	}
}
