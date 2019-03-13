//비트이동연산자: java에서 잘 안쓰임
//2dml 배수 단위의 계산을 할 때 가장 빠르다
public class _6_BItMoveOP {

	public static void main(String[] args) {
		//<<2배씩
		int x= 2;
		System.out.println(x << 1);
		System.out.println(x << 2);
		System.out.println(x << 3);
		// >> 1/2씩
		x = 64;
		System.out.println(x >> 1);
		System.out.println(x >> 2);
		System.out.println(x >> 3);
		
//		4
//		8
//		16
//		32
//		16
//		8
	}

}
