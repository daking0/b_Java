package javaLec.ExExtends.ex02Extends;
//Child의 부모클래스는 Father
//Father를 물려받아 확장했다
public class Child extends Father {
	double day = 365 + 1.0/4;
	void play() {
		System.out.println("인생이 즐겁다");
	}
}
