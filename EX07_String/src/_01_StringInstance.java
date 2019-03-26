/*
 * 
 */
public class _01_StringInstance {
	public static void main(String[] args) {
		java.lang.String str = "My name is Sunny";
		int strLen1 = str.length();
		System.out.println("길이1: "+strLen1);
		
		int strLen2 = "한글의 길이는 어떻게?".length(); //내부적으로 string class로 인식된다.
		System.out.println("길이2: "+strLen2);
		
	}
}
