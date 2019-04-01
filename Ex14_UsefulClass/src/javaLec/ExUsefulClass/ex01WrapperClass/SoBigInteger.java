package javaLec.ExUsefulClass.ex01WrapperClass;

import java.math.BigInteger;

public class SoBigInteger {
	public static void main(String[] args) {
		System.out.println("최대 정수: "+Long.MAX_VALUE);
		System.out.println("최대 정수: "+Long.MIN_VALUE);
		
		//int나 long을 넘어가는 범위의 연산을 해야하므로 문자열로 표현 할 수 밖에 없다
		BigInteger bigValue1 = new BigInteger("100000000000000000");
		BigInteger bigValue2 = new BigInteger("999999999999999999");
		
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);
		
		System.out.println("큰 수의 덧셈: "+addResult);
		System.out.println("큰 수의 곱셈: "+mulResult);
	}
}
