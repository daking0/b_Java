package javaLec._class.ex11Static;
class Circle{
	static final double PI = 3.1415;
	private double radius;
	Circle(double rad){
		radius = rad;
	}
	
	void showPerimeter() {
		System.out.println("µ—∑π: "+radius*2*PI);
	}
	
	void showArea() {
		System.out.println("≥–¿Ã: "+radius*radius*PI);
	}
}
public class ClassVarUse {
	public static void main(String[] args) {
		Circle cl = new Circle(1.2);
		cl.showArea();
		cl.showPerimeter();
	}
}
