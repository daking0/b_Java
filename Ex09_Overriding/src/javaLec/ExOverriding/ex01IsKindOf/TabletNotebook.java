package javaLec.ExOverriding.ex01IsKindOf;

public class TabletNotebook extends NotebookComp {
	String regstPenMode1;
	
	TabletNotebook(String name, int initChag, String pen){
		super(name, initChag);
		 regstPenMode1 = pen;
	}
	
	void write(String penInfo) {
		if(battery <1) {
			System.out.println("������ �ʿ��մϴ�.");
			return;
		}
		if(regstPenMode1.compareTo(penInfo) != 0) {
			System.out.println("��ϵ� ���� �ƴմϴ�.");
			return;
		}
		System.out.println("�ʱ� ������ ó���մϴ�.");
		battery -= 1;
	}
}
