//비교연산자 : 결과값이 true or false =>boolean형

public class _3_CompareOp {

	public static void main(String[] args) {
			//int x =10, y =20;
			int x = 10; int y = 20;
			
			System.out.println(x==y);
			boolean b = (x == y) ;
			System.out.println(b);
			b = (x != y);
			System.out.println(b);
			System.out.println(!true);
			System.out.println(!false);
			
			b = x > y;
			System.out.println(b);
			b =  x < y;
			System.out.println(b);
			b = x >= y ;
			System.out.println(b);
			b = x <= y;
			System.out.println(b);
	}

}
