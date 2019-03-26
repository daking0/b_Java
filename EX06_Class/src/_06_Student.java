import java.util.Arrays;
import java.util.Random;

/* 학생을 아침에 일어나서 준비하고 공부하다 가는 일과를 클래스로 만드세요.
 */
class Days{
	//필드(변수): 명사
	int waketime =8; //기상 시간
	int school_start = 10, school_finish = 21;
	private String[] subject = new String[] {"C언어", "JAVA", "C#", "Python", "Unity"};
	private int sel;
	
	//메서드(기능): 동사
	void wakeup() {
		System.out.println(waketime + "시: 기상");
	}
	void wash() {
		System.out.println("샤워하기");
	}
	void eat() {
		System.out.println("밥 먹기");
	}
	void schoolStart() {
		System.out.println(school_start+"시: 공부 시작");
	}
	void studyHard() {
		Random rd = new Random();
		sel = rd.nextInt(subject.length);
		System.out.println(subject[sel]+"를 열심히 공부");
	}
	void schoolFinish() {
		System.out.println(school_finish+"시: 학원 끝");
	}
	void goHome() {
		
		System.out.println("집에 가기");
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
