/* strBuf.append('Y').append(true); �� �ǹ̸� �˾ƺ���.
 * 
 */
class SimpleAdder{
	private int num;
	public SimpleAdder() {num =0;}
	//add�޼��尡 ���� ������ ������ �ִ�
	public SimpleAdder add(int num) {
		this.num += num;
		return this; //�޼��带 ȣ���� ��ü �ڽ�
	}
	
	public void showResult() {
		System.out.println("add result: "+num);
	}
}
public class _06_SelfReference {
	public static void main(String[] args) {
		SimpleAdder adder = new SimpleAdder();
		/* adder.add()�� adder �ڽ�(this)�� �����ϹǷ�
		 * adder1�� adder2�� adder3�� ��� ���� hashcode�� ������.
		 */
		//add(adder,1);
		
		//adder.add(1).add(3).add(5).showResult(); �̰� �� �ٰ� �ؿ� 4�ٰ� ����
		SimpleAdder adder1 = adder.add(1);
		SimpleAdder adder2= adder1.add(3);
		SimpleAdder adder3=adder2.add(5);
		adder3.showResult();
//		System.out.println(adder);
//		System.out.println(adder1);
//		System.out.println(adder2);
//		System.out.println(adder3); 4���� ���� �ؽ��ڵ尡 ���´�
	}
}
