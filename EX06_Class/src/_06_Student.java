import java.util.Arrays;
import java.util.Random;

/* �л��� ��ħ�� �Ͼ�� �غ��ϰ� �����ϴ� ���� �ϰ��� Ŭ������ ���弼��.
 */
class Days{
	//�ʵ�(����): ���
	int waketime =8; //��� �ð�
	int school_start = 10, school_finish = 21;
	private String[] subject = new String[] {"C���", "JAVA", "C#", "Python", "Unity"};
	private int sel;
	
	//�޼���(���): ����
	void wakeup() {
		System.out.println(waketime + "��: ���");
	}
	void wash() {
		System.out.println("�����ϱ�");
	}
	void eat() {
		System.out.println("�� �Ա�");
	}
	void schoolStart() {
		System.out.println(school_start+"��: ���� ����");
	}
	void studyHard() {
		Random rd = new Random();
		sel = rd.nextInt(subject.length);
		System.out.println(subject[sel]+"�� ������ ����");
	}
	void schoolFinish() {
		System.out.println(school_finish+"��: �п� ��");
	}
	void goHome() {
		
		System.out.println("���� ����");
	}
}
public class _06_Student {
	public static void main(String[] args) {
		Days dayOne = new Days();
		dayOne.wakeup();
		dayOne.wash();
		dayOne.eat();
		dayOne.schoolStart();
		for(int i=9;i<13;i++) {
			dayOne.studyHard();
		}
		dayOne.eat();
		for(int i=15;i<22;i++) {
			dayOne.studyHard();
		}
		dayOne.schoolFinish();
		dayOne.goHome();
	}
}
