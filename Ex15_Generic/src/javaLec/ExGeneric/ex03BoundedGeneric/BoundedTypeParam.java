package javaLec.ExGeneric.ex03BoundedGeneric;

interface SimpleInterface{
	public void showYourName();
}
class UpperClass{
	public void showYourAncestor() {
		System.out.println("UpperClass");
	}
}
class AAA extends UpperClass implements SimpleInterface{
	public void showYourName() {
		System.out.println("Class AAA");
	}
}

class BBB extends UpperClass implements SimpleInterface{
	public void showYourName() {
		System.out.println("Class BBB");
	}
}

class BoundedType{
	/* T는 SimpleInterface의 상속을 받아야만 한다
	 * 제너릭에서는 interface도 extends로 쓴다.
	 */
	public static <T extends SimpleInterface> void showInstanceAncestor(T param) {
		param.showYourName();
	}
	public static <T extends UpperClass> void showInstanceName(T param) {
		param.showYourAncestor();
	}
}
public class BoundedTypeParam {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		
		BoundedType.showInstanceAncestor(aaa);
		BoundedType.showInstanceName(aaa);
		BoundedType.showInstanceAncestor(bbb);
		BoundedType.showInstanceName(bbb);
	}
}
