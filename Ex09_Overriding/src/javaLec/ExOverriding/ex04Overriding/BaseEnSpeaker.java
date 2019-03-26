package javaLec.ExOverriding.ex04Overriding;

/*메서드 오버라이딩(Method Overriding)
 *부모가 이미 구현해 놓은 메서드를 대신하거나 추가확장하는 것을 일컫는다.
 *즉, 자식 클래스에 부모메서드와 동일한 메서드를 구현하는 것
 */
/* overloading과 overriding의 차이
 * overlodaing(과적합) ->많이 실었다. 
 *                   =>매개변수 다른 같은 이름 함수 여러개
 * overriding => over + riding
 * 
 */
public class BaseEnSpeaker extends Speaker {
	   private int baseRate;
	   
	   void showCurrentState(){
	      super.showCurrentState(); //부모 기능 사용
	      System.out.println("베이스 크기 : "+baseRate);
	   }
	//   //부모기능을 대신한다.
	//   void showCurrentState() {
//	      System.out.println("베이스 크기 : "+baseRate);
	//   }
	   void setBaseSpeaker(int base) {
	      baseRate=base;
	   }
	
}
