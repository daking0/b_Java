package javaLec.ExGeneric.ex01OrangeApple;
/* 1. Orange�� Apple�� ����� �ʵ�� �޼��带 ������ �����Ƿ� �θ� Ŭ������ Fruit Class�� ���� ����ϴ� ���
 * 2. Generic ������ �̿��ϸ� ������ ������ ���� �������� ���� Ŭ������ ���� �� ������ �� �ִ�.
 */
class Fruit{
	int sugarContent;
	Fruit(int sugar){
		sugarContent = sugar;
	}
	void showSugarContent() {
		System.out.println("�絵: "+ sugarContent);
	}
}

class Orange extends Fruit{
	Orange(int sugar){
		super(sugar);
	}
	
}

class Apple extends Fruit{
	Apple(int sugar){
		super(sugar);
	}
	
}

class Grape{
	
}

class FruitBox{
	Fruit fruit;
	FruitBox(Fruit fruit){
		this.fruit = fruit;
	}
	Fruit getItem() {
		return this.fruit;
	}
}
public class OrangeApple {
	public static void main(String[] args) {
		FruitBox fb = new FruitBox(new Orange(10));
		Orange orange = (Orange)fb.getItem();
		orange.showSugarContent();
		
		FruitBox fb1 = new FruitBox(new Apple(5));
		Apple apple =(Apple)fb1.getItem();
		apple.showSugarContent();
		
		//Grape�� ��� ���� �ʾ����Ƿ� ���� �߻�
//		FruitBox fb3 = new FruitBox(new Grape(5));
//		Grape grape=(Grape)fb3.getItem();
//		apple.showSugarContent();
		
		
	}
}
