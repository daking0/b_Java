/*Method(Java에서 함수를 가리키는 용어)
 * Function
 * 
 * 문장 = 명사 + 동사 = 주어 + 동사
 * 프로그래밍 = 변수 + 메서드
 *
 *<만드는 이유>
 * 1) 코드가 길어지게 되면 가독성을 위하여 일정 단위로 분류
 *  k5 - 부품 모듈화, 1군데가 이상이 생기면 그 부분만 수리
 *  (개발 비용이 절약된다)
 * 2) 중복 코드를 이름으로만 호출하기 위해
 * 3)재사용을 쉽게 하기 위해
 * <메서드의 형식>
 * 녹즙                     녹즙기                잎, 물
 * returnValue 메서드명 (arguementValue){
 * }
 * 리턴값(returnValue)이 int, double, int[], 클래스 등
 * return 해당 retrun형;이 와댜 한다.
 * 리턴값(returnValue)이 void이면 아무 값도 반환하지 않는 다는 의미이므로
 * return을 생략하거나 그냥 return만 써주면 된다.
 * return의 의미는 이 함수를 호출한 곳으로 돌아가라
 * 
 * y=2x+1 에서 y는 return값/ 2x+1이 함수명/x가 매개변수
 * static 메서드
 * ->
 * 클래스가 사용될 때 객체로 만들지 않아도 바로 메모리에 로딩 
 */
public class _01_MethodDefAdd {
	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		//_01_MethodDefAdd.hiEveryOne(12);  이렇게 쓰지만, 같은 class라서 생략 가능
		hiEveryOne(12); //다른 클래스일때는 넣어주기.
		hiEveryOne(13);
		System.out.println("프로그램의 끝");
	}
	
	public static void hiEveryOne(int age) { 
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는" + age + "입니다.");
			return; //아무 결과값이 없이 돌아가라. 중간에 쓰면 break의 기능도 가능
		//void에는 return; 생략
	}
}


/* class 나눠서 진행하는 방법
public class _01_MethodDefAdd {
	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		Hi.hiEveryOne(12); //다른 클래스일때는 넣어주기
		Hi.hiEveryOne(13);
		System.out.println("프로그램의 끝");
	}
	


class Hi{
	public static void hiEveryOne(int age) { 
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는" + age + "입니다.");
	}
}
 */
