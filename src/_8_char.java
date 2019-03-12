
//char 문자 자료형(1글자) : 2byte
//Unicode를 저장
public class _8_char {
	public static void main(String[] args) {
		char a = 'A';
		char b = '가';
		System.out.println(a);
		System.out.println(b);
		
		//내부적으로 숫자
		int ia = a; 
		int ib = b;
		System.out.println(ia);//65
		System.out.println(ib);//44032
		
		//4byte를 2byte로 바꾸니까 강제로 진행해야함
		char c = (char)ia;
		char d = (char)ib;
		System.out.println(c);
		System.out.println(d);
	}
}
