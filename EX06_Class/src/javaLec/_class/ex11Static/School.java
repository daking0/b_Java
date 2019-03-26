package javaLec._class.ex11Static;

/* static�� Ŭ���� �Ҽ��̰� �� ����� ��ü���� �����Ӱ� ���� ����������
 * Ŭ������ �� 1���� ������ �� �ִ�.
 * �׷��Ƿ� ��ü ���� �ٸ� ������ �ƴ϶� ����� ������ �޼��带 staic���� �����
 * ���������� ��� �����ϴ�. (static�� ������ ��������) ->��ü�� �����ϴ� ���� ���� ��
 */
/* static ���: ��ü���� ���� �޸𸮿� �ε�, Ŭ������ 1���� ���� /����� ��
 * instance ��� : ��ü������ �޸𸮿� �ε�, ��ü������ŭ ���� /������ Ư¡�� ���� �� 
 * 
 */
class StudyClass{
	static int schoolNum =0;//�б� ��ü �л���
	int cNum =0;  //�ش� �� �л���
	String className ; //�ش� �� �̸�
	
	
	StudyClass(String cName,int num){
		className = cName;
		cNum =num;
		schoolNum += num;
	}
	
	void showStudyClassInfo() {
		System.out.println(className +": "+cNum+"��");
	}
	
	static void showSchoolInfo() {
		System.out.println("�л���: "+schoolNum);
	}
}
public class School {
	
	public static void main(String[] args) {
		StudyClass sc1 = new StudyClass("1��", 15);
		StudyClass sc2 = new StudyClass("2��", 20);
		StudyClass sc3 = new StudyClass("3��", 24);
		sc1.showStudyClassInfo();
		sc2.showStudyClassInfo();
		sc3.showStudyClassInfo();
		StudyClass.showSchoolInfo();
	} 
	
}
