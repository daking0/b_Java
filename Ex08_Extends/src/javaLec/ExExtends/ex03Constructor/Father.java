package javaLec.ExExtends.ex03Constructor;
//Father의 부모클래스는 GrandFather
//GrandFather를 물려받아 확장했다
public class Father extends GrandFather {
	long money = 9999999999999999L;
	Father(){
		System.out.println("Father 생성자");
	}
	void wealth() {
		System.out.println("돈을 많이 벌었다");
	}
}
