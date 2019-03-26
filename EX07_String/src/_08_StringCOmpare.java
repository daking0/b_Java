
public class _08_StringCOmpare {
	public static void main(String[] args) {
		String str1 = "Smart";
		String str2 = "Smart";
		String str3 = new String("Smart");
		String str4 = "Simple";
		
		if(str1 == str2)
			System.out.println("str1과 str2 인스턴스 같음"); //이거만 출력됨
		if(str1 == str3)
			System.out.println("str1과 str3 인스턴스 같음");
		if(str1 == str4)
			System.out.println("str1과 str4 인스턴스 같음");
		
		//문자열 내용 비교할 때는 반드시 equals를 사용
		if(str1.equals(str2))
			System.out.println("str1과 str2 문자열 같음"); //출력됨
		if(str1.equals(str3))
			System.out.println("str1과 str3 문자열 같음"); //출력됨
		if(str1.equals(str4))
			System.out.println("str1과 str4 문자열 같음");
		//다를 때
		if(!str1.equals(str4))
			System.out.println("str1과 str4 문자열 다름"); //출력됨
		if(str1.equals(str4) == false)
			System.out.println("str1과 str4 문자열 다름"); //출력됨
		
		/* compareTo 는 같은 문자열이면 0을 리턴
		 * 사전상 순서(알파벳 정렬순서) 앞에 위치하면 음수 / 뒤에 위치하면 양수를 리턴
		 */
		if(str1.compareTo(str2) == 0)
			System.out.println("str1과 str2 문자열 같음"); //출력
		if(str1.compareTo(str3)==0)
			System.out.println("str1과 str3 문자열 같음"); //출력
		
		int nCmp = str1.compareTo(str4);
		if(nCmp ==0)
			System.out.println("str1과 str4 문자열 같음");
		else if(nCmp <0)
			System.out.println("앞에 위치");
		else
			System.out.println("뒤에 위치"); //출력
		
		//다를 때
		if(str1.compareTo(str3)!=0)
			System.out.println("str1과 str3 문자열 다름"); 
	}
}
