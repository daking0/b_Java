package javaLec.ExOverriding.ex01IsKindOf;

public class NotebookComp extends Computer {
	int battery;
	
	NotebookComp(String name, int initChag){
		super(name);
		battery = initChag;
	}
	
	void charging() {
		battery += 5;
	}
	
	void movingCal() {
		if(battery < 1) {
			System.out.println("������ �ʿ��մϴ�.");
			return;
		}
		System.out.println("�̵��ϸ鼭");
		calculate();
		battery -= 1;
	}
}
