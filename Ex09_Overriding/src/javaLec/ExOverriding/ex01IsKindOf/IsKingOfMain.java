package javaLec.ExOverriding.ex01IsKindOf;

public class IsKingOfMain {
	public static void main(String[] args) {
		NotebookComp nc = new NotebookComp("ȫ�浿",5);
		TabletNotebook tn = new TabletNotebook("�Ӳ���",5,"ISE-111-222");
		nc.movingCal();
		tn.write("AAA-222-333");
		tn.write("ISE-111-222");
	}
}
