package javaLec.ExGeneric.ex01OrangeApple;

class Fruit1{
	int sugarContent;
	Fruit1(int sugar){
		sugarContent = sugar;
	}
	void showSugarContent() {
		System.out.println("�絵: "+ sugarContent);
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
		System.out.println("���� ����̴�.");
	}
}

class Lion{
	void Cry() {
		System.out.println("����");
	}
}

/* 
 * T�� Type�� �����̴�
 * Type�� Class ������ �ǹ��Ѵ�
 * T���� �������� ������ class�� �� �� �ִ�
 * Generic�� C++���� Templete���� �Ҹ���.
 * Generic�� ����ڷ� ������ �� �ִ�.
 * ex)���� �� -> �濬�� ��
 * 	   ���� �� -> ������ ��
 *    �Ķ�ũ���� -> �Ķ� ũ���� ��
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

//�̷������� �Ǽ� ���Ǵ� �� (Class�� ������ ġȯ�ȴ�)
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
		GenericBox<Graph> grBox = new GenericBox<Graph>(); //Graph Ŭ���� �����Ǵ°�
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