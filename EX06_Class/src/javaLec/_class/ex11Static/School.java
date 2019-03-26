package javaLec._class.ex11Static;

/* static은 클래스 소속이고 이 멤버는 객체에서 자유롭게 접근 가능하지만
 * 클래스에 딱 1개만 존재할 수 있다.
 * 그러므로 객체 별로 다른 정보가 아니라 공통된 정보나 메서드를 staic으로 만들면
 * 공통적으로 사용 가능하다. (static은 일종의 공유정보) ->전체를 관리하는 정보 같은 애
 */
/* static 멤버: 객체생성 전에 메모리에 로딩, 클래스에 1개만 존재 /공통된 애
 * instance 멤버 : 객체생성시 메모리에 로딩, 객체개수만큼 존재 /별도의 특징을 가진 애 
 * 
 */
class StudyClass{
	static int schoolNum =0;//학교 전체 학생수
	int cNum =0;  //해당 반 학생수
	String className ; //해당 반 이름
	
	
	StudyClass(String cName,int num){
		className = cName;
		cNum =num;
		schoolNum += num;
	}
	
	void showStudyClassInfo() {
		System.out.println(className +": "+cNum+"명");
	}
	
	static void showSchoolInfo() {
		System.out.println("학생수: "+schoolNum);
	}
}
public class School {
	
	public static void main(String[] args) {
		StudyClass sc1 = new StudyClass("1반", 15);
		StudyClass sc2 = new StudyClass("2반", 20);
		StudyClass sc3 = new StudyClass("3반", 24);
		sc1.showStudyClassInfo();
		sc2.showStudyClassInfo();
		sc3.showStudyClassInfo();
		StudyClass.showSchoolInfo();
	} 
	
}
