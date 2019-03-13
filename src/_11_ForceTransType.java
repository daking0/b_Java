/*강제 형변환(명시적 형변환)
 * 큰 범위의 숫자를 작은 범위의 숫자로 담으려고 할 때
 * 그냥은 컴파일 과정에서 막아버리니까 
 * 필요하면 명시적으로 변환하겠다고 선언
 */
public class _11_ForceTransType {

	public static void main(String[] args) {
		//데이터가 잘리는 경우
//		int num =128;
//		byte bNum = (byte)num;
//		System.out.println(bNum);
		//같은 2바이트라도 short는 음수까지 있으므로 
		//char의 문자범위가 양수쪽으로 더 넓다
//		char ch = 'A';
//		short s = ch;
//		System.out.println(s);
		
		//같은 4byte이지만 실수인 float의 범위가 크다
		//int로 변경되면 소수점이 사라진다
//		float f = 13.3F;
//		int num = (int)f;
//		System.out.println(num);
		
		//long 8byte, float 4 byte 인데 실수의 범위가 더 크다 
		//표현범위가 float > long이므로 정상 동작
		long lval = 1234L;
		float fNum = lval;
		System.out.println(fNum);
	};

}
