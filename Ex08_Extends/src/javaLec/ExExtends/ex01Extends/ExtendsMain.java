package javaLec.ExExtends.ex01Extends;
/* 상속은 클래스의 필드/기능(메서드)을 잘 설계해서 물려주면 
 * extends 부모클래스 문법만으로도 자식클래스는 바로 부모의 모든 기능을 사용 가능
 * 즉, 재사용성이 쉽게 증가한다.
 */
public class ExtendsMain {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.handsome();
		ch.wealth();
		ch.play();
	}

}
