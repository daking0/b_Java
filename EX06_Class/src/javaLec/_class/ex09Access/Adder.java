package javaLec._class.ex09Access;

//��Ű�� �������� ���� ����
class Adder {
	private int cntAdd;
	
	//��Ű�� �������� ��� �����ϴ� ������
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


//default�ϱ� ��Ű���������� ����