/* String클래스는 작은 문자의 변화에도 계속 새로 객체(인스턴스)를 생성하게 된다.
 * = String에 다른 문자가 추가되면 새 인스턴스에 새로 저장한다.
 * 이런 작업이 빈번해지면 성능 저하의 요인이 된다.
 * 그래서 자바튜닝에서는 첫번째로 String클래스의 사용을 분석해서 보완한다.
 * 보완하는 방법
 * 1)StringBuilder
 * 2)StringBuffer : Thread-safe(멀티 Thread일 때 많이 사용)
 */
public class _04_StringAdd {
	public static void main(String[] args) {
		String str1 = "Lemon";
		String str2 = str1 + 'a'; //str1.concat('a')  ->concat은 ()의 문자를 추가한다는 것
		String str3 = str2 + 'b';
		String str4 = str3 + "cd";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
