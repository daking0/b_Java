
public class _03_StringCopy {
	public static void main(String[] args) {
		String str1 = "Lemon";
		String str2 = "Lemon";
		String str3 = new String(str2); //이렇게하면 다른 인스턴스
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		if(str1 == str2)
			System.out.println("동일 인스턴스 참조");
		else
			System.out.println("다른 인스턴스 참조");
		
		if(str1 == str3)
			System.out.println("동일 인스턴스 참조");
		else
			System.out.println("다른 인스턴스 참조");
	}
}

//동일 인스턴스 참조
//다른 인스턴스 참조