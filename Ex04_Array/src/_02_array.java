/*힙에 올라가는 메모리는
 * JVM내의 Garbage Collector(쓰레기 수집기)에 의해 
 * 내부 알고리즘이 적용되어 알아서 해제된다.
 * kor이 가리키는 5개의 데이터 영역은 GC가 해제
 * 
 * 스택에 올라간 메모리는 해당 영역이 끝날 때 소멸된다.
 * -> Main 메서드가 끝날 때 stNum과 kor은 즉시 소멸 (그러나 이 값들 자체는 조금 더 늦게 소멸된다)
 */
public class _02_array {

	public static void main(String[] args) {
		int stNum = 5; //스택에 올라간다
		int[] kor = new int[5]; //힙에 올라간다.
		kor[0] = 88;
		kor[1] = 99;
		kor[2] = 90;
		kor[3] = 87;
		kor[4] = 79;
		
		//16진수 hashcode값
		//jvm에 의해 실제 공간을 접근하기 위해 해석되는 약속 숫자기호
		System.out.println(kor); //해시코드로 나온다. [I@15db9742  ->JVM만 해석 가능
		
	}
}
