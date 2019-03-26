package javaLec.ExOverriding.ex01IsKindOf;

public class TabletNotebook extends NotebookComp {
	String regstPenMode1;
	
	TabletNotebook(String name, int initChag, String pen){
		super(name, initChag);
		 regstPenMode1 = pen;
	}
	
	void write(String penInfo) {
		if(battery <1) {
			System.out.println("충전이 필요합니다.");
			return;
		}
		if(regstPenMode1.compareTo(penInfo) != 0) {
			System.out.println("등록된 펜이 아닙니다.");
			return;
		}
		System.out.println("필기 내용을 처리합니다.");
		battery -= 1;
	}
}
