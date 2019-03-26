package javaLec.ExExtends.ex02Extends;
/* 필드와 메서드 모두 상속된다.
 * 상속이라는 문법을 통해 현대의 모든 FrameWork 들이 존재할 수 있었다.
 * Framework를 상속받음으로 거의 모든 기능은 제공받고 일부 기능만 Customizing함으로써 쉽게 프로그래밍 가능해짐
 */
public class ExtendsMain {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.handsome();
		ch.wealth();
		ch.play();
		System.out.println("잘생김 점수: "+ ch.handsomeScore);
		
		System.out.println("돈: "+ ch.money + "$");
		System.out.println("노는 날: "+ch.day +"일");
	}

}
