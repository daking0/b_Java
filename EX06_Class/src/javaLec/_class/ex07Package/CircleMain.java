package javaLec._class.ex07Package; //이 클래스 소속 패키지

import javaLec._class.ex08Package.Triangle; //다른 패키지 클래스 접근 사용하겠다
//import javaLec._class.ex08Package.Circle;  ->07내에 동일한 Circle이 있으니까 사용불가

/*<패키지>
 *1)package는 class보다 상위 분류 개념이며, 동시에 폴더구조이다
 *2) class 제작시 별도의 package명을 주지 않으면 default package소속이 된다.
 *3)다른 package의 클래스를 사용하고 싶으면 import를 한다 - 단축키는 Ctrl + Shift + o
 *4)import 없이 사용할 수 있는 package는 자기자신이 속한 package와 java.lang이다
 *5)java에서 별도로 접근제한자(private, protected, publie)를 주지 않으면 default 접근권한을 가지게 된다.
 *default 접근 권한은 동일 패키지내에서는 접근가능의미
 *
 *public으로 하면 어디서든 가능 
 */
/*<패키지 설계방법>
 * 1)회사이름을 기준으로 만드는 경우가 종종있다
 *  예를 들어 www.bitcamp.co.kr을 도메인으로 가지는 회사는 패키지를 설계할 때 kr.co.bitcamp로 만드는 경우가 종종있다.
 * 2)최상위 패키지는 <회사의 도메인> -unique(유일성)
 * 중간 패키지는 모듈이름/역할
 * 가장 아래 패키지는 패키지 내에 있는 클래스의 역할
 */

/*접근 권한
 * public(공공의) : 어디서나 마음대로 접근 호출가능
 * protected(보호하는) : 패키지가 동일, 다른 패키지라도 상속이면 접근 호출가능
 * defaulat : 동일 패키지만 접근 호출가능
 * private (개인적인) : 클래스 내에서만 접근 호출가능
 */

public class CircleMain {
	public static void main(String[] args) {
		Circle cc = new Circle(2);
		System.out.println(cc.circleArea());
		Triangle ta = new Triangle(2,3);
		System.out.println(ta.getTriangleArea());
		javaLec._class.ex08Package.Circle circle = new javaLec._class.ex08Package.Circle(3);
		System.out.println(circle.circlePerimeter());
		
	}
}



