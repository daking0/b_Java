//����������(++, --)
public class _2_PlusMinusOp {
	public static void main(String[] args) {
		int num = 10;
		num++;
		System.out.println(num);
		++num;
		System.out.println(num);
		num--;
		System.out.println(num);
		--num;
		System.out.println(num);
		System.out.println("-----------------------");
		
		//++num�� ������ num�� 1 �����ض�
		num =10;
		int temp = ++num;
		System.out.println("num: "+num);
		System.out.println("temp: "+ temp);
		System.out.println("-----------------------");
		
		//�ϴ� num�� �������̰� ������ �� 1 ����
		num =10;
		temp = num++;
		System.out.println("num: " + num);
		System.out.println("temp: " + temp);
		System.out.println("-----------------------");
		
		// -- ���� ++�� �����ϴ�
		
		num = 10;
		System.out.println(++num);
		num = 10;
		System.out.println(num++);
	}
}
