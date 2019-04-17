import java.util.Scanner;

/*
<프로젝트 순서>
1.제안요청서

2.제안서

3.요구사항 분석
	1) 인터뷰 - 요구사항(자기도 잘 모르고 하는 얘기가 대다수)
	2) 문서
	3) 화면
	
4.요구사항 정리
	1) 엑셀에 일렬로 정리한다.
	2) 요구사항 중에 상위범위와 하위범위를 분류한다.
	3) 요구사항 중에 먼저 할 것과 나중에 할 것을 분류한다.(1,2단계 / 1,2,3단계)
	
5.유스케이스를 도출
	목적: 요구사항을 정리한다
		 고객이 생각하지 못한 것을 역제안하거나 미리 대비하기 위해 전체 개념화
	1) 유스케이스 다이어그램(그림) - 전체를 개략적으로
		1) actor : 유스케이스와 인터페이스하는 외부 사람 or 시스템
		2) usecase : actor가 시스템과 작용하는 경우
		3) association : 액터와 usecase가 관련성
		4) 일반화 관계 : actor, usecase , 보편성 <-> 특수성
		5) include : usecase, 반드시 해야하는 것, 1단계 정도, 필요하면 2단계 정도, 공유 가능
					다른 usecase에서 공유가능
		6) extend : usecase, 반드시 할 필요는 없는 것, 특정 케이스, 1개
		
		* 주의할 점
		* 기능을 묘사하지 말 것: 지나치게 상세화 됨
		* 주어와 동사는 명시할 것: 동사를 지나치게 추상화하지 말 것
		* 이름을 사람, 홍길동  <일반회원, 종업원
		* 유스케이스에서 대출, 반환, 확인 < 비디오를 대출한다 (주어,동사 명확히 사용)
		* 표현의 통일 : 대출한다 = 렌탈한다 = 빌린다  =>대출한다로 통일
		* 유스케이스 규모를 동일하게 한다 : 유스케이스 다이어그램 참조
		* 유스케이스의 목적은 시스템의 요구사항을 분석/파악하기 위한 용도
		* 그러므로 큰 그림을 그리는데 목적이 있다.
		* 그러나 상세한 설명이 없기 때문에 다이아그램만 가지고는 오해를 일으킬 수 있으므로,
		* 유스케이스 정의서와 함께 사용한다.
		
	2) 유스케이스 정의서(문장) - 상세 순서
	      유스케이스 다이어그램에서 구체적으로 확인할 수 없는 내용을 확인할 수 있게 해준다.
	      유스케이스 다이어그램으로 전체 구조를 이해하고, 확인하고 싶은 구체적인 내용은 유스케이스 정의서를 통해 이해한다.
	      개발 구현 후 Testcase항목과 Test Scenario로 활용된다.
6.아키텍처 설계(프로세스간 메시지 전달)
	1) 프로세스는 사각형, 연관은 선 or 화살표 방향으로 메시지 전달
	2) 시퀀스 다이어그램으로 프로세스 간의 통신 관계를 표현
	
7.클래스 설계
	1) 개념 클래스 모델링 - 이름과 관계만 정의
	2) 논리 클래스 모델링 - 필드와 메서드까지 정의

8.클래스 설계 방법
	1) 명사 - 동사 추출법
		1-1) 명사 중에 큰 개념과 작은 개념으로 분류한다.
		          큰 개념은 클래스의 후보
		          작은 개념은 필드의 후보
		1-2) 동사중에 큰 개념과 작은 개념으로 분류한다.
			  큰 개념은 클래스(비느시 로직)의 후보 
			  작은 개념은 메서드의 후보
			  
	2) MVC구조로 나누기
		2-1) Model : 데이터를 전문으로 관리하는 클래스
		2-2) View : 사용자와 인터페이스 하는 화면
		2-3) Controller : 비즈니스 로직을 담당하는 클래스

9.클래스 설계의 MVC
	1) 화면, 문서, 도표, 고객이 보관하고 싶어하는 클래스를 정의한다
	  => 도메인 객체(Domain Object)
   	   떨어지지 않는 데이터는 클래스로 구성한다.(연관관계 높은 것들)
   	  ex) Employee
   
   2) 비즈니스 로직으로 구성된 클래스를 설계한다.
      MVC 중에 C
      ~Service, ~Manager, ~Handler, ~Controller로 종종 되어있다.
      DTO를 주고받거나 로직을 처리한다.
   	    클래스에서 데이터를 주고받는다의 의미는? 상대방의 메서드 호출
   	  ex) EmployeeService
   	   
   3) 화면을 담당하는 클래스를 설계한다.
  	  MVC 중에 View
  	  ex) EmployeeUI
  	  
   4) 데이터를 관리하는 클래스를 설계한다.
            화면이나 비즈니스 로직이 변경되어도 독립적으로 최소한의 변경만 가져올 수 있도록 하기 위해
      MVC 중에 Model
      DAO(Data Access Object) : 데이터를 전문으로 처리하는 객체
      ex) EmployeeDAO

10.클래스 설계의 Tip
	1) 떨어지지 않는 데이터는 클래스로 구성한다.
	2) 데이터를 처리하는 역할은 클래스로 구성한다.
	3) 앞으로 자주 사용할 기능들은 하나의 클래스로 구성한다.
	   (Utility Class, static 메서드 사용)
	4) 클래스는 1가지 역할에 집중한다.
	      내가 맡은 일은 내가 처리, 내가 할 일이 아니면 해당 클래스에 위임

11.클래스 설계의 Tip2
	1) 필드는 private, 메서드는 public을 기본으로 한다.
	2) 메서드 중에 내부에서만 사용되는 것은 private으로 한다.
	3) 필드의 값의 접근은 getter~나 setter~ 메서드로 한다.
	4) 패키지 관점에서 내부에서 사용되는 것은 default 접근권한으로, 
		패키지 외부에서 사용되는 것은 public으로 선언한다.
		
12.프로젝트 설계
	1) 요구사항 무작위 정리 -> 상위/하위 구조 분류 -> 우선순위
	2) 유스케이스 다이어그램/ 정의서 : 선택사항
	3) 클래스 다이어그램 : 클래스 간의 정적인 관계
	4) 시퀀스 다이어그램 : 객체간의 메시지 전달(메서드 호출)을 시간순
		                            객체 간의 동적인 관계
	5) 순서도 : 업무 순서도

지금까지 설계에 대해서 얘기한 것은 다 잊어라
(의천도룡기 : 장삼봉 - 장무기 태극검/태극권)
그냥 들어두면 나중에 자연스럽게 흘러나오게 되어있다.
여러분은 맘대로 짜라.
그냥 되기만 하면 ok

본인 성격
1)관리적 성격(이성적) : 큰 -> 작은 (하향식 설계)
	ex)소프트웨어 공학
	정형화, 스탠다드, 이해만 하면 어디서든 규격화(일 가능)
	설계 -> 구현
2)Free (충동적) : 작은 -> 큰(상향식 설계)
	ex)해커와 화가
	무형, 독특함, 맘에 맞는 사람이랑 일해(소규모 팀, 스튜디오)
	구현 -> 설계
 */

