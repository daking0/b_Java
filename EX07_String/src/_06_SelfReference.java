/* strBuf.append('Y').append(true); 의 의미를 알아보자.
 * 
 */
class SimpleAdder{
	private int num;
	public SimpleAdder() {num =0;}
	//add메서드가 위의 예제와 관련이 있다
	public SimpleAdder add(int num) {
		this.num += num;
		return this; //메서드를 호출한 객체 자신
	}
	
	public void showResult() {
		System.out.println("add result: "+num);
	}
}
public class _06_SelfReference {
	public static void main(String[] args) {
		SimpleAdder adder = new SimpleAdder();
		/* adder.add()는 adder 자신(this)를 리턴하므로
		 * adder1과 adder2와 adder3는 모두 같은 hashcode를 가진다.
		 */
		//add(adder,1);
		
		//adder.add(1).add(3).add(5).showResult(); 이거 한 줄과 밑에 4줄과 같음
		SimpleAdder adder1 = adder.add(1);
		SimpleAdder adder2= adder1.add(3);
		SimpleAdder adder3=adder2.add(5);
		adder3.showResult();
//		System.out.println(adder);
//		System.out.println(adder1);
//		System.out.println(adder2);
//		System.out.println(adder3); 4개가 같은 해쉬코드가 나온다
	}
}
