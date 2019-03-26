package javaLec._class.ex09Access;

//패키지 내에서만 접근 가능
class Adder {
	private int cntAdd;
	
	//패키지 내에서만 기능 제공하는 생성자
	Adder(){
		cntAdd = 0;
	}
	
	int getCntAdd() {
		return cntAdd;
	}
	int addTwoNumber(int num1, int num2) {
		cntAdd++;
		return num1 + num2;
	}
}


//default니까 패키지내에서만 가능