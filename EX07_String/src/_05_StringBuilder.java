/* String클래스는 문자열의 변경이 불가능하다. 
 * 그래서 문자열이 변경되면 새로 할당한다.
 * 
 * StringBuilder클래스는 문자열의 변경이 가능하다. 
 * 내부에 char[]배열의 공간이 존재한다.
 * 문자열의 크기가 늘어나면 자동으로 증가시켜 준다.
 * StringBuffer도 마찬가지(단, 멀티쓰레드에 안전)
 * 
 * 구글에 Java String과 StringBuider 시간 비교
 */
public class _05_StringBuilder {
	public static void main(String[] args) {
		StringBuilder strBuf = new StringBuilder("AB");
		strBuf.append(25); //strBuf 내부에 배열을 증가시켜 추가
		System.out.println(strBuf); //AB25
		strBuf.append('Y').append(true);
		System.out.println(strBuf); //AB25Ytrue
		
		strBuf.insert(2, false); //인덱스2번에 false 넣기
		System.out.println(strBuf);//ABfalse25Ytrue
		strBuf.insert(strBuf.length(), 'z'); // append('z')랑 같음
		System.out.println(strBuf);//ABfalse25Ytruez
		}
}
