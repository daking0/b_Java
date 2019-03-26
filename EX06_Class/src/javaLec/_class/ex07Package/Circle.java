package javaLec._class.ex07Package;
/*1)�ʵ�� �Ϲ������� private���� �����Ѵ�
 *2)��� getter�� setter �޼��带 �̿��ؼ� ���� �ְų� ������ �� �ֵ��� �Ѵ�
 *  getter�� setter�� �Ϲ������� default �̳� public�� ����
 *3)setter�޼��忡�� ������ ���� Ȯ���ϴ� �ڵ带 ���� �� �ֱ� ������
 *  ���� �ʵ带 �����ϴ� �ͺ��� �������� ��������
 */

/*1)�޼���� �⺻������ default �̳� public�� ������ �Ѵ�.
 *->�ֳ��ϸ� ȣ���� �⺻���� �ϱ� ������.
 *2)�ٸ� �޼��� �߿��� ���ο����� �����ϴ� ���� �����Ƿ� �̷� �޼���� ������ �д�.(private, protected) 
 */
public class Circle {
	private double rad; //���� ���� ���ϵ��� 
	
	Circle(double r){
		rad = r;
	}
	
	public double getRad() { //get�� ���� ��������°�
		return rad; //private�̶� �������ϱ� get/set���� �θ��� ���� �� �ִ�
	}

	void setRad(double rad) { //set�� ���� �޴°�
		if(rad >0) //�߸��Ǵ� ��츦 ����
			this.rad = rad;
	}

	double circleArea() {
		return rad*rad*3.14;
	}
}
