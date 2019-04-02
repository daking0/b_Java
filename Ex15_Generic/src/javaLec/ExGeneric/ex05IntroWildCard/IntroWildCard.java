package javaLec.ExGeneric.ex05IntroWildCard;
class Fruit{
	public void showYou() {
		System.out.println("����");
	}
}

class Apple extends Fruit{
	public void showYou() {
		super.showYou();
		System.out.println("���");
	}
}

class FruitBox<T>{
	T item;
	public void store(T item) {
		this.item = item;	
	}
	public T pullOut() {
		return item;
	}
}

public class IntroWildCard {
	//Fruitbox<?> box == FruitBox<? extends Object> box
 	public static void openAndShowFruitBox(FruitBox<? extends Fruit> box) { //���ڸ� fruit�迭�� �ްڴ�
		Fruit fruit = box.pullOut();
		fruit.showYou();
	}
	public static void main(String[] args) {
		FruitBox<Fruit> box1 = new FruitBox<Fruit>();
		box1.store(new Fruit());
		FruitBox<Apple> box2 = new FruitBox<Apple>();
		box1.store(new Apple());
		openAndShowFruitBox(box1);
		openAndShowFruitBox(box2);
	}
}