/* 데이터 그룹
 * MVC간에 주고 받는 데이터 꾸러미 (c언어의 구조체 역할) 
 * DTO(Data Transfer Object)
 * VO(Value Object)
 * TO(Trasfer Object)
 */
class Employee{
	private String companyNum;
	private String name;
	private String ssn;
	public Employee(String cNum, String name, String ssn) {
		this.companyNum = cNum;
		this.name = name;
		this.ssn = ssn;
	}
	
	public String getCompantNum() {
		return companyNum;
	}
	
	public String getName() {
		return name;
	}
	
	public String getssn() {
		return ssn;
	}
}

class EmployeeUI{
	private Scanner scanner = new Scanner(System.in);
	private EmployeeService service = new EmployeeService();
	
	public void regist() {
		System.out.println("[EmployeeUI] <신규 인사 정보 등록>");
		System.out.println("이름을 입력하세요");
		String name = scanner.nextLine();
		System.out.println("사번을 입력하세요");
		String cNum = scanner.nextLine();
		System.out.println("주민번호를 입력하세요");
		String ssn = scanner.nextLine();
		System.out.println("입력한 정보는 다음과 같습니다.");
		System.out.println(name + " : "+ cNum +" : "+  ssn);
		Employee emp = new Employee(cNum, name, ssn);
		boolean addResult = service.add(emp);
		System.out.println("서비스에서 처리된 결과: "+addResult);
	}
}

class EmployeeService{
	private EmployeeDAO dao = new EmployeeDAO();
	
	public boolean add(Employee emp) { //emp꾸러미를
		System.out.println("신규 인사정보를 추가하는 기능 테스트");
		System.out.println(emp.getName());
		System.out.println(emp.getCompantNum());
		System.out.println(emp.getssn()); //다 받은 다음에
		System.out.println("[EmployeeService] 디버그 : 서비스 객체에서 DAO객체에게 처리를 위임");
		boolean daoResult = dao.addNewEmployee(emp); //넘긴다
		return daoResult;
	}
}

class EmployeeDAO{
	private Employee[] arr = new Employee[100];
	private int index = 0;
	public boolean addNewEmployee(Employee newEmp) {
		boolean result = false;
		if(index >= arr.length -1)
			return false;
		arr[index] = newEmp;
		index++;
		result = true;
		System.out.println("[EmployeeDAO] 디버그 : DAO의 처리 결과"+ result);
		return result;
	}
	
}
public class ProjectOrder {
	public static void main(String[] args) {
		EmployeeUI ui = new EmployeeUI();
		ui.regist();
	}
}


