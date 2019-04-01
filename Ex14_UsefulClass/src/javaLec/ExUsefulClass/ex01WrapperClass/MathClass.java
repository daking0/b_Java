package javaLec.ExUsefulClass.ex01WrapperClass;

public class MathClass {
	public static void main(String[] args) {
		System.out.println("원주율: "+ Math.PI);
		System.out.println("2의 제곱근: "+ Math.sqrt(2));
		System.out.println("파이에 대한 Degree: "+Math.toDegrees(Math.PI));
		System.out.println("2파이에 대한 Degree: "+ Math.toDegrees(2.0 * Math.PI));
		double radian45 = Math.toRadians(45);
		System.out.println("사인45: "+Math.asin(radian45));
		System.out.println("코사인45: "+Math.acos(radian45));
		System.out.println("탄젠트45: "+ Math.tan(radian45));
		System.out.println("로그25: "+ Math.log(25));
		System.out.println("2의 4승: "+Math.pow(2, 4));
	}
}
