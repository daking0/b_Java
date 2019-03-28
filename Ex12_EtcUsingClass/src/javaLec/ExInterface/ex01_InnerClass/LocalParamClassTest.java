package javaLec.ExInterface.ex01_InnerClass;

interface Readable1{
	public void read();
} //외부에서는 이거만 볼 수 있다

class OuterClass2{
	private String myName;
	OuterClass2(String name){
		myName = name;
	}
	
	/*Local Class에서는 OuterClass의 멤버에 접근 가능
	 * 그리고 method내의 매개변수나 지역변수에 접근 가능
	 * 단, 매개변수/ 지역변수는 final로 설정해야 한다.
	 * 원래 지역변수는 메서드의 호출이 끝나면 스택에서 사라지지만 
	 * Local Class내부에서 사용되면 사라지지 않게 별도의 공간에 복사한다.
	 * 다른 원래의 값과 다르게 되면 문제가 있다고 판단하여 final을 붙여 변경되지 않도록 한다.
	 * 
	 */
	public Readable1 createLocalClassInst(final int instID) {
		//메서드 아래에 존재 = Local Class
		class LocalClass implements Readable1{
			public void read() {
				System.out.println("Outer inst name: "+ myName);
				System.out.println("Local inst ID: "+instID);
			}
		}
		return new LocalClass();
	}
}

public class LocalParamClassTest {
	public static void main(String[] args) {
		OuterClass2 out = new OuterClass2("My Outer Class");
		Readable1 localInst1 = out.createLocalClassInst(111);
		localInst1.read();
		
		Readable1 localInst2 = out.createLocalClassInst(222);
		localInst2.read();
	}
}
