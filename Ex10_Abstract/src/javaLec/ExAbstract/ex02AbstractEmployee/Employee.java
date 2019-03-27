package javaLec.ExAbstract.ex02AbstractEmployee;

public abstract class Employee {
	protected String empno;
	protected String name;
	protected int pay;
	
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	public abstract double getMonthPay();
	
	/*objectŬ������ ����� ���� �޼���
	 * System.out.println(��ü);  //null or hashcode
	 * System.out.println(String ��ü); //���ڿ� ���� ->String class�� �ڵ� �����ε�
	 * ���� ��ü�� ������ hashcode ��� ���ϴ� ������ ǥ���ϰ� ���� �� Object�κ��� ��ӹ��� toString()�� Overriding �ؼ� �����ؼ� ����Ѵ�.
	*/
	public String toString() {
		return empno + ":" + name + ":" + pay;
	}
}
