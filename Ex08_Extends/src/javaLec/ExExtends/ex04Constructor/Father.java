package javaLec.ExExtends.ex04Constructor;
//Father의 부모클래스는 GrandFather
//GrandFather를 물려받아 확장했다
public class Father extends GrandFather {
	long money = 9999999999999999L;
	Father(int score, long money){
		super(score); //GrandFather의 매개변수 생성자를 호출 (GrandFather을 처음 상속하는 애한테 넣어줘야함)
		this.money = money;
		System.out.println("Father 생성자");
	}
	void wealth() {
		System.out.println("돈을 "+ money +" 벌었다");
	}
}
