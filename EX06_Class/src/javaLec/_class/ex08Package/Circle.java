package javaLec._class.ex08Package;

public class Circle {
	double rad;
	public Circle(double r){ //public ������ default�� 08 ��Ű�� �������� �����ϴ�
		rad = r;
	}
	
	public double circlePerimeter() {
		return rad*2*3.14;
	}
}
