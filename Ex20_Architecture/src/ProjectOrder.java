import java.util.Scanner;

/*
<������Ʈ ����>
1.���ȿ�û��

2.���ȼ�

3.�䱸���� �м�
	1) ���ͺ� - �䱸����(�ڱ⵵ �� �𸣰� �ϴ� ��Ⱑ ��ټ�)
	2) ����
	3) ȭ��
	
4.�䱸���� ����
	1) ������ �Ϸķ� �����Ѵ�.
	2) �䱸���� �߿� ���������� ���������� �з��Ѵ�.
	3) �䱸���� �߿� ���� �� �Ͱ� ���߿� �� ���� �з��Ѵ�.(1,2�ܰ� / 1,2,3�ܰ�)
	
5.�������̽��� ����
	����: �䱸������ �����Ѵ�
		 ���� �������� ���� ���� �������ϰų� �̸� ����ϱ� ���� ��ü ����ȭ
	1) �������̽� ���̾�׷�(�׸�) - ��ü�� ����������
		1) actor : �������̽��� �������̽��ϴ� �ܺ� ��� or �ý���
		2) usecase : actor�� �ý��۰� �ۿ��ϴ� ���
		3) association : ���Ϳ� usecase�� ���ü�
		4) �Ϲ�ȭ ���� : actor, usecase , ���� <-> Ư����
		5) include : usecase, �ݵ�� �ؾ��ϴ� ��, 1�ܰ� ����, �ʿ��ϸ� 2�ܰ� ����, ���� ����
					�ٸ� usecase���� ��������
		6) extend : usecase, �ݵ�� �� �ʿ�� ���� ��, Ư�� ���̽�, 1��
		
		* ������ ��
		* ����� �������� �� ��: ����ġ�� ��ȭ ��
		* �־�� ����� ����� ��: ���縦 ����ġ�� �߻�ȭ���� �� ��
		* �̸��� ���, ȫ�浿  <�Ϲ�ȸ��, ������
		* �������̽����� ����, ��ȯ, Ȯ�� < ������ �����Ѵ� (�־�,���� ��Ȯ�� ���)
		* ǥ���� ���� : �����Ѵ� = ��Ż�Ѵ� = ������  =>�����Ѵٷ� ����
		* �������̽� �Ը� �����ϰ� �Ѵ� : �������̽� ���̾�׷� ����
		* �������̽��� ������ �ý����� �䱸������ �м�/�ľ��ϱ� ���� �뵵
		* �׷��Ƿ� ū �׸��� �׸��µ� ������ �ִ�.
		* �׷��� ���� ������ ���� ������ ���̾Ʊ׷��� ������� ���ظ� ����ų �� �����Ƿ�,
		* �������̽� ���Ǽ��� �Բ� ����Ѵ�.
		
	2) �������̽� ���Ǽ�(����) - �� ����
	      �������̽� ���̾�׷����� ��ü������ Ȯ���� �� ���� ������ Ȯ���� �� �ְ� ���ش�.
	      �������̽� ���̾�׷����� ��ü ������ �����ϰ�, Ȯ���ϰ� ���� ��ü���� ������ �������̽� ���Ǽ��� ���� �����Ѵ�.
	      ���� ���� �� Testcase�׸�� Test Scenario�� Ȱ��ȴ�.
6.��Ű��ó ����(���μ����� �޽��� ����)
	1) ���μ����� �簢��, ������ �� or ȭ��ǥ �������� �޽��� ����
	2) ������ ���̾�׷����� ���μ��� ���� ��� ���踦 ǥ��
	
7.Ŭ���� ����
	1) ���� Ŭ���� �𵨸� - �̸��� ���踸 ����
	2) �� Ŭ���� �𵨸� - �ʵ�� �޼������ ����

8.Ŭ���� ���� ���
	1) ��� - ���� �����
		1-1) ��� �߿� ū ����� ���� �������� �з��Ѵ�.
		          ū ������ Ŭ������ �ĺ�
		          ���� ������ �ʵ��� �ĺ�
		1-2) �����߿� ū ����� ���� �������� �з��Ѵ�.
			  ū ������ Ŭ����(����� ����)�� �ĺ� 
			  ���� ������ �޼����� �ĺ�
			  
	2) MVC������ ������
		2-1) Model : �����͸� �������� �����ϴ� Ŭ����
		2-2) View : ����ڿ� �������̽� �ϴ� ȭ��
		2-3) Controller : ����Ͻ� ������ ����ϴ� Ŭ����

9.Ŭ���� ������ MVC
	1) ȭ��, ����, ��ǥ, ���� �����ϰ� �;��ϴ� Ŭ������ �����Ѵ�
	  => ������ ��ü(Domain Object)
   	   �������� �ʴ� �����ʹ� Ŭ������ �����Ѵ�.(�������� ���� �͵�)
   	  ex) Employee
   
   2) ����Ͻ� �������� ������ Ŭ������ �����Ѵ�.
      MVC �߿� C
      ~Service, ~Manager, ~Handler, ~Controller�� ���� �Ǿ��ִ�.
      DTO�� �ְ�ްų� ������ ó���Ѵ�.
   	    Ŭ�������� �����͸� �ְ�޴´��� �ǹ̴�? ������ �޼��� ȣ��
   	  ex) EmployeeService
   	   
   3) ȭ���� ����ϴ� Ŭ������ �����Ѵ�.
  	  MVC �߿� View
  	  ex) EmployeeUI
  	  
   4) �����͸� �����ϴ� Ŭ������ �����Ѵ�.
            ȭ���̳� ����Ͻ� ������ ����Ǿ ���������� �ּ����� ���游 ������ �� �ֵ��� �ϱ� ����
      MVC �߿� Model
      DAO(Data Access Object) : �����͸� �������� ó���ϴ� ��ü
      ex) EmployeeDAO

10.Ŭ���� ������ Tip
	1) �������� �ʴ� �����ʹ� Ŭ������ �����Ѵ�.
	2) �����͸� ó���ϴ� ������ Ŭ������ �����Ѵ�.
	3) ������ ���� ����� ��ɵ��� �ϳ��� Ŭ������ �����Ѵ�.
	   (Utility Class, static �޼��� ���)
	4) Ŭ������ 1���� ���ҿ� �����Ѵ�.
	      ���� ���� ���� ���� ó��, ���� �� ���� �ƴϸ� �ش� Ŭ������ ����

11.Ŭ���� ������ Tip2
	1) �ʵ�� private, �޼���� public�� �⺻���� �Ѵ�.
	2) �޼��� �߿� ���ο����� ���Ǵ� ���� private���� �Ѵ�.
	3) �ʵ��� ���� ������ getter~�� setter~ �޼���� �Ѵ�.
	4) ��Ű�� �������� ���ο��� ���Ǵ� ���� default ���ٱ�������, 
		��Ű�� �ܺο��� ���Ǵ� ���� public���� �����Ѵ�.
		
12.������Ʈ ����
	1) �䱸���� ������ ���� -> ����/���� ���� �з� -> �켱����
	2) �������̽� ���̾�׷�/ ���Ǽ� : ���û���
	3) Ŭ���� ���̾�׷� : Ŭ���� ���� ������ ����
	4) ������ ���̾�׷� : ��ü���� �޽��� ����(�޼��� ȣ��)�� �ð���
		                            ��ü ���� ������ ����
	5) ������ : ���� ������

���ݱ��� ���迡 ���ؼ� ����� ���� �� �ؾ��
(��õ����� : ���� - �幫�� �±ذ�/�±ر�)
�׳� ���θ� ���߿� �ڿ������� �귯������ �Ǿ��ִ�.
�������� ����� ¥��.
�׳� �Ǳ⸸ �ϸ� ok

���� ����
1)������ ����(�̼���) : ū -> ���� (����� ����)
	ex)����Ʈ���� ����
	����ȭ, ���Ĵٵ�, ���ظ� �ϸ� ��𼭵� �԰�ȭ(�� ����)
	���� -> ����
2)Free (�浿��) : ���� -> ū(����� ����)
	ex)��Ŀ�� ȭ��
	����, ��Ư��, ���� �´� ����̶� ����(�ұԸ� ��, ��Ʃ���)
	���� -> ����
 */

