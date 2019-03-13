//증감연산자(++, --)
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
		
		//++num은 무조건 num을 1 증가해라
		num =10;
		int temp = ++num;
		System.out.println("num: "+num);
		System.out.println("temp: "+ temp);
		System.out.println("-----------------------");
		
		//일단 num은 기존값이고 내려갈 때 1 증가
		num =10;
		temp = num++;
		System.out.println("num: " + num);
		System.out.println("temp: " + temp);
		System.out.println("-----------------------");
		
		// -- 역시 ++과 동일하다
		
		num = 10;
		System.out.println(++num);
		num = 10;
		System.out.println(num++);
	}
}
