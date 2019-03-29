package javaLec.ExUsefulClass.ex01WrapperClass;
/* Wrapper Class
 * Primitive Type�� Ŭ������ ���� ��
 * java.lang�� ����
 * Boolean
 * Character
 * Byte 
 * Short
 * Integer
 * Long
 * Float Double 
 * 
 * Primitive Type�� Ŭ������ ����� �����ν� Object�κ��� �Ļ��� Ŭ������ �����ϴ� ���� ����� ����� �� �ְ� �ȴ�.
 * ��ǥ������ Collection�� �� �� �ִ�.
 * 
*/
public class UseWrapperClass {
		public static void showData(Object obj) {
			System.out.println(obj); //toString�� �θ����� �Ǿ��ִ�
		}
		public static void main(String[] args) {
			Integer intInst = new Integer(3);
			System.out.println(intInst.hashCode());
			showData(intInst);
			showData(new Integer(7));
		}
}