/* ������ �׷�
 * MVC���� �ְ� �޴� ������ �ٷ��� (c����� ����ü ����) 
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
		System.out.println("[EmployeeUI] <�ű� �λ� ���� ���>");
		System.out.println("�̸��� �Է��ϼ���");
		String name = scanner.nextLine();
		System.out.println("����� �Է��ϼ���");
		String cNum = scanner.nextLine();
		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
		String ssn = scanner.nextLine();
		System.out.println("�Է��� ������ ������ �����ϴ�.");
		System.out.println(name + " : "+ cNum +" : "+  ssn);
		Employee emp = new Employee(cNum, name, ssn);
		boolean addResult = service.add(emp);
		System.out.println("���񽺿��� ó���� ���: "+addResult);
	}
}

class EmployeeService{
	private EmployeeDAO dao = new EmployeeDAO();
	
	public boolean add(Employee emp) { //emp�ٷ��̸�
		System.out.println("�ű� �λ������� �߰��ϴ� ��� �׽�Ʈ");
		System.out.println(emp.getName());
		System.out.println(emp.getCompantNum());
		System.out.println(emp.getssn()); //�� ���� ������
		System.out.println("[EmployeeService] ����� : ���� ��ü���� DAO��ü���� ó���� ����");
		boolean daoResult = dao.addNewEmployee(emp); //�ѱ��
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
		System.out.println("[EmployeeDAO] ����� : DAO�� ó�� ���"+ result);
		return result;
	}
	
}
public class ProjectOrder {
	public static void main(String[] args) {
		EmployeeUI ui = new EmployeeUI();
		ui.regist();
	}
}


