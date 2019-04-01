package javaLec.ExGeneric.ex01OrangeApple;

class Fruit1{
	int sugarContent;
	Fruit1(int sugar){
		sugarContent = sugar;
	}
	void showSugarContent() {
		System.out.println("당도: "+ sugarContent);
	}
}

class Graph extends Fruit1{
	Graph(int sugar){
		super(sugar);
	}
	
}

class WaterMelon extends Fruit1{
	WaterMelon(int sugar){
		super(sugar);
	}
}

class Cat{
	void Info() {
		System.out.println("나는 고양이다.");
	}
}

class Lion{
	void Cry() {
		System.out.println("어흥");
	}
}

/* 
 * T는 Type의 약자이다
 * Type은 Class 종류를 의미한다
 * T에는 여러가지 종류의 class가 들어갈 수 있다
 * Generic은 C++에서 Templete으로 불린다.
 * Generic은 모양자로 비유할 수 있다.
 * ex)연필 별 -> 흑연색 별
 * 	   빨간 펜 -> 빨간색 별
 *    파란크레용 -> 파란 크레용 별
 */
class GenericBox<T>{
	T item;
	void setItem(T item) {
		this.item = item;
	}
	T getItem() {
		return this.item;
	}
}

//이런식으로 되서 사용되는 것 (Class를 넣으면 치환된다)
//class GenericBox_Cat<Cat>{
//	Cat item;
//	void setItem(Cat item) {
//		this.item = item;
//	}
//	Cat getItem() {
//		return this.item;
//	}
//}


public class GenericMain {
	public static void main(String[] args) {
		GenericBox<Graph> grBox = new GenericBox<Graph>(); //Graph 클래스 생성되는것
		grBox.setItem(new Graph(10));
		Graph graph = grBox.getItem();
		graph.showSugarContent();
		
		GenericBox<WaterMelon> wmBox = new GenericBox<WaterMelon>();
		wmBox.setItem(new WaterMelon(10));
		WaterMelon waterMelon = wmBox.getItem();
		waterMelon.showSugarContent();
		
		GenericBox<Cat> catBox = new GenericBox<Cat>();
		catBox.setItem(new Cat());
		Cat cat = catBox.getItem();
		cat.Info();
		
		
	}
}