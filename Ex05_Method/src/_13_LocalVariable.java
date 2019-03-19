/*지역변수(Local Variable)은 {}중괄호 영역에 존재하는 변수
 *메서드가 호출되면 스택 메모리에 로딩된다
 *{}가 끝나면 스택에서 사라진다
 *해당 지역에서만 사용할 수 있고, 만약 다른 곳에 값을 넘기려면 return 사용해야한다
 */
public class _13_LocalVariable {
	public static void main(String[] args) {
		boolean scope = true;
		if(scope) {
			int num =1; //if의 변수
			num++;
			System.out.println(num);
		}else {
			int num = 5; //else의 변수
			System.out.println(num);
		}
		simple();
	}
	
	public static void simple() {
		int num =3; //simple의 변수
		System.out.println(num);
	}
}

//같은 num 이여도 각각의 변수라서 다 다른 변수이다.