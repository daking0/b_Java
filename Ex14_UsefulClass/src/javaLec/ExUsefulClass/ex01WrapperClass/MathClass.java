package javaLec.ExUsefulClass.ex01WrapperClass;

public class MathClass {
	public static void main(String[] args) {
		System.out.println("������: "+ Math.PI);
		System.out.println("2�� ������: "+ Math.sqrt(2));
		System.out.println("���̿� ���� Degree: "+Math.toDegrees(Math.PI));
		System.out.println("2���̿� ���� Degree: "+ Math.toDegrees(2.0 * Math.PI));
		double radian45 = Math.toRadians(45);
		System.out.println("����45: "+Math.asin(radian45));
		System.out.println("�ڻ���45: "+Math.acos(radian45));
		System.out.println("ź��Ʈ45: "+ Math.tan(radian45));
		System.out.println("�α�25: "+ Math.log(25));
		System.out.println("2�� 4��: "+Math.pow(2, 4));
	}
}
