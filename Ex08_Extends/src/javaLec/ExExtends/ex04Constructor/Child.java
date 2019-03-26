package javaLec.ExExtends.ex04Constructor;
//Child의 부모클래스는 Father
//Father를 물려받아 확장했다
public class Child extends Father {
	double day;
	Child(int score, long money, double day){
		super(score,money); //Father의 매개변수 생성자 전달
		this.day = day;
		System.out.println("Child 생성자");
	}
	void play() {
		System.out.println("인생이 "+ day+"일 즐겁다");
	}
}
