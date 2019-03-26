package javaLec._class.ex08Package;

public class Circle {
	double rad;
	public Circle(double r){ //public 없으면 default라서 08 패키지 내에서만 가능하다
		rad = r;
	}
	
	public double circlePerimeter() {
		return rad*2*3.14;
	}
}
