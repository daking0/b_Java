package javaLec.ExInterface.ex01_InnerClass;

//OuterClass라 일컫는다
class OuterClassOne{
	OuterClassOne(){
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	//static Inner Class/ Nested Class라 일컫는다.
	public static class NestedClass{
		public void simpleMethod(){
			System.out.println("Nested Instance Method One");
		}
	}
}

class OuterClassTwo{
	OuterClassTwo(){
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	private static class NestedClass{
		public void simpleMethod(){
			System.out.println("Nested Instance Method Two");
		}
	}
}

public class NestedClassTest {
	public static void main(String[] args) {
		OuterClassOne one = new OuterClassOne();
		OuterClassTwo two = new OuterClassTwo();
		OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
		nst1.simpleMethod();
		
		//Private이라서 이건 불가능
//		OuterClassTWo.NestedClass nst2 = new OuterClassTwo.NestedClass();
//		nst2.simpleMethod();
		
	}
}
