package javaLec.ExInterface.ex01_InnerClass;

interface Readable{
	public void read();
} //외부에서는 이거만 볼 수 있다

class OuterClass1{
	private String myName;
	OuterClass1(String name){
		myName = name;
	}
	
	public Readable createLocalClassInst() {
		//메서드 아래에 존재 = Local Class
		class LocalClass implements Readable{
			public void read() {
				System.out.println("Outer inst name: "+ myName);
			}
		}
		return new LocalClass();
	}
}

public class LocalClassTest {
	public static void main(String[] args) {
		OuterClass1 out1 = new OuterClass1("First");
		Readable localInst1 =out1.createLocalClassInst();
		localInst1.read();
		
		OuterClass1 out2 = new OuterClass1("Second");
		Readable localInst2 =out2.createLocalClassInst();
		localInst2.read();
	}
}
